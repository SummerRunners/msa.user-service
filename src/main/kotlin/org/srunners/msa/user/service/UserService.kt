package org.srunners.msa.user.service

import org.springframework.stereotype.Service
import org.srunners.msa.user.model.User
import org.srunners.msa.user.repository.UserRepository

@Service
class UserService(private val userRepository: UserRepository) {

    fun getAllUsers(): List<User> = userRepository.findAll()

    fun getUser(id: String): User = userRepository.findById(id).orElseThrow()

    fun createUser(user: User): User = userRepository.save(user)
}