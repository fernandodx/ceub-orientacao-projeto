package Atividades.ContaBancaria.src;

public class Caixa {
    public static void main(String[] args) {

        // Declarando as variáveis da classe (instanciando)
        ContaBancaria jarvis = new ContaBancaria("Jarvis", "123.456.789-01" );

        // Chamando os métodos com as especificações
        jarvis.info();

        // Faz o depósito de 200.0 dinheiros
        jarvis.depositar(200.0);

        // Faz o saque de 900.0 dinheiros, como o salto é mais alto do que o saldo, o comando vai devolver "Valor Inválido", ou algo assim
        jarvis.sacar(900.0);
    }
}