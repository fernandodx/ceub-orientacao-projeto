package view;

import controller.IMCController;
import model.RegistroIMC;
import model.contract.IIMCController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaPrincipal extends JFrame {

    private JTextField txtNome = new JTextField(20);
    private JTextField txtPeso = new JTextField(5);
    private JTextField txtAltura = new JTextField(5);
    private JTextArea txtAreaResultado = new JTextArea(10, 30);

    private IIMCController controller = new IMCController();

    public JanelaPrincipal() {
        super("Calculadora IMC");

        setLayout(new FlowLayout());

        add(new JLabel("Nome: "));
        add(txtNome);

        add(new JLabel("Peso (Kg):"));
        add(txtPeso);

        add(new JLabel("Altura (m):"));
        add(txtAltura);

        JButton btnCalcular = new JButton("Calcular IMC");
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIMC();
            }
        });
        add(btnCalcular);

        txtAreaResultado.setEditable(false);
        add(new JScrollPane(txtAreaResultado));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    private void calcularIMC() {
        try {
            String nome = txtNome.getText();
            double peso = Double.parseDouble(txtPeso.getText());
            double altura = Double.parseDouble(txtAltura.getText());

            controller.adicionarRegistro(nome, peso, altura);
            atualizarResultado();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Erro na conversão de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void atualizarResultado() {
        StringBuilder sb = new StringBuilder();
        for (RegistroIMC registro : controller.getHistorico()) {
            sb.append(registro).append("\n");
        }
        txtAreaResultado.setText(sb.toString());
    }

    public static void main(String[] args) {
        new JanelaPrincipal();
    }
}

