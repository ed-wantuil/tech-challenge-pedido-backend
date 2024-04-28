package br.com.fiap.techchallenge.application.gateways;

import java.util.List;

import br.com.fiap.techchallenge.domain.entities.Product;

public interface ProductGateway {
    List<Product> find();

    List<Product> findByCategory(String category);

    Product create(Product product);

    Product update(String id, Product product);

    void remove(String id);
}
