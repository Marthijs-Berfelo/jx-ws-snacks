package org.hybrit.workshops.jx.services.snacks.snack

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface SnackRepository: MongoRepository<Snack, String>