package br.com.fiap.techchallenge.domain.vos;

public record Email(String value) {
    public Email {
        validate(value);

    }

    private void validate(final String email) {
        if (email == null || email.isEmpty()) {
            return;
        }

        if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            throw new IllegalArgumentException("Email must be in the format");
        }
    }
}
