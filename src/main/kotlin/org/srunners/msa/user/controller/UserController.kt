package org.srunners.msa.user.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.srunners.msa.user.model.User
import org.srunners.msa.user.service.UserService

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @GetMapping
    fun getAllUsers(): List<User> = userService.getAllUsers()

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: String): User = userService.getUser(id)

    @PostMapping
    fun createUser(@RequestBody user: User): User = userService.createUser(user)
}