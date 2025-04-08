package org.srunners.msa.wish.service

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.srunners.msa.wish.domain.UserItemWish
import org.srunners.msa.wish.dto.CreateWishRequest
import org.srunners.msa.wish.dto.WishResponse
import org.srunners.msa.wish.dto.toEntity
import org.srunners.msa.wish.dto.toResponse
import org.srunners.msa.wish.repository.UserItemWishRepository

@Service
class WishService(private val userItemWishRepository: UserItemWishRepository) {

    @Transactional
    fun createWish(request: CreateWishRequest): WishResponse {
        val wish = userItemWishRepository.save(request.toEntity())
        return wish.toResponse()
    }

    @Transactional(readOnly = true)
    fun getWishes(): List<WishResponse> {
        val wishes = getWishesAll()
        return wishes
    }

    @Transactional(readOnly = true)
    fun getWishesAll(): List<WishResponse> {
        val wishes = userItemWishRepository.findAll()
        return wishes.map(UserItemWish::toResponse)
    }
}