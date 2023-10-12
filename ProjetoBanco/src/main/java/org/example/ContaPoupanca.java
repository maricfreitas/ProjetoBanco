package org.example;

public class ContaPoupanca extends Conta {
    String datasAniversarios;

    @Override // Indica que um código foi herdadeo, mas reutilizado de outra forma
    void saqueConta(double valor) { // Polimorfismo. Sobrecarga é quando mudo tipo ou quantidade
        // Polimorfismo. Reescrita é mexer dentro das {} // posso ter vários métodos,
        // contanto que os parâmetros sejam passados. Tem que usar o mesmo nome
        if ((saldo - valor) < 0) { // mudar uma propriedade de uma classe específico
            System.out.println("Saldo insuficiênte para esse valor");
            System.out.println("Saque não realizado");
        } else {
            if (valor > 0) {
                saldo -= valor;
                System.out.println("Saque realizado com sucesso");
            }
        }
        // System.out.println("O valor do saldo é: " + saldo); // sempre que eu chamar
        // um atributo do objeto, tenho que passar o objeto.atributo
        // Precisa tirar o objeto pois a variável já está sendo chamada
    }

    void saqueConta(double valor, double cpmf) { // Sobrecarga de métodos pois o conteudo ofertado para o metodo é maior
                                                 // do que 1
        saldo = (saldo - valor) * cpmf; // Aplicando a sobre escrita, quando eu uso uma variável já existente,
                                        // mas mudo alguns parametros nela sem precisar gera-la novamente
    }

    void saqueConta(double valor, double cpmf, double iof) { // Sobrecarga de métodos pois o conteudo ofertado para o
                                                             // metodo é maior do que 1
        saldo = (saldo - valor) * (cpmf + iof); // Aplicando a sobre escrita, quando eu uso uma variável já existente,
                                                // mas mudo alguns parametros nela sem precisar gera-la novamente
        // Se for sobrecarga, tenho de usar parÂmetros diferentes, não posso ter dois
        // métodos com double, mesmo que sejam variáveis diferentes
    }

    ContaPoupanca(int numeroConta, String dataAbertura, double saldo) {
        this.numeroConta = numeroConta; // this está mostrando qual é o atributo e qual é variavel
        this.dataAbertura = dataAbertura; // Quando temos um número igual, mas precisamos diferencia lo
        this.saldo = saldo; // posso usar o this para ver tudo o que foi herdado da superclasse
        // usado para evitar confusões na hora de utilizar uma variável com o mesmo nome
        // de outras classes
    }

    ContaPoupanca(String dataAbertura, double saldo) {
        this.dataAbertura = dataAbertura; // cria uma variável local que só será utilizado nesse contrutor
        this.saldo = saldo;

    }
    // Posso ter um contrutor com o mesmo numero de parâmetros, desde que não sejam
    // iguais ao de outro contrutor
}
