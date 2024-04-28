package br.com.fiap.techchallenge.interfaces.controllers.customer.requests;

public record CustomerRequest(String id,
                              String cpf,
                              String name,
                              String email) {
}
