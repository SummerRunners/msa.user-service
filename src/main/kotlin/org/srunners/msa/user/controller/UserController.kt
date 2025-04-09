package org.srunners.msa.user.controller

import org.springframework.web.bind.annotation.*
import org.srunners.msa.user.dto.CreateUserRequest
import org.srunners.msa.user.dto.SearchUserCondition
import org.srunners.msa.user.dto.UserResponse
import org.srunners.msa.user.service.UserService

@RestController
@RequestMapping("/api/u/users")
class UserController(private val userService: UserService) {

    @PostMapping
    fun createUser(@RequestBody request: CreateUserRequest): UserResponse = userService.createUser(request)

    @GetMapping
    fun getUsers(@RequestBody condition: SearchUserCondition): List<UserResponse> = userService.getUsers(condition)

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: String): UserResponse = userService.getUser(id)
}