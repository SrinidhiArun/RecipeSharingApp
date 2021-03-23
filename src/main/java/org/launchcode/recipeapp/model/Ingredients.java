package org.launchcode.recipeapp.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Ingredients extends AbstractEntity{
    @NotBlank(message = "Ingredient name is required")
    private String name;

    @NotBlank(message = "Ingredient quantity is required")
    private String quantity;

    @ManyToOne
    private Recipe recipe;

    public Ingredients() {
    }

    public Ingredients(@NotBlank(message = "Ingredient name is required") String name, @NotBlank(message = "Ingredient quantity is required") String quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
