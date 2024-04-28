package br.com.fiap.techchallenge.domain.vos;

public record ProductDescription(String description) {

    public ProductDescription {
        validate(description);

    }

    private void validate(final String description) {
        if (description == null) {
            throw new IllegalArgumentException("Description cannot be null");
        }
    }
}
