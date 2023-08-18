package org.example;

import org.example.banco.model.Conta;
import org.example.banco.model.ContaCorrente;
import org.example.banco.model.ContaPoupanca;
import org.example.banco.model.Titular;

public class Main {
    public static void main(String[] args) {


        ContaCorrente conta1 = new ContaCorrente("01", "12345", 1000.0);
        ContaCorrente conta2 = new ContaCorrente("02", "67890");

        ContaPoupanca contaPoupanca1 = new ContaPoupanca("001", "101112", 1, 10);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca("002", "131415", 2, 20);

        conta1.setTitular(new Titular("Alef", "123.456.789-00"));
        conta2.setTitular(new Titular("Fausto", "987.654.321-00"));

        contaPoupanca1.setTitular(new Titular("Viviane", "555.555.555-55"));
        contaPoupanca2.setTitular(new Titular("Everton", "777.777.777-77"));

        conta1.depositar(15000.0);
        conta1.sacar(200.0);

        contaPoupanca2.depositar(3600.0);
        contaPoupanca2.sacar(300.0);

        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(contaPoupanca1);
        System.out.println(contaPoupanca2);
    }
}