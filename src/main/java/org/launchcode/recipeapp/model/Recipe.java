package org.launchcode.recipeapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

@Entity
public class Recipe extends AbstractEntity{

    @NotBlank(message = "Title is required")
    private String recipeTitle;

    @NotBlank(message = "Recipe Description is required")
    private String recipeDescription;

    @NotBlank(message = "Time taken is required")
    private String  timeTaken;

    @NotNull(message = "How many does the recipe serve is required")
    private Integer serves;
    private String photoLink;
    private String recipeOrigin;

    @ElementCollection
    private List<String> ingredients;

    @ElementCollection
    private List<String> instructions;
    public Recipe() {
    }

    public Recipe( String recipeTitle, String recipeDescription, String timeTaken, int serves) {
        this.recipeTitle = recipeTitle;
        this.recipeDescription = recipeDescription;
        this.timeTaken = timeTaken;
        this.serves = serves;
    }

    public String getRecipeTitle() {
        return recipeTitle;
    }

    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }

    public String getRecipeDescription() {
        return recipeDescription;
    }

    public void setRecipeDescription(String recipeDescription) {
        this.recipeDescription = recipeDescription;
    }

    public String getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(String timeTaken) {
        this.timeTaken = timeTaken;
    }

    public Integer getServes() {
        return serves;
    }

    public void setServes(Integer serves) {
        this.serves = serves;
    }

    public String getRecipeOrigin() {
        return recipeOrigin;
    }

    public void setRecipeOrigin(String recipeOrigin) {
        this.recipeOrigin = recipeOrigin;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String>getInstructions() {
        return instructions;
    }

    public void setInstructions(List<String> instructions) {
        this.instructions = instructions;
    }
}
