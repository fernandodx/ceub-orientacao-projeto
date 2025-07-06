package view;

public class JanelaPrincipal {

}
package view;

import controller.IMCController;
import model.RegistroIMC;
import model.contract.IIMCController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.List;

public class JanelaPrincipal extends JFrame {

    private final JTextField txtNome = new JTextField(20);
    private final JTextField txtPeso = new JTextField(5);
    private final JTextField txtAltura = new JTextField(5);
    private final JTextField txtIdadeMeses = new JTextField(5);

    private final JTextArea txtHistorico = new JTextArea(12, 35);

    private final IIMCController controller = new IMCController();

    public JanelaPrincipal() {
        super("Calculadora de IMC - Projeto Final");
        setLayout(new FlowLayout());

        // Campos básicos
        add(new JLabel("Nome:"));
        add(txtNome);

        add(new JLabel("Peso (kg):"));
        add(txtPeso);

        add(new JLabel("Altura (m):"));
        add(txtAltura);

        add(new JLabel("Idade (meses):"));
        add(txtIdadeMeses);

        // Botões
        JButton btnCalcularAdulto = new JButton("IMC Adulto");
        btnCalcularAdulto.addActionListener(this::calcularAdulto);
        add(btnCalcularAdulto);

        JButton btnCalcularInfantil = new JButton("IMC Infantil");
        btnCalcularInfantil.addActionListener(this::calcularInfantil);
        add(btnCalcularInfantil);

        JButton btnExportarCSV = new JButton("Exportar CSV");
        btnExportarCSV.addActionListener(this::exportarCSV);
        add(btnExportarCSV);

        // Histórico
        txtHistorico.setEditable(false);
        add(new JScrollPane(txtHistorico));

        // Configuração final da janela
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void calcularAdulto(ActionEvent e) {
        try {
            String nome = txtNome.getText().trim();
            double peso = Double.parseDouble(txtPeso.getText());
            double altura = Double.parseDouble(txtAltura.getText());

            validarDados(nome, peso, altura);

            controller.adicionarRegistro(nome, peso, altura);
            atualizarHistorico();
            limparCampos();

        } catch (NumberFormatException ex) {
            showMensagem("Peso e altura devem ser números válidos.");
        } catch (IllegalArgumentException ex) {
            showMensagem(ex.getMessage());
        }
    }

    private void calcularInfantil(ActionEvent e) {
        try {
            String nome = txtNome.getText().trim();
            double peso = Double.parseDouble(txtPeso.getText());
            double altura = Double.parseDouble(txtAltura.getText());
            int idade = Integer.parseInt(txtIdadeMeses.getText());

            validarDados(nome, peso, altura);
            if (idade < 0) throw new IllegalArgumentException("Idade não pode ser negativa.");

            controller.adicionarRegistroInfantil(nome, peso, altura, idade);
            atualizarHistorico();
            limparCampos();

        } catch (NumberFormatException ex) {
            showMensagem("Peso, altura e idade devem ser números válidos.");
        } catch (IllegalArgumentException ex) {
            showMensagem(ex.getMessage());
        }
    }

    private void atualizarHistorico() {
        List<RegistroIMC> todos = controller.getHistoricoCompleto();
        StringBuilder sb = new StringBuilder();
        sb.append("Histórico de Registros:\n");
        for (RegistroIMC r : todos) {
            sb.append(r.getResumo()).append("\n");
        }
        txtHistorico.setText(sb.toString());
    }

    private void exportarCSV(ActionEvent e) {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("CSV Files", "csv"));

        if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = ensureCSVExtension(chooser.getSelectedFile());
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write("Nome,Peso,Altura,IMC,Data,Tipo\n");
                for (RegistroIMC r : controller.getHistoricoCompleto()) {
                    writer.write(r.toCSV() + "\n");
                }
                JOptionPane.showMessageDialog(this, "Arquivo exportado com sucesso!");
            } catch (IOException ex) {
                showMensagem("Erro ao exportar: " + ex.getMessage());
            }
        }
    }

    private void validarDados(String nome, double peso, double altura) {
        if (nome.isEmpty()) throw new IllegalArgumentException("Nome não pode ser vazio.");
        if (peso <= 0 || altura <= 0)
            throw new IllegalArgumentException("Peso e altura devem ser positivos.");
    }

    private void limparCampos() {
        txtNome.setText("");
        txtPeso.setText("");
        txtAltura.setText("");
        txtIdadeMeses.setText("");
        txtNome.requestFocus();
    }

    private void showMensagem(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Aviso", JOptionPane.WARNING_MESSAGE);
    }

    private File ensureCSVExtension(File f) {
        if (!f.getName().toLowerCase().endsWith(".csv")) {
            return new File(f.getAbsolutePath() + ".csv");
        }
        return f;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JanelaPrincipal::new);
    }
}
