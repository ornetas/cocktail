package lt.ornetas.cocktail.service;

import lt.ornetas.cocktail.repository.CocktailRepository;
import lt.ornetas.cocktail.repository.model.Cocktail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CocktailService {

    @Autowired
    private CocktailRepository cocktailRepository;

    public List<Cocktail> getAllCocktails(){
        return (List<Cocktail>) cocktailRepository.findAll();
    }

    public List<Cocktail> getCocktailByNameLike(String cocktailName){
        return (List<Cocktail>) cocktailRepository.findByNameLike(cocktailName);
    }

}
