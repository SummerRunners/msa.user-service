package org.srunners.msa.user.dto

import org.srunners.msa.user.domain.User

data class UserResponse(
    val userNo: String,
    val userId: String,
    val password: String,
    val userName: String,
    val email: String
)

fun User.toResponse() = UserResponse(
    userNo = userNo ?: "",
    userId = userId,
    password = password,
    userName = userName,
    email = email
)