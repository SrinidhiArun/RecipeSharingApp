package org.launchcode.recipeapp.repository;

import org.launchcode.recipeapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository <Recipe, Integer> {
}
