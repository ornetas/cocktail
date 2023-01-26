package lt.ornetas.cocktail.controller;

import lt.ornetas.cocktail.repository.model.Ingredient;
import lt.ornetas.cocktail.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/ingredientmapping") //localhost:8080/ingredientmapping

public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    // http://localhost:8080/ingredientmapping/test
    @GetMapping(path = "/test")
    public @ResponseBody String getTestPage() {
        return "This is some test from SPRING!";
    }

    // http://localhost:8080/ingredientmapping/ingredient/all
    @GetMapping(path = "/ingredient/all")
    public @ResponseBody List<Ingredient> getAllIngredients() {
        return ingredientService.getAllIngredients();
    }

    // http://localhost:8080/ingredientmapping/ingredient/like/cuba
    @GetMapping(path = "/ingredient/like/{name}")
    public @ResponseBody List<Ingredient> getIngredientByNameLike(@PathVariable String name) {
        return ingredientService.getIngredientByNameLike("%" + name + "%");
    }

}
