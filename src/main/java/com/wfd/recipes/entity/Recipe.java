package com.wfd.recipes.entity;

import java.util.HashMap;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
// import lombok.Getter;
// import lombok.RequiredArgsConstructor;
// import lombok.Setter;



@Entity
@Table(name = "recipes")
public class Recipe {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NonNull
  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "category")
  private String category;

  @Column(name = "instructions")
  private String instructions;

  @Column(name = "picture")
  private String picture;

  @Column(name = "tags")
  private String tags = null;

  @Column(name = "youtube")
  private String youtube = null;

  @Column(name = "ingredient1")
  private String ingredient1 = null;

  @Column(name = "ingredient3")
  private String ingredient3 = null;

  @Column(name = "ingredient4")
  private String ingredient4 = null;

  @Column(name = "ingredient5")
  private String ingredient5 = null;

  @Column(name = "ingredient6")
  private String ingredient6 = null;

  @Column(name = "ingredient7")
  private String ingredient7 = null;

  @Column(name = "ingredient8")
  private String ingredient8 = null;

  @Column(name = "ingredient9")
  private String ingredient9 = null;

  @Column(name = "ingredient10")
  private String ingredient10 = null;

  @Column(name = "ingredient11")
  private String ingredient11 = null;

  @Column(name = "ingredient12")
  private String ingredient12 = null;

  @Column(name = "ingredient13")
  private String ingredient13 = null;

  @Column(name = "ingredient14")
  private String ingredient14 = null;

  @Column(name = "ingredient15")
  private String ingredient15 = null;

  @Column(name = "ingredient16")
  private String ingredient16 = null;

  @Column(name = "ingredient17")
  private String ingredient17 = null;

  @Column(name = "ingredient18")
  private String ingredient18 = null;

  @Column(name = "ingredient19")
  private String ingredient19 = null;

  @Column(name = "ingredient20")
  private String ingredient20 = null;

  @Column(name = "measurement1")
  private String measurement1 = null;

  @Column(name = "measurement3")
  private String measurement3 = null;

  @Column(name = "measurement4")
  private String measurement4 = null;

  @Column(name = "measurement5")
  private String measurement5 = null;

  @Column(name = "measurement6")
  private String measurement6 = null;

  @Column(name = "measurement7")
  private String measurement7 = null;

  @Column(name = "measurement8")
  private String measurement8 = null;

  @Column(name = "measurement9")
  private String measurement9 = null;

  @Column(name = "measurement10")
  private String measurement10 = null;

  @Column(name = "measurement11")
  private String measurement11 = null;

  @Column(name = "measurement12")
  private String measurement12 = null;

  @Column(name = "measurement13")
  private String measurement13 = null;

  @Column(name = "measurement14")
  private String measurement14 = null;

  @Column(name = "measurement15")
  private String measurement15 = null;

  @Column(name = "measurement16")
  private String measurement16 = null;

  @Column(name = "measurement17")
  private String measurement17 = null;

  @Column(name = "measurement18")
  private String measurement18 = null;

  @Column(name = "measurement19")
  private String measurement19 = null;

  @Column(name = "measurement20")
  private String measurement20 = null;

  public Recipe() {

  }

  public Recipe(HashMap<String, String> recipe) {

    this.name = recipe.get(name);
    this.category = recipe.get(name);
    this.instructions = recipe.get(instructions);
    this.picture = recipe.get(picture);
    this.tags = recipe.get(tags);
    this.youtube = recipe.get(youtube);
    this.ingredient1 = recipe.get(ingredient1);
    this.ingredient3 = recipe.get(ingredient3);
    this.ingredient4 = recipe.get(ingredient4);
    this.ingredient5 = recipe.get(ingredient5);
    this.ingredient6 = recipe.get(ingredient6);
    this.ingredient7 = recipe.get(ingredient7);
    this.ingredient8 = recipe.get(ingredient8);
    this.ingredient9 = recipe.get(ingredient9);
    this.ingredient10 = recipe.get(ingredient10);
    this.ingredient11 = recipe.get(ingredient11);
    this.ingredient12 = recipe.get(ingredient12);
    this.ingredient13 = recipe.get(ingredient13);
    this.ingredient14 = recipe.get(ingredient14);
    this.ingredient15 = recipe.get(ingredient15);
    this.ingredient16 = recipe.get(ingredient16);
    this.ingredient17 = recipe.get(ingredient17);
    this.ingredient18 = recipe.get(ingredient18);
    this.ingredient19 = recipe.get(ingredient19);
    this.ingredient20 = recipe.get(ingredient20);
    this.measurement1 = recipe.get(measurement1);
    this.measurement3 = recipe.get(measurement3);
    this.measurement4 = recipe.get(measurement4);
    this.measurement5 = recipe.get(measurement5);
    this.measurement6 = recipe.get(measurement6);
    this.measurement7 = recipe.get(measurement7);
    this.measurement8 = recipe.get(measurement8);
    this.measurement9 = recipe.get(measurement9);
    this.measurement10 = recipe.get(measurement10);
    this.measurement11 = recipe.get(measurement11);
    this.measurement12 = recipe.get(measurement12);
    this.measurement13 = recipe.get(measurement13);
    this.measurement14 = recipe.get(measurement14);
    this.measurement15 = recipe.get(measurement15);
    this.measurement16 = recipe.get(measurement16);
    this.measurement17 = recipe.get(measurement17);
    this.measurement18 = recipe.get(measurement18);
    this.measurement19 = recipe.get(measurement19);
    this.measurement20 = recipe.get(measurement20);
  }
}
