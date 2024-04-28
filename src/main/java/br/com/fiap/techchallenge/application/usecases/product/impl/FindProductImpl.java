package br.com.fiap.techchallenge.application.usecases.product.impl;

import java.util.List;

import br.com.fiap.techchallenge.application.usecases.product.FindProduct;
import br.com.fiap.techchallenge.application.gateways.ProductGateway;
import br.com.fiap.techchallenge.domain.entities.Product;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FindProductImpl implements FindProduct {
    private final ProductGateway productGateway;

    @Override
    public List<Product> find() {
        return productGateway.find();
    }

}
