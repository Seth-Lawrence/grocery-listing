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

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getInstructions() {
    return this.instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public String getPicture() {
    return this.picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public String getTags() {
    return this.tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public String getYoutube() {
    return this.youtube;
  }

  public void setYoutube(String youtube) {
    this.youtube = youtube;
  }

  public String getIngredient1() {
    return this.ingredient1;
  }

  public void setIngredient1(String ingredient1) {
    this.ingredient1 = ingredient1;
  }

  public String getIngredient3() {
    return this.ingredient3;
  }

  public void setIngredient3(String ingredient3) {
    this.ingredient3 = ingredient3;
  }

  public String getIngredient4() {
    return this.ingredient4;
  }

  public void setIngredient4(String ingredient4) {
    this.ingredient4 = ingredient4;
  }

  public String getIngredient5() {
    return this.ingredient5;
  }

  public void setIngredient5(String ingredient5) {
    this.ingredient5 = ingredient5;
  }

  public String getIngredient6() {
    return this.ingredient6;
  }

  public void setIngredient6(String ingredient6) {
    this.ingredient6 = ingredient6;
  }

  public String getIngredient7() {
    return this.ingredient7;
  }

  public void setIngredient7(String ingredient7) {
    this.ingredient7 = ingredient7;
  }

  public String getIngredient8() {
    return this.ingredient8;
  }

  public void setIngredient8(String ingredient8) {
    this.ingredient8 = ingredient8;
  }

  public String getIngredient9() {
    return this.ingredient9;
  }

  public void setIngredient9(String ingredient9) {
    this.ingredient9 = ingredient9;
  }

  public String getIngredient10() {
    return this.ingredient10;
  }

  public void setIngredient10(String ingredient10) {
    this.ingredient10 = ingredient10;
  }

  public String getIngredient11() {
    return this.ingredient11;
  }

  public void setIngredient11(String ingredient11) {
    this.ingredient11 = ingredient11;
  }

  public String getIngredient12() {
    return this.ingredient12;
  }

  public void setIngredient12(String ingredient12) {
    this.ingredient12 = ingredient12;
  }

  public String getIngredient13() {
    return this.ingredient13;
  }

  public void setIngredient13(String ingredient13) {
    this.ingredient13 = ingredient13;
  }

  public String getIngredient14() {
    return this.ingredient14;
  }

  public void setIngredient14(String ingredient14) {
    this.ingredient14 = ingredient14;
  }

  public String getIngredient15() {
    return this.ingredient15;
  }

  public void setIngredient15(String ingredient15) {
    this.ingredient15 = ingredient15;
  }

  public String getIngredient16() {
    return this.ingredient16;
  }

  public void setIngredient16(String ingredient16) {
    this.ingredient16 = ingredient16;
  }

  public String getIngredient17() {
    return this.ingredient17;
  }

  public void setIngredient17(String ingredient17) {
    this.ingredient17 = ingredient17;
  }

  public String getIngredient18() {
    return this.ingredient18;
  }

  public void setIngredient18(String ingredient18) {
    this.ingredient18 = ingredient18;
  }

  public String getIngredient19() {
    return this.ingredient19;
  }

  public void setIngredient19(String ingredient19) {
    this.ingredient19 = ingredient19;
  }

  public String getIngredient20() {
    return this.ingredient20;
  }

  public void setIngredient20(String ingredient20) {
    this.ingredient20 = ingredient20;
  }

  public String getMeasurement1() {
    return this.measurement1;
  }

  public void setMeasurement1(String measurement1) {
    this.measurement1 = measurement1;
  }

  public String getMeasurement3() {
    return this.measurement3;
  }

  public void setMeasurement3(String measurement3) {
    this.measurement3 = measurement3;
  }

  public String getMeasurement4() {
    return this.measurement4;
  }

  public void setMeasurement4(String measurement4) {
    this.measurement4 = measurement4;
  }

  public String getMeasurement5() {
    return this.measurement5;
  }

  public void setMeasurement5(String measurement5) {
    this.measurement5 = measurement5;
  }

  public String getMeasurement6() {
    return this.measurement6;
  }

  public void setMeasurement6(String measurement6) {
    this.measurement6 = measurement6;
  }

  public String getMeasurement7() {
    return this.measurement7;
  }

  public void setMeasurement7(String measurement7) {
    this.measurement7 = measurement7;
  }

  public String getMeasurement8() {
    return this.measurement8;
  }

  public void setMeasurement8(String measurement8) {
    this.measurement8 = measurement8;
  }

  public String getMeasurement9() {
    return this.measurement9;
  }

  public void setMeasurement9(String measurement9) {
    this.measurement9 = measurement9;
  }

  public String getMeasurement10() {
    return this.measurement10;
  }

  public void setMeasurement10(String measurement10) {
    this.measurement10 = measurement10;
  }

  public String getMeasurement11() {
    return this.measurement11;
  }

  public void setMeasurement11(String measurement11) {
    this.measurement11 = measurement11;
  }

  public String getMeasurement12() {
    return this.measurement12;
  }

  public void setMeasurement12(String measurement12) {
    this.measurement12 = measurement12;
  }

  public String getMeasurement13() {
    return this.measurement13;
  }

  public void setMeasurement13(String measurement13) {
    this.measurement13 = measurement13;
  }

  public String getMeasurement14() {
    return this.measurement14;
  }

  public void setMeasurement14(String measurement14) {
    this.measurement14 = measurement14;
  }

  public String getMeasurement15() {
    return this.measurement15;
  }

  public void setMeasurement15(String measurement15) {
    this.measurement15 = measurement15;
  }

  public String getMeasurement16() {
    return this.measurement16;
  }

  public void setMeasurement16(String measurement16) {
    this.measurement16 = measurement16;
  }

  public String getMeasurement17() {
    return this.measurement17;
  }

  public void setMeasurement17(String measurement17) {
    this.measurement17 = measurement17;
  }

  public String getMeasurement18() {
    return this.measurement18;
  }

  public void setMeasurement18(String measurement18) {
    this.measurement18 = measurement18;
  }

  public String getMeasurement19() {
    return this.measurement19;
  }

  public void setMeasurement19(String measurement19) {
    this.measurement19 = measurement19;
  }

  public String getMeasurement20() {
    return this.measurement20;
  }

  public void setMeasurement20(String measurement20) {
    this.measurement20 = measurement20;
  }

  public String getName() {
    return this.name;
  }
}
