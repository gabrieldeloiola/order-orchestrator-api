package br.com.gabriepessoa.orderorchestratorapi.controller;

import br.com.gabriepessoa.orderorchestratorapi.domain.Category;
import br.com.gabriepessoa.orderorchestratorapi.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<List<Category>> getCategory() {
        List<Category> listCategory = categoryService.getCategory();
        return ResponseEntity.ok().body(listCategory);
    }

    @GetMapping("{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long id) {
        Category categoryById = categoryService.getCategoryById(id);
        return ResponseEntity.ok().body(categoryById);
    }

    public ResponseEntity<Category> saveCategory(@RequestBody Category category){
        Category categoryObj = categoryService.saveCategory(category);
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryObj);
    }

}
