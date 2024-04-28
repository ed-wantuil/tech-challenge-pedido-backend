package br.com.fiap.techchallenge.interfaces.controllers.product.impl;

import br.com.fiap.techchallenge.application.usecases.product.UpdateProduct;
import br.com.fiap.techchallenge.interfaces.controllers.product.UpdateProductController;
import br.com.fiap.techchallenge.interfaces.controllers.product.converters.ProductRequestToProduct;
import br.com.fiap.techchallenge.interfaces.controllers.product.converters.ProductToProductResponse;
import br.com.fiap.techchallenge.interfaces.controllers.product.requests.ProductRequest;
import br.com.fiap.techchallenge.interfaces.controllers.product.responses.ProductResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
public class UpdateProductControllerImpl implements UpdateProductController {

    private final UpdateProduct productUpdate;

    private final ProductRequestToProduct productRequestToProduct;

    private final ProductToProductResponse productToProductResponse;

    public ProductResponse update(final String id, final ProductRequest productRequest) {

        log.info("Updating product {}", productRequest);

        var product = productRequestToProduct.convert(productRequest);
        product = productUpdate.update(id, product);

        return productToProductResponse.convert(product);
    }

}
