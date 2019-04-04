package org.hybrit.workshops.jx.services.snacks.review

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class ReviewQueryResolver(val reviewRepo: ReviewRepository) : GraphQLQueryResolver {

    fun reviews(snackId: String) : List<Review> {
        return reviewRepo
                .getReviewsBySnackId(snackId)
    }
}