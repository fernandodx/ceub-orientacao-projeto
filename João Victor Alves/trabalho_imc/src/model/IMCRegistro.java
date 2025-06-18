package model;

public class RegistroIMC extends Pessoa {
    public RegistroIMC(String nome, double peso, double altura) {
        super(nome, peso, altura);
    }

    @Override
    public double calcularIMC() {
        // Fórmula do IMC: peso / (altura * altura)
        if (altura == 0) return 0; // Evita divisão por zero
        return peso / (altura * altura);
    }

    @Override
    public String classificarIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) return "Abaixo do peso";
        if (imc < 25) return "Peso normal";
        if (imc < 30) return "Sobrepeso";
        if (imc < 35) return "Obesidade Grau I";
        if (imc < 40) return "Obesidade Grau II";
        return "Obesidade Grau III";
    }

    @Override
    public String getTipo() {
        return "Adulto";
    }
}
