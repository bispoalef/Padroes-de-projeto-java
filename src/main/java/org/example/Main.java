package org.example;

import org.example.banco.model.Conta;
import org.example.banco.model.ContaCorrente;
import org.example.banco.model.ContaPoupanca;
import org.example.banco.model.Titular;

public class Main {
    public static void main(String[] args) {


        ContaCorrente conta1 = new ContaCorrente("01", "12345", 1000.0);


        System.out.println(conta1);
    }
}