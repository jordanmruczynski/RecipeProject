package pl.jordii.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jordii.recipeproject.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
