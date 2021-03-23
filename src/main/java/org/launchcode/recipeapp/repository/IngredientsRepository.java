package org.launchcode.recipeapp.repository;

import org.launchcode.recipeapp.model.Ingredients;
import org.springframework.data.repository.CrudRepository;

public interface IngredientsRepository extends CrudRepository<Ingredients, Integer> {
}
