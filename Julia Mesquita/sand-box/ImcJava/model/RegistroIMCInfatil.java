package model;

public class RegistroIMCInfantil extends RegistroIMC {
    
    private int idade;
    
    public RegistroIMCInfantil(double altura, String nome, double peso, int idade) {
        super(altura, nome, peso);
        this.idade = idade;
    }
    
    @Override
    public String classificarIMC() {
        if (imc == 0.0) {
            calcularIMC();
        }
        
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }
        if (idade < 2) {
            if (imc < 14) {
                classificacao = "Abaixo do peso";
            } else if (imc >= 14 && imc < 18) {
                classificacao = "Peso adequado";
            } else if (imc >= 18 && imc < 20) {
                classificacao = "Risco de sobrepeso";
            } else {
                classificacao = "Sobrepeso";
            }
        } else if (idade >= 2 && idade <= 5) {
            if (imc < 13.5) {
                classificacao = "Abaixo do peso";
            } else if (imc >= 13.5 && imc < 16.5) {
                classificacao = "Peso adequado";
            } else if (imc >= 16.5 && imc < 18) {
                classificacao = "Risco de sobrepeso";
            } else {
                classificacao = "Sobrepeso";
            }
        } else if (idade >= 6 && idade <= 10) {
            if (imc < 14) {
                classificacao = "Abaixo do peso";
            } else if (imc >= 14 && imc < 18) {
                classificacao = "Peso adequado";
            } else if (imc >= 18 && imc < 20) {
                classificacao = "Risco de sobrepeso";
            } else {
                classificacao = "Sobrepeso";
            }
        } else {
            if (imc < 16) {
                classificacao = "Abaixo do peso";
            } else if (imc >= 16 && imc < 22) {
                classificacao = "Peso adequado";
            } else if (imc >= 22 && imc < 25) {
                classificacao = "Risco de sobrepeso";
            } else {
                classificacao = "Sobrepeso";
            }
        }
        
        return classificacao;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public String toString() {
        return String.format("%s (%d anos) - Peso: %.2f kg, Altura: %.2f m, IMC: %.2f (%s)", 
                getNome(), idade, getPeso(), getAltura(), imc, classificacao);
    }
}
