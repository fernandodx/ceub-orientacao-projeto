package Atividades.AtvContaBancaria;

public class Transacoes {
    public static void main(String[] args) {
        ContaBancaria bruno = new ContaBancaria("Bruno Alves");

        bruno.informacao();

        bruno.deposita(500.0);

        bruno.saca(700.0);
    }
}
