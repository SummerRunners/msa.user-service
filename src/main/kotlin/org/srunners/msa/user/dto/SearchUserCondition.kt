package org.srunners.msa.user.dto

data class SearchUserCondition(
    val id: String? = null,
    val loginId: String? = null,
    val userName: String? = null,
    val email: String? = null
)