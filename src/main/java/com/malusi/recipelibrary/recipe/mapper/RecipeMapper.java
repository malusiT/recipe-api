package com.malusi.recipe.mapper;

import com.malusi.recipelibrary.recipe.entity.Recipe;
import com.malusi.recipelibrary.recipe.dto.RecipeDTO;

public class RecipeMapper{
  
  //Convert entity to DTO
  public static RecipeDTO toDTO(Recipe recipe){

    if(recipe == null) return null;

    RecipeDTO dto = new RecipeDTO();
    dto.setId(recipe.getId());
    dto.setName(recipe.getName());
    dto.setDescription(recipe.getDescription());
    dto.setIngredients(recipe.getIngredients());
    dto.setInstructions(recipe.getInstructions());
    dto.setDuration(recipe.getDuration());

    return dto;
  }

  // Convert DTO to Entity
    public static Recipe toRecipe(RecipeDTO dto) {

        if (dto == null) return null;
        Recipe recipe = new Recipe(); 

        recipe.setId(dto.getId());
        recipe.setName(dto.getName());
        recipe.setDescription(dto.getDescription());
        recipe.setIngredients(dto.getIngredients());
        recipe.setInstructions(dto.getInstructions());
        recipe.setDuration(dto.getDuration());

        return recipe;
    }


}
