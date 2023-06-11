package br.com.gabriepessoa.orderorchestratorapi.repository;

import br.com.gabriepessoa.orderorchestratorapi.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
