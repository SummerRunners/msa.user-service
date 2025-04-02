package org.srunners.msa.user.repository

import org.springframework.data.mongodb.repository.MongoRepository
import org.srunners.msa.user.model.User

interface UserRepository : MongoRepository<User, String>