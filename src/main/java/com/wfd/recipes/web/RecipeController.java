package com.wfd.recipes.web;

import org.springframework.web.bind.annotation.RestController;

import com.wfd.recipes.service.RecipeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class RecipeController {

  RecipeService recipeService;

  @GetMapping("/all")
  public String getMethodName(@RequestParam String param) {
      return new String();
  }

  @GetMapping("/{id}")
  public String getMethodName(@RequestParam String param) {
      return new String();
  }



}
