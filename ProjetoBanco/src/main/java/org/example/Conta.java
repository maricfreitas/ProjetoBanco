package org.example;

//Se eu chamar a classe de abstrata, colocando antes de class, ela não podera criar objeto(ser instanciada)
//ex: public abstract class Conta
public abstract class Conta {
    // Atributos
    int numeroConta;
    int numeroCliente;
    double saldo;
    String dataAbertura;

    // métodos
    // É um mini programa. ele srá executado, mas não ira retornar = coloco como
    // void
    // Se for retornar algo, tenho que colocar o que ira pegar como double e colocar
    // o return dentro dele
    // Métodos com return e um tipo antes do nome, como double, sou métodos do tipo
    // GET
    // métodos com void são métodos do tipo SET
    void saqueConta(double valor) { // o modo que o método será utilizado depende do que está dentro do ()
        saldo -= valor; // ou posso escrever saldo== saldo -valor
    }

    void depositoConta(double valor) { // o valor que será inserido nesse método será do tipo double
        saldo += valor; // ou posso escrever saldo== saldo +valor
    }

    // Construtor. Ele zera todas as variáeis numericas e nula as variáveis strings
    Conta() {
        saldo = 100.00;

    }
}