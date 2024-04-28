package br.com.fiap.techchallenge.domain.vos;

public record ProductPrice(Double price) {
    public ProductPrice {
        validate(price);

    }

    private void validate(final Double price) {
        if (price == null) {
            throw new IllegalArgumentException("Price cannot be null");
        }
    }
}
