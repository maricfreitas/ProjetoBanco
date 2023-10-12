package org.example;

//Não vou importar nada pois estou usando variáveis do mesmo pacote

public class TesteExemplodeClasses {
    public static void main(String x[]) {

        // ContaPoupanca cp = new ContaPoupanca("04/10/2023", 500);
        // System.out.println("O Saldo é: " + cp.saldo); //O saldo de 100 não é
        // utilizado pois estamos usando um contrutor prório

        ContaCorrente cc = new ContaCorrente(200);
        System.out.println("O limite da conta é: " + cc.limite);

        cc = new ContaCorrente(250, 584);
        System.out.println("\nO limite da conta é: " + cc.limite);
        System.out.println("A taxa mensal é: " + cc.taxaMensal);

        cc = new ContaCorrente(12, 1569, 1154);
        System.out.print("\nO cliente de número " + cc.numeroCliente);
        System.out.print(", tem saldo de " + cc.saldo);
        System.out.println(" e limite de " + cc.limite);
    }
}
