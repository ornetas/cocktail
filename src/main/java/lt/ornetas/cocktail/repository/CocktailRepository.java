package lt.ornetas.cocktail.repository;

import lt.ornetas.cocktail.repository.model.Cocktail;
import org.springframework.data.repository.CrudRepository;

public interface CocktailRepository extends CrudRepository<Cocktail, Integer> {

    Iterable<Cocktail> findByNameLike(String name);
}
