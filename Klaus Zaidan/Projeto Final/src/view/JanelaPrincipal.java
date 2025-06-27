package view;

import controller.IMCController; // Importado o JIMCController
import model.Pessoa; // Importado Pessoa para lidar com o histórico
import model.RegistroIMC;
import model.RegistroIMCInfantil;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date; // Para incluir a data na exportação

public class JanelaPrincipal extends JFrame {
    private JTextField txtNome = new JTextField(15);
    private JTextField txtPeso = new JTextField(5);
    private JTextField txtAltura = new JTextField(5);
    private JCheckBox chkInfantil = new JCheckBox("IMC Infantil"); // Checkbox para IMC Infantil
    private JButton btnButton = new JButton("Calcular IMC");
    private JButton btnExportar = new JButton("Exportar Histórico"); // Botão para exportar o histórico
    private JTextArea txtAreaResultado = new JTextArea(10, 30);

    private IMCController controller = new IMCController(); // Instância do controlador

    public JanelaPrincipal() {
        super("Calculadora de IMC"); // Título da janela
        setLayout(new FlowLayout()); // Layout simples para os componentes
        
                // Adição dos componentes à janela
                add(new JLabel("Nome:"));
                add(txtNome);
                add(new JLabel("Peso (kg):"));
                add(txtPeso);
                add(new JLabel("Altura (m):"));
                add(txtAltura);
                add(chkInfantil); // Adiciona o checkbox de IMC Infantil
        
                // Listener para o botão "Calcular IMC"
                btnButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        calcularIMC(e);
                    }
                });
                add(btnButton);
        
                // Listener para o botão "Exportar Histórico"
                btnExportar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        exportarHistorico();
                    }
                });
                add(btnExportar); // Adiciona o botão de exportar
        
                txtAreaResultado.setEditable(false); // Torna a área de texto somente leitura
                add(new JScrollPane(txtAreaResultado)); // Adiciona a área de texto com barra de rolagem
        
                setDefaultCloseOperation(EXIT_ON_CLOSE); // Define a operação de fechamento da janela
                setSize(400, 400); // Define o tamanho da janela
                setVisible(true); // Torna a janela visível
            }
        
            private void setLayout(FlowLayout flowLayout) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'setLayout'");
            }
        
            private void calcularIMC(ActionEvent e) {
        try {
            String nome = txtNome.getText();
            // Validação do campo Nome: não pode ser vazio
            if (nome.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "O campo Nome é obrigatório.", "Alerta", JOptionPane.ERROR_MESSAGE);
                return; // Impede o cálculo e sai do método
            }

            double peso = Double.parseDouble(txtPeso.getText());
            double altura = Double.parseDouble(txtAltura.getText());

            // Validação de Peso e Altura: não podem ser zero ou negativos
            if (peso <= 0 || altura <= 0) {
                 JOptionPane.showMessageDialog(this, "Peso e Altura devem ser valores positivos.", "Alerta", JOptionPane.ERROR_MESSAGE);
                 return;
            }


            // Adiciona o registro ao controlador, passando o tipo (adulto ou infantil)
            controller.adicionarRegistro(nome, peso, altura, chkInfantil.isSelected());
            atualizarResultado(); // Atualiza a área de texto com o histórico

        } catch (NumberFormatException exception) {
            // Tratamento de erro para entrada não numérica em Peso ou Altura
            JOptionPane.showMessageDialog(this, "Erro na conversão de dados. Por favor, insira valores numéricos válidos para Peso e Altura.", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void atualizarResultado() {
        StringBuilder sb = new StringBuilder();
        // Itera sobre o histórico e adiciona cada registro à string para exibição
        for (Pessoa p : controller.getHistorico()) {
            sb.append(p.toString()).append("\n"); // Usa o toString() polimórfico de RegistroIMC ou RegistroIMCInfantil
        }
        txtAreaResultado.setText(sb.toString()); // Atualiza a área de texto
    }

    private void exportarHistorico() {
        try {
            // Abre uma caixa de diálogo para o usuário escolher o local e nome do arquivo
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Salvar Histórico IMC");
            // Define um nome de arquivo padrão
            fileChooser.setSelectedFile(new File("historico_imc.txt"));

            int userSelection = fileChooser.showSaveDialog(this);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                // Garante que o arquivo tenha uma extensão .txt ou .csv
                String filePath = fileToSave.getAbsolutePath();
                if (!filePath.toLowerCase().endsWith(".txt") && !filePath.toLowerCase().endsWith(".csv")) {
                    fileToSave = new File(filePath + ".txt");
                }

                // Abre um FileWriter para escrever no arquivo
                FileWriter fileWriter = new FileWriter(fileToSave);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                // Escreve o cabeçalho do arquivo CSV
                bufferedWriter.write("Nome,Peso (kg),Altura (m),IMC,Classificacao,Tipo,Data\n");

                // Itera sobre o histórico e escreve cada registro no arquivo
                for (Pessoa p : controller.getHistorico()) {
                    String type = "";
                    double imcValue = 0.0;
                    String classificationText = "";
                    String dataRegistro = new Date().toString(); // Captura a data atual

                    if (p instanceof RegistroIMC) {
                        RegistroIMC registro = (RegistroIMC) p;
                        imcValue = registro.calcularIMC();
                        classificationText = registro.classificarIMC();
                        type = "Adulto";
                    } else if (p instanceof RegistroIMCInfantil) {
                        RegistroIMCInfantil registroInfantil = (RegistroIMCInfantil) p;
                        imcValue = registroInfantil.calcularIMC();
                        classificationText = registroInfantil.classificarIMC();
                        type = "Infantil";
                    }
                    // Escreve os dados no formato CSV
                    bufferedWriter.write(
                        p.getNome() + "," +
                        p.getPeso() + "," +
                        p.getAltura() + "," +
                        String.format("%.2f", imcValue) + "," + // Formata IMC
                        classificationText + "," +
                        type + "," +
                        dataRegistro + "\n"
                    );
                }

                bufferedWriter.close(); // Fecha o escritor de arquivo
                JOptionPane.showMessageDialog(this, "Histórico exportado com sucesso para:\n" + fileToSave.getAbsolutePath(), "Exportação Concluída", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (IOException ex) {
            // Tratamento de erro para problemas na exportação do arquivo
            JOptionPane.showMessageDialog(this, "Erro ao exportar o histórico: " + ex.getMessage(), "Erro de Exportação", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace(); // Imprime o stack trace para depuração
        }
    }
}
