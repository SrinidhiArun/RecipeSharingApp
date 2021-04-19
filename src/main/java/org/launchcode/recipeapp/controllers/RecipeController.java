package org.launchcode.recipeapp.controllers;

import org.launchcode.recipeapp.model.Recipe;
import org.launchcode.recipeapp.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
       return "recipes/create-update-recipe";
    }

    @PostMapping(value= "create")
    public String processCreateRecipeForm(@Validated @ModelAttribute Recipe recipe, Errors errors, Model model){
          if(errors.hasErrors()){
              return "recipes/create-update-recipe";
          }
          recipeRepository.save(recipe);
          return "redirect:/recipe/view/"+recipe.getUniqueId();
    }

    @GetMapping(value = "view/{uniqueId}")
    public String displayRecipe(@PathVariable int uniqueId, Model model) {

        model.addAttribute("title", "Recipe In Detail");

        Optional<Recipe> result = recipeRepository.findById(uniqueId);
        if (result.isPresent()) {
            Recipe recipe = result.get();
            model.addAttribute(recipe);
        } else {
            model.addAttribute("message", "warning|No event found with id: " + Integer.toString(uniqueId));
        }

        return "recipes/view-recipe";
    }



}
