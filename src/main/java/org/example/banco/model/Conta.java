package org.example.banco.model;

public class Conta {
    private String agencia;
    private String numero;

    public Conta(String agencia, String numero) {
        super();
        this.agencia = agencia;
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
