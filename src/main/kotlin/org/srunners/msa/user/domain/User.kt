package org.srunners.msa.user.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "users")
data class User(
    @Id val id: String? = null,
    val loginId: String,
    val password: String,
    val userName: String,
    val email: String,
    val createdAt: LocalDateTime = LocalDateTime.now()
)