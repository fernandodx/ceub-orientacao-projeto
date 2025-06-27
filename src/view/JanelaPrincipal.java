package view;

import controller.IMCController;
import model.Pessoa;
import model.RegistroIMC;
import model.RegistroIMCInfantil;

import javax.swing.*;
import java.awt.*;

public class JanelaPrincipal extends JFrame {
    private JTextField txtNome, txtPeso, txtAltura;
    private JCheckBox chkInfantil;
    private JLabel lblResultado;
    private IMCController controller = new IMCController();

    public JanelaPrincipal() {
        setTitle("Calculadora de IMC");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        txtNome = new JTextField();
        txtPeso = new JTextField();
        txtAltura = new JTextField();
        chkInfantil = new JCheckBox("Infantil");
        lblResultado = new JLabel("Resultado");

        JButton btnCalcular = new JButton("Calcular IMC");
        JButton btnExportar = new JButton("Exportar Histórico");

        add(new JLabel("Nome:"));
        add(txtNome);
        add(new JLabel("Peso (kg):"));
        add(txtPeso);
        add(new JLabel("Altura (m):"));
        add(txtAltura);
        add(chkInfantil);
        add(new JLabel(""));
        add(btnCalcular);
        add(btnExportar);
        add(lblResultado);

        btnCalcular.addActionListener(e -> {
            String nome = txtNome.getText();
            String pesoStr = txtPeso.getText();
            String alturaStr = txtAltura.getText();
            boolean isInfantil = chkInfantil.isSelected();

            if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(null, "O nome é obrigatório.");
                return;
            }
            double peso, altura;
            try {
                peso = Double.parseDouble(pesoStr);
                altura = Double.parseDouble(alturaStr);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Peso e altura devem ser numéricos.");
                return;
            }

            Pessoa pessoa = isInfantil
                    ? new RegistroIMCInfantil(nome, peso, altura)
                    : new RegistroIMC(nome, peso, altura);

            controller.adicionarRegistro(pessoa);
            lblResultado.setText("IMC: " + pessoa.calcularIMC() + " - " + pessoa.classificarIMC());
        });

        btnExportar.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showSaveDialog(null);
            if (option == JFileChooser.APPROVE_OPTION) {
                String caminho = fileChooser.getSelectedFile().getAbsolutePath();
                controller.exportarHistorico(caminho);
                JOptionPane.showMessageDialog(null, "Histórico exportado com sucesso!");
            }
        });
    }
}
