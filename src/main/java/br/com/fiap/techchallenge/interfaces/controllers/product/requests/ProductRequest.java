package br.com.fiap.techchallenge.interfaces.controllers.product.requests;

import lombok.Builder;


@Builder
public record ProductRequest(String id,
                             String name,
                             String category,
                             Double price,
                             String description,
                             String image) {

}
