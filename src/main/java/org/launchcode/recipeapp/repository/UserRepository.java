package org.launchcode.recipeapp.repository;

import org.launchcode.recipeapp.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
