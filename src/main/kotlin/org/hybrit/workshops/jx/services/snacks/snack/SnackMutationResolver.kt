package org.hybrit.workshops.jx.services.snacks.snack

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import org.springframework.stereotype.Component

@Component
class SnackMutationResolver(val snackRepo: SnackRepository) : GraphQLMutationResolver {

    fun newSnack(name: String): Snack {
        return snackRepo
                .save(Snack(name = name))
    }

    fun deleteSnack(id: String): Boolean {
        snackRepo.deleteById(id)
        return true
    }
}