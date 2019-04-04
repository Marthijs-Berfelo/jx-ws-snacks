package org.hybrit.workshops.jx.services.snacks.snack

import org.hybrit.workshops.jx.services.snacks.review.Review
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "snack")
data class Snack(
        @Id val id: String = UUID.randomUUID().toString(),
        val name: String
) {

    @Transient
    var reviews: List<Review> = ArrayList()
}