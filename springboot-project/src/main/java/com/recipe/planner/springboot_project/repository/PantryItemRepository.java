package com.recipe.planner.springboot_project.repository;

import com.recipe.planner.springboot_project.model.PantryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PantryItemRepository extends JpaRepository<PantryItem, Long> {
}
