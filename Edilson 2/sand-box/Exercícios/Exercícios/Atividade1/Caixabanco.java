package Atividade1;

public class Caixabanco {
    public static void main(String[] args) {
        
         // Declarando as variáveis da classe
    ContaBancaria edilson = new ContaBancaria("Edilson", 1000.0, 500.0, "Conta Corrente");
        
         // Método Informação
     edilson.infoConta();

         //Método depósito
     edilson.deposito(500.0);

         //Método saque
     edilson.sacar(500.0);
   
    }

   
}
