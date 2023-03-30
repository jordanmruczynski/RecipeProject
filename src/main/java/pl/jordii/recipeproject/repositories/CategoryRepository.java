package pl.jordii.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jordii.recipeproject.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
