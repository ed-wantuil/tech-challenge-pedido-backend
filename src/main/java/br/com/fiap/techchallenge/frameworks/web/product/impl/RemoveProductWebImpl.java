package br.com.fiap.techchallenge.frameworks.web.product.impl;

import br.com.fiap.techchallenge.frameworks.web.product.RemoveProductWeb;
import br.com.fiap.techchallenge.interfaces.controllers.product.RemoveProductController;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
public class RemoveProductWebImpl implements RemoveProductWeb {

    private final RemoveProductController productRemoveProductController;

    public void remove(final String id) {
        productRemoveProductController.remove(id);
    }
}
