package br.com.fiap.techchallenge.application.usecases.product.impl;

import br.com.fiap.techchallenge.application.gateways.ProductGateway;
import br.com.fiap.techchallenge.application.usecases.product.UpdateProduct;
import br.com.fiap.techchallenge.domain.entities.Product;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UpdateProductImpl implements UpdateProduct {
    private final ProductGateway productGateway;

    @Override
    public Product update(final String id, final Product product) {
        return productGateway.update(id, product);
    }

}
