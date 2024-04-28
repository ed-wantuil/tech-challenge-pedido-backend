package br.com.fiap.techchallenge.interfaces.controllers.product.responses;

import lombok.Builder;

@Builder
public record ProductResponse(String id,
                              String name,
                              String category,
                              Double price,
                              String description,
                              String image) {
}
