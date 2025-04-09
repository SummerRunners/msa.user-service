package org.srunners.msa.wish.dto

data class DeleteWishRequest(
    val userId: String,
    val itemId: String
)