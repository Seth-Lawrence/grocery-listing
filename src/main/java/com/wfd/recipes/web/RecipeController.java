package com.wfd.recipes.web;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.wfd.recipes.entity.Recipe;
import com.wfd.recipes.service.RecipeService;

import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/recipe")
public class RecipeController {

  @Autowired
  private final RecipeService RecipeService;

  public RecipeController(RecipeService RecipeService) {
    this.RecipeService = RecipeService;
  }


  @GetMapping("/all")
  public ResponseEntity<List<Recipe>> getRecipes() {

    System.out.println(RecipeService.getRecipes());

    return new ResponseEntity<>(RecipeService.getRecipes(), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Recipe> getRecipe(@PathVariable Long id) {

    return new ResponseEntity<>(RecipeService.getRecipe(id),HttpStatus.OK);
  }
}
