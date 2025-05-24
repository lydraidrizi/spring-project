package com.recipe.planner.springboot_project.service;

import com.recipe.planner.springboot_project.model.Recipe;
import com.recipe.planner.springboot_project.repository.RecipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RecipeService {
    private final RecipeRepository recipeRepository;

    public Recipe addRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    public Optional<Recipe> getRecipeById(Long id) {
        return recipeRepository.findById(id);
    }

    public Recipe updateRecipe(Long id, Recipe updatedRecipe) {
        return recipeRepository.findById(id).map(recipe -> {
            recipe.setName(updatedRecipe.getName());
            recipe.setIngredients(updatedRecipe.getIngredients());
            recipe.setInstructions(updatedRecipe.getInstructions());
            return recipeRepository.save(recipe);
        }).orElseThrow(() -> new RuntimeException("Recipe not found"));
    }

    public void deleteRecipe(Long id) {
        recipeRepository.deleteById(id);
    }
}
