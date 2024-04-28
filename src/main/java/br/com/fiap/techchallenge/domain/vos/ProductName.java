package br.com.fiap.techchallenge.domain.vos;

import lombok.Builder;

@Builder
public record ProductName(String name) {
    public ProductName {
        validate(name);

    }

    private void validate(final String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
    }
}
