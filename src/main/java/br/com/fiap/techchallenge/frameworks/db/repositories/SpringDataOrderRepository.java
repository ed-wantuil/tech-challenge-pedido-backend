package br.com.fiap.techchallenge.frameworks.db.repositories;

import java.util.UUID;

import br.com.fiap.techchallenge.frameworks.db.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataOrderRepository extends JpaRepository<OrderEntity, UUID> {

}
