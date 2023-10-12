package org.example;

import java.util.Scanner;

public class DigitaContaPoupanca {
    public static void main(String x[]) {
        Scanner num = new Scanner(System.in);
        ContaPoupanca var; // Crio o objeto, mas não instancio
        do {
            var = new ContaPoupanca(); // Instancio um objeto já criado
            System.out.println("\n\n\nCadastro em Conta Poupança\n");
            System.out.print("Numero da Conta: ");
            var.numeroConta = num.nextInt();
            if (var.numeroConta != 0) {
                System.out.print("Numero do Cliente: ");
                var.numeroCliente = num.nextInt();
                System.out.print("Data de Abertura: ");
                var.dataAbertura = num.next();
                System.out.print("Data de aniversário: ");
                var.datasAniversarios = num.next();
                System.out.print("Valor do depósito: ");
                var.depositoConta(num.nextDouble());
                System.out.println("O saldo é: " + var.saldo);
                System.out.print("Valor do saque: ");
                var.saqueConta(num.nextDouble());
                System.out.println("O saldo é: " + var.saldo);
            }
        } while (var.numeroConta != 0);
    }

}
