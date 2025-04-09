package org.srunners.msa.user.service

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import org.srunners.msa.user.domain.User
import org.srunners.msa.user.dto.*
import org.srunners.msa.user.repository.UserRepository

@Service
class UserService(private val userRepository: UserRepository) {

    fun createUser(request: CreateUserRequest): UserResponse {
        val user = userRepository.save(request.toEntity())
        return user.toResponse()
    }

    fun getUsersAll(): List<UserResponse> {
        val users = userRepository.findAll()
        return users.map(User::toResponse)
    }

    fun getUser(userNo: String): UserResponse {
        val user = userRepository.findById(userNo).orElseThrow {
            ResponseStatusException(HttpStatus.NOT_FOUND)
        }
        return user.toResponse()
    }

    fun searchUsers(condition: SearchUserCondition): List<UserResponse> {
        val users = getUsersAll()
        return users
    }
}