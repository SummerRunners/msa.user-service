package org.srunners.msa.user.dto

import org.srunners.msa.user.domain.User

data class UserResponse(
    val id: String?,
    val loginId: String,
    val password: String,
    val userName: String,
    val email: String
)

fun User.toResponse() = UserResponse(
    id = id,
    loginId = loginId,
    password = password,
    userName = userName,
    email = email
)