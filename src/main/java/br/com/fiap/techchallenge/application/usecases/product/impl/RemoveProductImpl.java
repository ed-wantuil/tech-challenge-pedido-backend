package br.com.fiap.techchallenge.application.usecases.product.impl;

import br.com.fiap.techchallenge.application.usecases.product.RemoveProduct;
import br.com.fiap.techchallenge.application.gateways.ProductGateway;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RemoveProductImpl implements RemoveProduct {
    private final ProductGateway productGateway;

    @Override
    public void remove(final String id) {
        productGateway.remove(id);
    }
}
