package org.srunners.msa.user.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "users")
data class User(
    @Id val userNo: String? = null,
    val userId: String,
    val password: String,
    val userName: String,
    val email: String
)