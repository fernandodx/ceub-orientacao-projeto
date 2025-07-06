package Model;

import Model.contract.ICalculoIMC;

public class RegistroIMC extends Pessoa implements ICalculoIMC {
    private Double IMC;
    private String classificacao;

    public RegistroIMC(String Nome, Double Peso, Double Altura) {
            super(Nome, Peso, Altura);
        }
    
        @Override
    public Double CalcularIMC() {
       // Voce deve escrever um metodo CalcularIMC para calcular o imc da pessoa
       return 0.0;
    }

    @Override
    public String classificarIMC() {
       // Voce deve escrever um metodo ClassificarIMC e retornar como esta a pessoa
       return "Magro";
    }

}
