package br.com.fiap.techchallenge.interfaces.controllers.product.impl;

import br.com.fiap.techchallenge.application.usecases.product.RemoveProduct;
import br.com.fiap.techchallenge.interfaces.controllers.product.RemoveProductController;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
public class RemoveProductControllerImpl implements RemoveProductController {

    private final RemoveProduct productRemove;

    public void remove(final String id) {
        productRemove.remove(id);
    }
}
