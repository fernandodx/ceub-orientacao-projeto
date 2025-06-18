package model;

public class RegistroIMCInfantil extends Pessoa {
    private String faixaEtaria; // Este campo é salvo mas a lógica é simplificada

    public RegistroIMCInfantil(String nome, double peso, double altura, String faixaEtaria) {
        super(nome, peso, altura);
        this.faixaEtaria = faixaEtaria;
    }

    @Override
    public double calcularIMC() {
        if (altura == 0) return 0;
        return peso / (altura * altura);
    }

    @Override
    public String classificarIMC() {
        double imc = calcularIMC();
        // A classificação infantil real depende de curvas de percentil (idade e sexo).
        // Aqui, usamos uma lógica simplificada como solicitado no exercício.
        if (imc < 14.5) return "Abaixo do peso";
        if (imc < 18.5) return "Peso adequado";
        return "Sobrepeso";
    }

    @Override
    public String getTipo() {
        return "Infantil";
    }
}