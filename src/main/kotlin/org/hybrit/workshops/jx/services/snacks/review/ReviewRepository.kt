package org.hybrit.workshops.jx.services.snacks.review

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ReviewRepository: MongoRepository<Review, String> {
    fun getReviewsBySnackId(snackId: String): List<Review>
}