package org.srunners.msa.wish.domain

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.Instant

@Entity
@Table(name = "user_item_wishes")
@EntityListeners(AuditingEntityListener::class)
open class UserItemWish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long? = null

    @Column(name = "user_id", nullable = false, length = Integer.MAX_VALUE)
    open var userId: String? = null

    @Column(name = "item_id", nullable = false, length = Integer.MAX_VALUE)
    open var itemId: String? = null

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    open var createdAt: Instant? = null

    override fun equals(other: Any?): Boolean =
        this === other || (other is UserItemWish && id != null && id == other.id)

    override fun hashCode(): Int = id?.hashCode() ?: 0
}