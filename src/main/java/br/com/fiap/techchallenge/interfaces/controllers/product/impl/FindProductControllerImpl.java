package br.com.fiap.techchallenge.interfaces.controllers.product.impl;

import java.util.List;

import br.com.fiap.techchallenge.application.usecases.product.FindProduct;
import br.com.fiap.techchallenge.interfaces.controllers.product.FindProductController;
import br.com.fiap.techchallenge.interfaces.controllers.product.converters.ProductToProductResponse;
import br.com.fiap.techchallenge.interfaces.controllers.product.responses.ProductResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
public class FindProductControllerImpl implements FindProductController {

    private final FindProduct productFind;

    private final ProductToProductResponse productToProductResponse;

    public List<ProductResponse> find() {
        final var products = productFind.find();

        return products.stream()
                .map(productToProductResponse::convert)
                .toList();
    }
}
