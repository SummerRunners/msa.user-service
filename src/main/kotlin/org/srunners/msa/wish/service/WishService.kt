package org.srunners.msa.wish.service

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.server.ResponseStatusException
import org.srunners.msa.wish.domain.UserItemWish
import org.srunners.msa.wish.dto.*
import org.srunners.msa.wish.repository.UserItemWishRepository

@Service
class WishService(private val userItemWishRepository: UserItemWishRepository) {

    @Transactional
    fun createWish(request: CreateWishRequest): WishResponse {
        val wish = userItemWishRepository.save(request.toEntity())
        return wish.toResponse()
    }

    @Transactional(readOnly = true)
    fun getWishesAll(): List<WishResponse> {
        val wishes = userItemWishRepository.findAll()
        return wishes.map(UserItemWish::toResponse)
    }

    @Transactional
    fun deleteWish(request: DeleteWishRequest): Int {
        return when (val deleted = userItemWishRepository.deleteByUserIdAndItemId(request.userId, request.itemId)) {
            0 -> throw ResponseStatusException(HttpStatus.NOT_FOUND)
            1 -> deleted
            else -> throw ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "More than 1 wish")
        }
    }
}