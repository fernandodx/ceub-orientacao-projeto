package Atividades.ContaBancaria;
import Atividades.ContaBancaria.ContaBancaria;

public class ProgramaPrincipal {
    public static void main (String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Claudia", 1000.0, "Conta Salario");
        ContaBancaria conta2 = new ContaBancaria("Joao", 2000.0, "Conta Corrente");

                // Exibindo informações das contas
                conta1.exibirInformacoes();
                conta2.exibirInformacoes();
        
                // Realizando depósitos
                conta1.depositarValor(200);
                conta2.depositarValor(100);
        
                // Realizando saques
                conta1.sacarValor(300);
                conta2.sacarValor(700);  
        
                // Exibindo as informações após transações
                conta1.exibirInformacoes();
                conta2.exibirInformacoes();
    }
    
}