package org.example.banco.model;

public class Conta {
    private String agencia;
    private String numero;
    private Double saldo;

    public Conta(String agencia, String numero) {
        super();
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0.0;
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

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente na conta, seu saldo atual é de: " + saldo + ".");
        }
    }

    @Override
    public String toString() {
        return "Conta: " + numero + "\n" +
                "Saldo: R$" + saldo;
    }

}
