package model;

import model.contract.ICalculoIMC;

public class RegistroIMC extends Pessoa implements ICalculoIMC{

    private double item;
    private String classificacao;
    
    public RegistroIMC(String nome, Double peso, Double altura) {
        super(nome, peso, altura);
    }

    @Override
    public double calcularIMC() {
        item = getPeso()/ Math.pow (getAltura(), 2);
        return item;
    }

    @Override
    public String classificarIMC() {
        Double calculoIMC = calcularIMC();
        if (calculoIMC < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (calculoIMC > 18.5 && calculoIMC < 24.99) {
            classificacao = "Eutrófico";
        } else if (calculoIMC > 25.00 && calculoIMC <= 29.99) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obesidade";
        } 
        return classificacao;
    }

}
