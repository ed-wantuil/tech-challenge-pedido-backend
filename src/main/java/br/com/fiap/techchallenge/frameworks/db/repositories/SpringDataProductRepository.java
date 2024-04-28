package br.com.fiap.techchallenge.frameworks.db.repositories;

import java.util.List;
import java.util.UUID;

import br.com.fiap.techchallenge.frameworks.db.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataProductRepository extends JpaRepository<ProductEntity, UUID> {
    List<ProductEntity> findByCategory(String category);
}
