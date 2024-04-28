package br.com.fiap.techchallenge.application.usecases.product.impl;

import br.com.fiap.techchallenge.application.gateways.ProductGateway;
import br.com.fiap.techchallenge.application.usecases.product.CreateProduct;
import br.com.fiap.techchallenge.domain.entities.Product;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateProductImpl implements CreateProduct {
    private final ProductGateway productGateway;

    @Override
    public Product create(final Product product) {
        return productGateway.create(product);
    }

}
