package org.launchcode.recipeapp.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class RecipeInstructions {
    @NotBlank(message = "Step number is required")
    private Integer step;

    @NotBlank(message = "Directions is required")
    @Size(max=230)
    private String directions;


    private Recipe recipe;

    public RecipeInstructions() {
    }

    public RecipeInstructions(@NotBlank(message = "Step number is required") Integer step, @NotBlank(message = "Directions is required") String directions) {
        this.step = step;
        this.directions = directions;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
