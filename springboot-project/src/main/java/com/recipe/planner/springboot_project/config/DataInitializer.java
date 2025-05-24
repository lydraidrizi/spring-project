package com.recipe.planner.springboot_project.config;

import com.recipe.planner.springboot_project.model.Recipe;
import com.recipe.planner.springboot_project.model.PantryItem;
import com.recipe.planner.springboot_project.repository.RecipeRepository;
import com.recipe.planner.springboot_project.repository.PantryItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final RecipeRepository recipeRepository;
    private final PantryItemRepository pantryItemRepository;

    @Override
    public void run(String... args) {
        // Sample Recipes
        Recipe pasta = new Recipe(null, "Pasta", List.of("Noodles", "Tomato Sauce"), "Boil noodles, mix with sauce.");
        Recipe salad = new Recipe(null, "Greek Salad", List.of("Cucumber", "Tomato", "Feta Cheese"), "Mix all ingredients.");

        recipeRepository.saveAll(List.of(pasta, salad));

        // Sample Pantry Items
        PantryItem flour = new PantryItem(null, "Flour", 5);
        PantryItem oliveOil = new PantryItem(null, "Olive Oil", 2);

        pantryItemRepository.saveAll(List.of(flour, oliveOil));

        System.out.println("✅ Sample data initialized successfully!");
    }
}
