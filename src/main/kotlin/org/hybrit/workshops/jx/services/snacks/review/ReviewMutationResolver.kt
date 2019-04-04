package org.hybrit.workshops.jx.services.snacks.review

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class ReviewMutationResolver(val reviewRepo: ReviewRepository) : GraphQLMutationResolver {

    fun newReview(snackId: String, rating: Int, text: String): Review {
        return reviewRepo
                .save(Review(snackId, rating, text, LocalDateTime.now()))
    }
}