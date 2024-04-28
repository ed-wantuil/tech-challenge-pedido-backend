package br.com.fiap.techchallenge.frameworks.web.product.impl;

import br.com.fiap.techchallenge.frameworks.web.product.CreateProductWeb;
import br.com.fiap.techchallenge.interfaces.controllers.product.CreateProductController;
import br.com.fiap.techchallenge.interfaces.controllers.product.requests.ProductRequest;
import br.com.fiap.techchallenge.interfaces.controllers.product.responses.ProductResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateProductWebImpl implements CreateProductWeb {

    private final CreateProductController createProductController;

    public ProductResponse create(final ProductRequest productRequest) {
        return createProductController.create(productRequest);
    }
}
