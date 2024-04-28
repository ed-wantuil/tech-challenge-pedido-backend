package br.com.fiap.techchallenge.domain.vos;

public record Cpf(String cpf) {
    public Cpf {
        validate(cpf);

    }

    private void validate(final String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            return;
        }

        if (!cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("CPF must be in the format XXX.XXX.XXX-XX");
        }
    }
}
