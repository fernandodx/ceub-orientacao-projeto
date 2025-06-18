package Atividades.AtvContaBancaria;

public class ContaBancaria {
    String nome;
    Double saldo;
    Double movimentacao;

    public ContaBancaria(String nome){
        this.nome = nome;
        this.saldo = 1000.0;
    }

    public void informacao(){
        System.out.println("Nome: " + nome + "\nSaldo: " + saldo);
    }

    public void deposita(Double movimentacao){
        System.out.println(saldo + movimentacao);
    }

    public void saca(Double movimentacao){
        if (saldo - movimentacao <= 0){
            System.out.println("Saldo insuficiente para a movimentação");
        } else {
            System.out.println(saldo - movimentacao);
        }
    }

}
