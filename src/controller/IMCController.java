package controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import model.Pessoa;

public class IMCController {
    private List<Pessoa> historico = new ArrayList<>();

    public void adicionarRegistro(Pessoa pessoa) {
        historico.add(pessoa);
    }

    public List<Pessoa> getHistorico() {
        return historico;
    }

    public void exportarHistorico(String caminhoArquivo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(caminhoArquivo))) {
            for (Pessoa pessoa : historico) {
                writer.println(pessoa.toCSV());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
