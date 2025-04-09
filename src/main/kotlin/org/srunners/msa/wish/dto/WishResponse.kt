package org.srunners.msa.wish.dto

import org.srunners.msa.wish.domain.UserItemWish
import java.time.LocalDateTime

data class WishResponse(
    val id: Long?,
    val userId: String?,
    val itemId: String?,
    val createdAt: LocalDateTime?
)

fun UserItemWish.toResponse() = WishResponse(
    id = id,
    userId = userId,
    itemId = itemId,
    createdAt = createdAt
)
