package com.recipe.planner.springboot_project.service;

import com.recipe.planner.springboot_project.model.PantryItem;
import com.recipe.planner.springboot_project.repository.PantryItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PantryItemService {
    private final PantryItemRepository pantryItemRepository;

    public PantryItem addPantryItem(PantryItem item) {
        return pantryItemRepository.save(item);
    }

    public List<PantryItem> getAllPantryItems() {
        return pantryItemRepository.findAll();
    }

    public Optional<PantryItem> getPantryItemById(Long id) {
        return pantryItemRepository.findById(id);
    }

    public PantryItem updatePantryItem(Long id, PantryItem updatedItem) {
        return pantryItemRepository.findById(id).map(item -> {
            item.setName(updatedItem.getName());
            item.setQuantity(updatedItem.getQuantity());
            return pantryItemRepository.save(item);
        }).orElseThrow(() -> new RuntimeException("Pantry item not found"));
    }

    public void deletePantryItem(Long id) {
        pantryItemRepository.deleteById(id);
    }
}
