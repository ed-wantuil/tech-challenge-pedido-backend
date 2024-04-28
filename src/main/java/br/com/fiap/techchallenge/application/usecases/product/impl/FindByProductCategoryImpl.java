package br.com.fiap.techchallenge.application.usecases.product.impl;

import java.util.List;

import br.com.fiap.techchallenge.application.usecases.product.FindProductByCategory;
import br.com.fiap.techchallenge.application.gateways.ProductGateway;
import br.com.fiap.techchallenge.domain.entities.Product;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FindByProductCategoryImpl implements FindProductByCategory {
    private final ProductGateway productGateway;

    @Override
    public List<Product> findByCategory(final String category) {
        return productGateway.findByCategory(category);
    }

}
