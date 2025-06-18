package controller;

import model.*;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IMCController {
    private List<Pessoa> historico = new ArrayList<>();

    public Pessoa registrarIMC(String nome, String pesoStr, String alturaStr, boolean isInfantil, String faixaEtaria) {
        if (nome == null || nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo 'Nome' é obrigatório.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        try {
            double peso = Double.parseDouble(pesoStr.replace(',', '.'));
            double altura = Double.parseDouble(alturaStr.replace(',', '.'));

            if (peso <= 0 || altura <= 0) {
                JOptionPane.showMessageDialog(null, "Peso e Altura devem ser valores positivos.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
                return null;
            }

            Pessoa pessoa;
            if (isInfantil) {
                // A faixa etária é obrigatória para o cálculo infantil, mesmo que a lógica seja simplificada.
                if (faixaEtaria == null || faixaEtaria.trim().isEmpty()) {
                     JOptionPane.showMessageDialog(null, "Para cálculo infantil, a 'Faixa Etária' é obrigatória.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
                     return null;
                }
                pessoa = new RegistroIMCInfantil(nome, peso, altura, faixaEtaria);
            } else {
                pessoa = new RegistroIMC(nome, peso, altura);
            }

            historico.add(pessoa);
            return pessoa;

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Peso e Altura devem ser valores numéricos válidos.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void exportarCSV(String caminho) {
        if (!caminho.toLowerCase().endsWith(".csv")) {
            caminho += ".csv";
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminho))) {
            writer.write("Nome,Peso(kg),Altura(m),IMC,Data,Tipo\n"); // Cabeçalho
            for (Pessoa p : historico) {
                writer.write(p.toCSV());
            }
            JOptionPane.showMessageDialog(null, "Histórico exportado com sucesso para:\n" + caminho, "Exportação Concluída", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao exportar o arquivo: " + e.getMessage(), "Erro de Exportação", JOptionPane.ERROR_MESSAGE);
        }
    }

    public List<Pessoa> getHistorico() {
        return new ArrayList<>(historico); // Retorna uma cópia para proteger a lista original
    }
}