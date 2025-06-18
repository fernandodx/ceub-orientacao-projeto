package ContaBancaria;

import Pokemon.pokemon;

public class ContaBancariaAula {

    private double saldo;

    public void depositar(double valor){

    }

    private boolean sacar(){
        return false;
    }

    public void imprimirSaldo(){
        System.out.println("Saldo: " + saldo);
    }

    public static void main(String[] args) {
        
        ContaBancariaAula contajr = new ContaBancariaAula();

        contajr.saldo = 1000;
        contajr.sacar();

        ContaBancariaAula contaprof = new ContaBancariaAula();

        contaprof.saldo = 100;
        contaprof.imprimirSaldo();

    pokemo
    }
}

