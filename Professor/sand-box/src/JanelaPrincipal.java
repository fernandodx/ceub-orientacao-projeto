
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class JanelaPrincipal extends JFrame {
 private JTextField txtNome = new JTextField(15);
    private JTextField txtPeso = new JTextField(5);
    private JTextField txtAltura = new JTextField(5);
    private JTextArea areaResultado = new JTextArea(10, 30);
   // private IMCController controller = new IMCController();

    public JanelaPrincipal() {
        super("Calculadora de IMC");
        setLayout(new FlowLayout());

        add(new JLabel("Nome:"));
        add(txtNome);

        add(new JLabel("Peso (kg):"));
        add(txtPeso);

        add(new JLabel("Altura (m):"));
        add(txtAltura);

        JButton btnCalcular = new JButton("Calcular IMC");
        btnCalcular.addActionListener(this::calcularIMC);
        add(btnCalcular);

        areaResultado.setEditable(false);
        add(new JScrollPane(areaResultado));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    private void calcularIMC(ActionEvent e) {
        try {
            String nome = txtNome.getText();
            double peso = Double.parseDouble(txtPeso.getText());
            double altura = Double.parseDouble(txtAltura.getText());

           // controller.adicionarRegistro(nome, peso, altura);
            atualizarResultado();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Erro: Insira valores válidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void atualizarResultado() {
        StringBuilder sb = new StringBuilder("Historico");
       // for (RegistroIMC r : controller.getHistorico()) {
        //    sb.append(r).append("\n");
       // }
        areaResultado.setText(sb.toString());
    }

}


    
