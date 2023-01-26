package lt.ornetas.cocktail.repository;

import lt.ornetas.cocktail.repository.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {

    Iterable<Ingredient> findByNameLike(String name);
}
