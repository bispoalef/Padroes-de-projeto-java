package org.example.banco.model;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String agencia, String numero) {
        super(agencia, numero);
    }

    public ContaCorrente(String agencia, String numero, double limiteChequeEspecial) {
        super(agencia, numero);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

}
