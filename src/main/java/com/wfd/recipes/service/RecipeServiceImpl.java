package com.wfd.recipes.service;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;
import com.wfd.recipes.entity.Recipe;
import com.wfd.recipes.repository.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeService {


  private final RecipeRepository recipeRepository;

  public RecipeServiceImpl(RecipeRepository recipeRepository) {
    this.recipeRepository = recipeRepository;
  }


  @Override
  public Recipe getRecipe(Long id) {
    Optional<Recipe> recipeOptional = recipeRepository.findById(id);
    Recipe recipe = unwrapRecipe(recipeOptional, id);

    return recipe;
  }

  @Override
  public List<Recipe> getRecipes() {
   List<Recipe> recipes = (List<Recipe>)recipeRepository.findAll();

   return recipes;
  }

  static Recipe unwrapRecipe(Optional<Recipe> entity, Long recipeId) {
    if (entity.isPresent()) return entity.get();
    else throw new Error("Recipe not found");
  }
}