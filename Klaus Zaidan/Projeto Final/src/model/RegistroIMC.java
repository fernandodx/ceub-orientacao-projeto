package model;

import model.contract.ICalculoIMC;

public class RegistroIMC extends Pessoa implements ICalculoIMC {

    private double imc; // Campo para armazenar o valor do IMC
    private String classificacao; // Campo para armazenar a classificação do IMC

    public RegistroIMC(double altura, String nome, double peso) {
        super(altura, nome, peso);
        // Calcula o IMC e a classificação assim que o objeto é criado
        this.imc = calcularIMC();
        this.classificacao = classificarIMC();
    }

    @Override
    public double calcularIMC() {
        // Implementação da fórmula padrão do IMC: peso / (altura * altura)
        // Onde peso está em kg e altura em metros
        return this.getPeso() / (this.getAltura() * this.getAltura());
    }

    @Override
    public String classificarIMC() {
        // Classifica o IMC de acordo com as categorias para adultos
        double imcCalculado = calcularIMC();
        if (imcCalculado < 18.5) {
            return "Abaixo do peso";
        } else if (imcCalculado < 24.9) {
            return "Peso normal";
        } else if (imcCalculado < 29.9) {
            return "Sobrepeso";
        } else if (imcCalculado < 34.9) {
            return "Obesidade Grau 1";
        } else if (imcCalculado < 39.9) {
            return "Obesidade Grau 2";
        } else {
            return "Obesidade Grau 3";
        }
    }

    // Métodos getters para acessar os valores de IMC e classificação
    public double getImc() {
        return imc;
    }

    public String getClassificacao() {
        return classificacao;
    }

    @Override
    public String toString() {
        // Retorna uma representação em String do registro IMC, formatado para exibição
        return "Nome: " + getNome() +
               ", Peso: " + getPeso() + "kg" +
               ", Altura: " + getAltura() + "m" +
               ", IMC: " + String.format("%.2f", imc) + // Formata IMC para 2 casas decimais
               ", Classificação: " + classificacao +
               " (Adulto)"; // Indica que é um registro de IMC Adulto
    }
}
