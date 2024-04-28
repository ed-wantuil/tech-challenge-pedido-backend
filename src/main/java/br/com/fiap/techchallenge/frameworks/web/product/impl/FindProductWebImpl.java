package br.com.fiap.techchallenge.frameworks.web.product.impl;

import java.util.List;

import br.com.fiap.techchallenge.frameworks.web.product.FindProductWeb;
import br.com.fiap.techchallenge.interfaces.controllers.product.FindProductController;
import br.com.fiap.techchallenge.interfaces.controllers.product.responses.ProductResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FindProductWebImpl implements FindProductWeb {

    private final FindProductController findProductController;

    public List<ProductResponse> find() {
        return findProductController.find();
    }
}
