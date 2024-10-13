package com.wfd.recipes.web;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.wfd.recipes.entity.Recipe;
import com.wfd.recipes.service.RecipeService;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class RecipeController {

  RecipeService recipeService;

  @GetMapping("/all")
  public ResponseEntity<List<Recipe>> getRecipes() {

    return new ResponseEntity<>(recipeService.getRecipes(), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Recipe> getRecipe(@PathVariable Long id) {

    return new ResponseEntity<>(recipeService.getRecipe(id),HttpStatus.OK);
  }
}
