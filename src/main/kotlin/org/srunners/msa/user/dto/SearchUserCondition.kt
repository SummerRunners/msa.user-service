package org.srunners.msa.user.dto

data class SearchUserCondition(
    val userNo: String? = null,
    val userId: String? = null,
    val userName: String? = null,
    val email: String? = null
)