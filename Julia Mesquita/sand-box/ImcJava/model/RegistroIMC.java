package model;

import model.contract.ICalculoIMC;

public class RegistroIMC extends Pessoa implements ICalculoIMC {
    
    protected double imc;
    protected String classificacao;
    
    public RegistroIMC(double altura, String nome, double peso) {
        super(altura, nome, peso);
        this.imc = 0.0;
        this.classificacao = "";
    }
    
    @Override
    public double calcularIMC() {
        if (getAltura() > 0) {
            imc = getPeso() / (getAltura() * getAltura());
        } else {
            imc = 0.0;
        }
        return imc;
    }
    
    @Override
    public String classificarIMC() {
        if (imc == 0.0) {
            calcularIMC();
        }
        
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 25) {
            classificacao = "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            classificacao = "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            classificacao = "Obesidade grau I";
        } else if (imc >= 35 && imc < 40) {
            classificacao = "Obesidade grau II";
        } else {
            classificacao = "Obesidade grau III";
        }
        
        return classificacao;
    }
    
    public double getImc() {
        return imc;
    }
    
    public String getClassificacao() {
        return classificacao;
    }

    protected void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
    
    @Override
    public String toString() {
        return String.format("%s - Peso: %.2f kg, Altura: %.2f m, IMC: %.2f (%s)", 
                getNome(), getPeso(), getAltura(), imc, classificacao);
    }
}