package lt.ornetas.cocktail.controller;

import lt.ornetas.cocktail.repository.model.Cocktail;
import lt.ornetas.cocktail.service.CocktailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/cocktailmapping") //localhost:8080/cocktailmapping

public class CocktailController {

    @Autowired
    private CocktailService cocktailService;

    // http://localhost:8080/cocktailmapping/cocktail/all
    @GetMapping(path = "/cocktail/all")
    public @ResponseBody List<Cocktail> getAllCocktails() {
        return cocktailService.getAllCocktails();
    }

    // http://localhost:8080/cocktailmapping/cocktail/like/lime
    @GetMapping(path = "/cocktail/like/{name}")
    public @ResponseBody List<Cocktail> getCocktailByNameLike(@PathVariable String name) {
        return cocktailService.getCocktailByNameLike("%" + name + "%");
    }
}
