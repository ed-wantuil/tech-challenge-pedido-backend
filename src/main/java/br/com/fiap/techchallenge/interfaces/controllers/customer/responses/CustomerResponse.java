package br.com.fiap.techchallenge.interfaces.controllers.customer.responses;

import lombok.Builder;

@Builder
public record CustomerResponse(String id,
                               String cpf,
                               String name,
                               String email) {
}
