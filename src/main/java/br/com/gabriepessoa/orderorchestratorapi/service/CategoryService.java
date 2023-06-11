package br.com.gabriepessoa.orderorchestratorapi.service;

import br.com.gabriepessoa.orderorchestratorapi.domain.Category;
import br.com.gabriepessoa.orderorchestratorapi.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getCategory() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long id) {
        Optional<Category> categoryId = categoryRepository.findById(id);
        return categoryId.get();
    }

    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }
}
