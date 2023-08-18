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

        System.out.println(conta1);
    }
}