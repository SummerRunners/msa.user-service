package org.srunners.msa.wish.dto

import org.srunners.msa.wish.domain.UserItemWish

data class CreateWishRequest(
    val userId: String,
    val itemId: String
)

fun CreateWishRequest.toEntity(): UserItemWish = UserItemWish().apply {
    this.userId = this@toEntity.userId
    this.itemId = this@toEntity.itemId
}