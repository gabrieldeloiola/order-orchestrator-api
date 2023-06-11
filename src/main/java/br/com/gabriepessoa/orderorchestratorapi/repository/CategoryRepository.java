package br.com.gabriepessoa.orderorchestratorapi.repository;

import br.com.gabriepessoa.orderorchestratorapi.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
