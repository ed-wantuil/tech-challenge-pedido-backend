package br.com.fiap.techchallenge.interfaces.controllers.product;

import java.util.List;

import br.com.fiap.techchallenge.interfaces.controllers.product.responses.ProductResponse;

public interface FindProductController {

    List<ProductResponse> find();
}
