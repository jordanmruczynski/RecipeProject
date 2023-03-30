package pl.jordii.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jordii.recipeproject.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
