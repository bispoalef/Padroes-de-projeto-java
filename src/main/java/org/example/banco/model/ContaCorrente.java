package org.example.banco.model;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String agencia, String numero) {
        super(agencia, numero);
        this.limiteChequeEspecial = 0.0;
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

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Limite Cheque Especial: R$" + limiteChequeEspecial;
    }
}
