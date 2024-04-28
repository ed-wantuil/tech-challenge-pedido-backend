package br.com.fiap.techchallenge.domain.vos;

public record CustomerName(String name) {
    public CustomerName {
        validate(name);

    }

    private void validate(final String name) {
        if (name == null || name.isEmpty()) {
            return;
        }

        if (name.length() < 3) {
            throw new IllegalArgumentException("Name must have at least 3 characters");
        }
    }
}
