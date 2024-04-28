package br.com.fiap.techchallenge.interfaces.controllers.product.impl;

import java.util.List;

import br.com.fiap.techchallenge.application.usecases.product.FindProductByCategory;
import br.com.fiap.techchallenge.interfaces.controllers.product.FindProductByCategoryController;
import br.com.fiap.techchallenge.interfaces.controllers.product.converters.ProductToProductResponse;
import br.com.fiap.techchallenge.interfaces.controllers.product.responses.ProductResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
public class FindProductByCategoryControllerImpl implements FindProductByCategoryController {

    private final FindProductByCategory productFindByCategory;

    private final ProductToProductResponse productToProductResponse;

    public List<ProductResponse> findByCategory(final String category) {
        final var products = productFindByCategory.findByCategory(category);

        return products.stream()
                .map(productToProductResponse::convert)
                .toList();
    }
}
