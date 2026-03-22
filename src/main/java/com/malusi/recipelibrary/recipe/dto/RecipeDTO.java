package com.malusi.recipelibrary.recipe.dto;

import java.util.List;

public class RecipeDTO{
  
  private Long id;
  private String name;
  private String description;
  private List<String> ingredients;
  private List<String> instructions;
  private int duration;
  
  //No args Constructor
  public RecipeDTO(){}

  //All Args Constructor
  public RecipeDTO(Long id, String name, String description, List<String> ingredients, List<String> instructions,int duration){
    this.id = id;
    this.name = name;
    this.description = description;
    this.ingredients = ingredients;
    this.instructions = instructions;
    this.duration = duration;
  }

  //Getters and Setters
  public Long getId(){
    return id;
  }

  public void setId(Long id){
    this.id = id;
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getDescription(){
    return description;
  }

  public void setDescription(String description){
    this.description = description;
  }

  public List<String> getIngredients(){
    return ingredients;
  }

  public void setIngredients(List<String> ingredients){
    this.ingredients = ingredients;
  }


  public List<String> getInstructions(){
    return instructions;
  }

  public void setInstructions(List<String> instructions){
    this.instructions = instructions;
  }

  public int getDuration(){
    return duration;
  }

  public void setDuration(int duration){
    this.duration = duration;
  }




}
