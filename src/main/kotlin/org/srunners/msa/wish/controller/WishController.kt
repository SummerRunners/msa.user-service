package org.srunners.msa.wish.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.srunners.msa.wish.dto.CreateWishRequest
import org.srunners.msa.wish.dto.WishResponse
import org.srunners.msa.wish.service.WishService

@RestController
@RequestMapping("/api/u/wishes")
class WishController(private val wishService: WishService) {

    @PostMapping("/{userId}/{itemId}")
    fun createWish(@PathVariable userId: String, @PathVariable itemId: String): WishResponse = wishService.createWish(CreateWishRequest(userId, itemId))

    @GetMapping
    fun getWishes(): List<WishResponse> = wishService.getWishes()
}