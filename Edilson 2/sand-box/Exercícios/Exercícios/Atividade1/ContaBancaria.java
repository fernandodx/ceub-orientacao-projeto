package Atividade1;

import java.util.function.DoubleUnaryOperator;

//Declarando a conta bancaria

public class ContaBancaria {
    Double valor;
    Double saldo;
    String nome;
    String conta;

        //Construtor da conta bancaria
public ContaBancaria(String nome, Double saldo, Double valor, String conta){

    this.nome = nome;
    this.saldo = saldo;
    this.valor = valor;    
    this.conta = conta;
}

//Método adicionar dinheiro na conta
public void deposito(Double valor){
    System.out.println(saldo + valor);
}
        //método sacar dinheiro
public void sacar(Double valor){
    if (saldo - valor <= 0) {
        System.out.println("Saldo indisponível para saque");
    } else {
        System.out.println(saldo - valor);
    }
}

        //Método para mostrar informações da conta
public void infoConta(){
    System.out.println("\nNome: " + nome +
                        "\nSaldo: " + saldo +
                        "\nConta: " + conta);
}
    
}

