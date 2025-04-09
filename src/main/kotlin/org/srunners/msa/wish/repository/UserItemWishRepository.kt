package org.srunners.msa.wish.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.srunners.msa.wish.domain.UserItemWish

interface UserItemWishRepository : JpaRepository<UserItemWish, Long> {

    fun deleteByUserIdAndItemId(userId: String, itemId: String): Int
}