package lt.ornetas.cocktail.service;

import lt.ornetas.cocktail.repository.CocktailRepository;
import lt.ornetas.cocktail.repository.IngredientRepository;
import lt.ornetas.cocktail.repository.model.Cocktail;
import lt.ornetas.cocktail.repository.model.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {

    @Autowired
    private IngredientRepository ingredientRepository;

    public List<Ingredient> getAllIngredients(){
        return (List<Ingredient>) ingredientRepository.findAll();
    }

    public List<Ingredient> getIngredientByNameLike(String ingredientName){
        return (List<Ingredient>) ingredientRepository.findByNameLike(ingredientName);
    }
}
