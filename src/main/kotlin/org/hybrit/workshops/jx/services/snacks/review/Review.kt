package org.hybrit.workshops.jx.services.snacks.review

import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "review")
data class Review(
        var snackId: String,
        var rating: Int,
        var text: String,
        var created: LocalDateTime
)
