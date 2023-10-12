package org.example;

public class ContaCorrente extends Conta {
    double limite;
    int gerente;
    double taxaMensal;

    ContaCorrente(double limite) {
        this.limite = limite;
    }

    ContaCorrente(double limite, double taxaMensal) {
        this.limite = limite;
        this.taxaMensal = taxaMensal;
    }

    ContaCorrente(int numeroCliente, double saldo, double limite) {
        this.numeroCliente = numeroCliente;
        this.saldo = saldo;
        this.limite = limite;
    }
}
