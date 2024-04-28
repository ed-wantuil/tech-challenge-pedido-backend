package br.com.fiap.techchallenge.interfaces.controllers.product;

import br.com.fiap.techchallenge.interfaces.controllers.product.requests.ProductRequest;
import br.com.fiap.techchallenge.interfaces.controllers.product.responses.ProductResponse;

public interface UpdateProductController {

    ProductResponse update(final String id, final ProductRequest productRequest);

}
