package controller;

import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import model.RegistroIMC;
import model.RegistroIMCInfantil;
import model.contract.IIMCController;

public class IMCController implements IIMCController {
    
    private List<RegistroIMC> historico = new ArrayList<>();
    
    @Override
    public void adicionarRegistro(String nome, double peso, double altura) {
        RegistroIMC registro = new RegistroIMC(altura, nome, peso);
        registro.calcularIMC();
        registro.classificarIMC();
        historico.add(registro);
    }
    
    public void adicionarRegistroInfantil(String nome, double peso, double altura, int idade) {
        RegistroIMCInfantil registro = new RegistroIMCInfantil(altura, nome, peso, idade);
        registro.calcularIMC();
        registro.classificarIMC();
        historico.add(registro);
    }
    
    @Override
    public List<RegistroIMC> getHistorico() {
        return historico;
    }
    
    public boolean exportarHistorico(String caminhoArquivo, String formato) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            
            if (formato.equalsIgnoreCase("csv")) {
               
                writer.write("Nome,Peso,Altura,IMC,Classificacao,Data,Tipo");
                writer.newLine();
                
                for (RegistroIMC registro : historico) {
                    String tipo = registro instanceof RegistroIMCInfantil ? "Infantil" : "Adulto";
                    writer.write(String.format("%s,%.2f,%.2f,%.2f,%s,%s,%s",
                        registro.getNome(),
                        registro.getPeso(),
                        registro.getAltura(),
                        registro.getImc(),
                        registro.getClassificacao(),
                        LocalDateTime.now().format(formatter),
                        tipo
                    ));
                    writer.newLine();
                }
            } else {
            
                writer.write("=== HISTÓRICO DE CÁLCULOS DE IMC ===");
                writer.newLine();
                writer.newLine();
                
                for (RegistroIMC registro : historico) {
                    String tipo = registro instanceof RegistroIMCInfantil ? "Infantil" : "Adulto";
                    writer.write(String.format("Nome: %s", registro.getNome()));
                    writer.newLine();
                    writer.write(String.format("Peso: %.2f kg", registro.getPeso()));
                    writer.newLine();
                    writer.write(String.format("Altura: %.2f m", registro.getAltura()));
                    writer.newLine();
                    writer.write(String.format("IMC: %.2f", registro.getImc()));
                    writer.newLine();
                    writer.write(String.format("Classificação: %s", registro.getClassificacao()));
                    writer.newLine();
                    writer.write(String.format("Tipo: %s", tipo));
                    writer.newLine();
                    writer.write(String.format("Data: %s", LocalDateTime.now().format(formatter)));
                    writer.newLine();
                    writer.write("----------------------------------------");
                    writer.newLine();
                }
            }
            
            writer.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
