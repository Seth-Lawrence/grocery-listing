package com.wfd.recipes.service;

import java.util.List;

import com.wfd.recipes.entity.Recipe;

public interface RecipeService {
  Recipe getRecipe(Long id);
  List<Recipe> getRecipes();
}
