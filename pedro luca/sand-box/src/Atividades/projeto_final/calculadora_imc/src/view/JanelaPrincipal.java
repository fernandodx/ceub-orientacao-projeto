package view;

import controller.IMCController;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.RegistroIMC;
import model.contract.IIMCController;

public class JanelaPrincipal extends JFrame {

    private JTextField txtNome = new JTextField(20);
    private JTextField txtPeso = new JTextField(5);
    private JTextField txtAltura = new JTextField(5);
    private JTextArea txtAreaResultado = new JTextArea(10,30);

    private IIMCController controller = new IMCController();

    public JanelaPrincipal() {
        super("Calculadora IMC");

        setLayout(new FlowLayout());

        add(new JLabel("Nome: "));
        add(txtNome);

        add(new JLabel("Peso (Kg):"));
        add(txtPeso);

        add(new JLabel("Altura (m)"));
        add(txtAltura);

        JButton btnButton = new JButton("Calcular IMC");
        btnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIMC(e);
            }
        });
        add(btnButton);

        txtAreaResultado.setEditable(false);
        add(new JScrollPane(txtAreaResultado));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    private void calcularIMC(ActionEvent e) {
        try {
            String nome = txtNome.getText();
            double peso = Double.parseDouble(txtPeso.getText());
            double altura = Double.parseDouble(txtAltura.getText());

            // Criando um novo registro e adicionando no histórico
            controller.adicionarRegistro(nome, peso, altura);

            atualizarResultado();
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(this, "Erro na conversão de dados", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void atualizarResultado() {
        StringBuilder sb = new StringBuilder();
        for (RegistroIMC registro : controller.getHistorico()) {
            sb.append(registro).append("\n");
        }
        txtAreaResultado.setText(sb.toString());
    }
}