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
        return ResponseEntity.ok().body(categoryService.getCategory());
    }

    @GetMapping("{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long id) {
        return ResponseEntity.ok().body(categoryService.getCategoryById(id));
    }

    @PostMapping
    public ResponseEntity<Category> saveCategory(@RequestBody Category category){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(categoryService.saveCategory(category));
    }

}
