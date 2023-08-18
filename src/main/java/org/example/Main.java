package org.example;

import org.example.banco.model.Conta;
import org.example.banco.model.ContaCorrente;
import org.example.banco.model.ContaPoupanca;
import org.example.banco.model.Titular;

public class Main {
    public static void main(String[] args) {


        ContaCorrente conta1 = new ContaCorrente("01", "12345", 1000.0);

        conta1.depositar(15000.0);
        conta1.sacar(200.0);

        conta1.setTitular(new Titular("Alef", "123.456.789-00"));

        ContaPoupanca contaPoupanca1 = new ContaPoupanca("001", "101112", 1, 10);

        contaPoupanca1.setTitular(new Titular("Viviane", "555.555.555-55"));

        System.out.println(conta1);
        System.out.println(contaPoupanca1);
    }
}