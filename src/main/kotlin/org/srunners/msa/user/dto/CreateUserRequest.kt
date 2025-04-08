package org.srunners.msa.user.dto

import org.srunners.msa.user.domain.User

data class CreateUserRequest(
    val loginId: String,
    val password: String,
    val userName: String,
    val email: String
)

fun CreateUserRequest.toEntity(): User = User(
    loginId = this.loginId,
    password = this.password,
    userName = this.userName,
    email = this.email
)