package org.hybrit.workshops.jx.services.snacks.snack

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.hybrit.workshops.jx.services.snacks.review.ReviewRepository
import org.springframework.stereotype.Component

@Component
class SnackQueryResolver(
        val snackRepo: SnackRepository,
        val reviewRepo: ReviewRepository) : GraphQLQueryResolver {

    fun snacks(): List<Snack> {
        return snackRepo
                .findAll()
                .map { it.reviews = reviewRepo.getReviewsBySnackId(it.id); it }
    }
}