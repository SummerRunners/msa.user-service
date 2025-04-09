package org.srunners.msa.user.dto

import org.srunners.msa.user.domain.User
import java.time.LocalDateTime

data class UserResponse(
    val id: String?,
    val loginId: String,
    val password: String,
    val userName: String,
    val email: String,
    val createdAt: LocalDateTime
)

fun User.toResponse() = UserResponse(
    id = id,
    loginId = loginId,
    password = password,
    userName = userName,
    email = email,
    createdAt = createdAt
)