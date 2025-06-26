package model;

import model.contract.ICalculoIMC;

public class RegistroIMC extends Pessoa implements ICalculoIMC {

    private double imc;
    private String classificacao;

    public RegistroIMC(double altura, String nome, double peso) {
        super(altura, nome, peso);
    }

    @Override
    public double calcularIMC() {
       //Você deve escrever o método calcularIMC para calcular o IMC da pessoa
       return 0.0;
    }

    @Override
    public String classificarIMC() {
      //Você deve escrever o método classificarIMC e retornar como esta a pessoa
      return "Obeso";
    }

}
