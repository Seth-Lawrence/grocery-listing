package com.wfd.recipes.repository;

import org.springframework.data.repository.CrudRepository;

import com.wfd.recipes.entity.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
