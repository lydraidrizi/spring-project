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
        
        Recipe pasta = new Recipe(null, "Pasta", List.of("Noodles", "Tomato Sauce"), "Boil noodles, mix with sauce.");
        Recipe salad = new Recipe(null, "Greek Salad", List.of("Cucumber", "Tomato", "Feta Cheese"), "Mix all ingredients.");
        Recipe omelette = new Recipe(null, "Cheese Omelette", List.of("Eggs", "Cheese", "Butter"), "Whisk eggs, cook with butter, add cheese.");
        Recipe smoothie = new Recipe(null, "Berry Smoothie", List.of("Milk", "Banana", "Blueberries"), "Blend everything until smooth.");


        recipeRepository.saveAll(List.of(pasta, salad, omelette, smoothie));

        
        PantryItem flour = new PantryItem(null, "Flour", 5);
        PantryItem oliveOil = new PantryItem(null, "Olive Oil", 2);
        PantryItem eggs = new PantryItem(null, "Eggs", 12);
        PantryItem milk = new PantryItem(null, "Milk", 1);


        pantryItemRepository.saveAll(List.of(flour, oliveOil, eggs, milk));

        System.out.println("✅ Sample data initialized successfully!");
    }
}
