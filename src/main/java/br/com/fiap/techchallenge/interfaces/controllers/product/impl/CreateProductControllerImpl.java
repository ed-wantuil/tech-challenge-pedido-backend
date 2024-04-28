package br.com.fiap.techchallenge.interfaces.controllers.product.impl;

import br.com.fiap.techchallenge.application.usecases.product.CreateProduct;
import br.com.fiap.techchallenge.interfaces.controllers.product.CreateProductController;
import br.com.fiap.techchallenge.interfaces.controllers.product.converters.ProductRequestToProduct;
import br.com.fiap.techchallenge.interfaces.controllers.product.converters.ProductToProductResponse;
import br.com.fiap.techchallenge.interfaces.controllers.product.requests.ProductRequest;
import br.com.fiap.techchallenge.interfaces.controllers.product.responses.ProductResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
public class CreateProductControllerImpl implements CreateProductController {

    private final CreateProduct productCreate;

    private final ProductRequestToProduct productRequestToProduct;

    private final ProductToProductResponse productToProductResponse;

    public ProductResponse create(final ProductRequest productRequest) {
        log.info("Creating product {}", productRequestToProduct);

        var product = productRequestToProduct.convert(productRequest);

        product = productCreate.create(product);

        return productToProductResponse.convert(product);
    }
}
