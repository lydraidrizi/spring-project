package com.recipe.planner.springboot_project.controller;

import com.recipe.planner.springboot_project.model.PantryItem;
import com.recipe.planner.springboot_project.service.PantryItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pantry")
@RequiredArgsConstructor
public class PantryItemController {
    private final PantryItemService pantryItemService;

    @PostMapping
    public ResponseEntity<PantryItem> addPantryItem(@RequestBody PantryItem item) {
        return ResponseEntity.ok(pantryItemService.addPantryItem(item));
    }

    @GetMapping
    public ResponseEntity<List<PantryItem>> getAllPantryItems() {
        return ResponseEntity.ok(pantryItemService.getAllPantryItems());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PantryItem> getPantryItemById(@PathVariable Long id) {
        return pantryItemService.getPantryItemById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<PantryItem> updatePantryItem(@PathVariable Long id, @RequestBody PantryItem updatedItem) {
        return ResponseEntity.ok(pantryItemService.updatePantryItem(id, updatedItem));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePantryItem(@PathVariable Long id) {
        pantryItemService.deletePantryItem(id);
        return ResponseEntity.noContent().build();
    }
}
