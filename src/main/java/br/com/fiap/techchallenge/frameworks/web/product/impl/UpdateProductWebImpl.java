package br.com.fiap.techchallenge.frameworks.web.product.impl;

import br.com.fiap.techchallenge.frameworks.web.product.UpdateProductWeb;
import br.com.fiap.techchallenge.interfaces.controllers.product.UpdateProductController;
import br.com.fiap.techchallenge.interfaces.controllers.product.requests.ProductRequest;
import br.com.fiap.techchallenge.interfaces.controllers.product.responses.ProductResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UpdateProductWebImpl implements UpdateProductWeb {

    private final UpdateProductController updateProductController;

    public ProductResponse update(final String id, final ProductRequest productRequest) {

        return updateProductController.update(id, productRequest);
    }

}
