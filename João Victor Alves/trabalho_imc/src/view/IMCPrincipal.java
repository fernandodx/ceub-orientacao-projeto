package view;

import controller.IMCController;
import model.Pessoa;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;

public class JanelaPrincipal extends JFrame {
    private final JTextField campoNome = new JTextField();
    private final JTextField campoPeso = new JTextField();
    private final JTextField campoAltura = new JTextField();
    private final JTextField campoFaixa = new JTextField();
    private final JCheckBox infantilBox = new JCheckBox("Cálculo Infantil");
    private final JTextArea areaResultado = new JTextArea(10, 40);
    private final IMCController controller = new IMCController();

    public JanelaPrincipal() {
        super("Calculadora de IMC com Histórico");
        configurarJanela();
        adicionarComponentes();
        configurarListeners();
        
        // Torna a janela visível após toda a configuração
        setVisible(true);
    }
    
    private void configurarJanela() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        pack(); // Ajusta o tamanho da janela com base nos componentes
        setMinimumSize(new Dimension(500, 450));
        setLocationRelativeTo(null); // Centraliza na tela
    }
    
    private void adicionarComponentes() {
        // Painel de Entradas
        JPanel painelEntradas = new JPanel(new GridLayout(5, 2, 5, 5));
        painelEntradas.setBorder(BorderFactory.createTitledBorder("Dados para Cálculo"));
        painelEntradas.add(new JLabel("Nome:"));
        painelEntradas.add(campoNome);
        painelEntradas.add(new JLabel("Peso (ex: 70.5):"));
        painelEntradas.add(campoPeso);
        painelEntradas.add(new JLabel("Altura (ex: 1.75):"));
        painelEntradas.add(campoAltura);
        painelEntradas.add(infantilBox);
        painelEntradas.add(new JLabel()); // Espaço em branco
        painelEntradas.add(new JLabel("Faixa Etária (infantil):"));
        painelEntradas.add(campoFaixa);
        
        // Painel de Botões
        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btnCalcular = new JButton("Calcular");
        JButton btnExportar = new JButton("Exportar Histórico (CSV)");
        painelBotoes.add(btnCalcular);
        painelBotoes.add(btnExportar);

        // Área de Resultado
        areaResultado.setEditable(false);
        areaResultado.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(areaResultado);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Resultados e Histórico"));

        // Adiciona painéis à janela
        add(painelEntradas, BorderLayout.NORTH);
        add(painelBotoes, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        // Listeners dos botões
        btnCalcular.addActionListener(e -> calcularIMC());
        btnExportar.addActionListener(e -> exportarHistorico());
    }

    private void configurarListeners() {
        // Habilita/desabilita o campo de faixa etária
        infantilBox.addActionListener(e -> campoFaixa.setEnabled(infantilBox.isSelected()));
        campoFaixa.setEnabled(false); // Inicia desabilitado
    }

    private void calcularIMC() {
        String nome = campoNome.getText();
        String peso = campoPeso.getText();
        String altura = campoAltura.getText();
        boolean isInfantil = infantilBox.isSelected();
        String faixaEtaria = campoFaixa.getText();
        
        Pessoa p = controller.registrarIMC(nome, peso, altura, isInfantil, faixaEtaria);
        
        if (p != null) {
            String resultado = String.format("Nome: %s, Tipo: %s, IMC: %.2f (%s)\n",
                p.getNome(), p.getTipo(), p.calcularIMC(), p.classificarIMC());
            areaResultado.append(resultado);
            // Limpa os campos após o cálculo
            campoNome.setText("");
            campoPeso.setText("");
            campoAltura.setText("");
            campoFaixa.setText("");
        }
    }

    private void exportarHistorico() {
        if (controller.getHistorico().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O histórico está vazio. Não há nada para exportar.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Salvar Histórico como CSV");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Arquivos CSV (*.csv)", "csv"));
        
        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            controller.exportarCSV(fileChooser.getSelectedFile().getAbsolutePath());
        }
    }

    public static void main(String[] args) {
        // Garante que a UI será criada na thread de eventos do Swing
        SwingUtilities.invokeLater(JanelaPrincipal::new);
    }
}