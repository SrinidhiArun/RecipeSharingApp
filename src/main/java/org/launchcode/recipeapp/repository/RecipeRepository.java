package org.launchcode.recipeapp.repository;

import org.launchcode.recipeapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface RecipeRepository extends CrudRepository <Recipe, Integer> {
}
