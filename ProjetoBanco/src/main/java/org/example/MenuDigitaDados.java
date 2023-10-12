package org.example;

import java.util.Scanner;

public class MenuDigitaDados {
    public static void main(String x[]) {
        Scanner op = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n\n Menu!!");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma das opções: ");
            opcao = op.nextInt();
            if (opcao != 0) {
                if (opcao == 1) {
                    DigitaContaPoupanca.main(x); // Para chamar um programa que já existe.
                }
                if (opcao == 2) {
                    DigitaContaCorrente.main(x); // da para chamar programas que não são java
                }
            }
        } while (opcao != 0);
    }
}
