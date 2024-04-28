package br.com.fiap.techchallenge.frameworks.web.product.impl;

import java.util.List;

import br.com.fiap.techchallenge.frameworks.web.product.FindProductByCategoryWeb;
import br.com.fiap.techchallenge.interfaces.controllers.product.FindProductByCategoryController;
import br.com.fiap.techchallenge.interfaces.controllers.product.responses.ProductResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
public class FindProductByCategoryWebImpl implements FindProductByCategoryWeb {

    private final FindProductByCategoryController findProductByCategoryController;

    public List<ProductResponse> findByCategory(final String category) {
        return findProductByCategoryController.findByCategory(category);
    }
}
