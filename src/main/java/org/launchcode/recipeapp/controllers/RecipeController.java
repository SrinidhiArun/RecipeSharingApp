package org.launchcode.recipeapp.controllers;

import org.launchcode.recipeapp.model.Recipe;
import org.launchcode.recipeapp.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value= "recipe")
public class RecipeController {

    @Autowired
    RecipeRepository recipeRepository;

    @GetMapping(value= "create")
    public String displayCreateRecipeForm(Model model, HttpServletRequest request){

        model.addAttribute("actionUrl", request.getRequestURI());
        model.addAttribute("recipe", new Recipe());
        model.addAttribute("title", "Create Recipe");
       return "recipes/create-recipe";
    }

    @PostMapping(value= "create")
    public String processCreateRecipeForm(@Validated @ModelAttribute Recipe recipe, Errors errors, Model model){
          if(errors.hasErrors()){
              return "recipes/create-recipe";
          }
          recipeRepository.save(recipe);
          return "recipes/create-recipe";
    }

}
