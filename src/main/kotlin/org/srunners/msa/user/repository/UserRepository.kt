package org.srunners.msa.user.repository

import org.springframework.data.mongodb.repository.MongoRepository
import org.srunners.msa.user.domain.User

interface UserRepository : MongoRepository<User, String>