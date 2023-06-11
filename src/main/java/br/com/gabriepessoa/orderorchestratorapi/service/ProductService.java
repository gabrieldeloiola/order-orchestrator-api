package br.com.gabriepessoa.orderorchestratorapi.service;

import br.com.gabriepessoa.orderorchestratorapi.domain.Product;
import br.com.gabriepessoa.orderorchestratorapi.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(UUID id) {
        return productRepository.findById(id);
    }
}
