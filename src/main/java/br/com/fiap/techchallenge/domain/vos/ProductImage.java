package br.com.fiap.techchallenge.domain.vos;

public record ProductImage(String image) {
    public ProductImage {
        validate(image);
    }

    private void validate(final String image) {
        if (image == null) {
            throw new IllegalArgumentException("Image cannot be null");
        }
    }
}
