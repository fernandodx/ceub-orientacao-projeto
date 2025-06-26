package view;

import controller.IMCController;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.RegistroIMC;
import model.contract.IIMCController;

public class JanelaPrincipal extends JFrame {
    
    private JTextField txtNome = new JTextField(20);
    private JTextField txtPeso = new JTextField(5);
    private JTextField txtAltura = new JTextField(5);
    private JTextField txtIdade = new JTextField(5);
    private JCheckBox chkInfantil = new JCheckBox("Cálculo Infantil");
    private JTextArea txtAreaResultado = new JTextArea(10, 30);
    
    private IMCController controller = new IMCController();
    
    public JanelaPrincipal() {
        super("Calculadora IMC");
        
        setLayout(new BorderLayout());
        
      
        JPanel panelEntrada = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        

        gbc.gridx = 0; gbc.gridy = 0;
        panelEntrada.add(new JLabel("Nome: "), gbc);
        gbc.gridx = 1;
        panelEntrada.add(txtNome, gbc);
        

        gbc.gridx = 0; gbc.gridy = 1;
        panelEntrada.add(new JLabel("Peso (Kg):"), gbc);
        gbc.gridx = 1;
        panelEntrada.add(txtPeso, gbc);
        
 
        gbc.gridx = 0; gbc.gridy = 2;
        panelEntrada.add(new JLabel("Altura (m):"), gbc);
        gbc.gridx = 1;
        panelEntrada.add(txtAltura, gbc);
        
 
        gbc.gridx = 0; gbc.gridy = 3;
        gbc.gridwidth = 2;
        panelEntrada.add(chkInfantil, gbc);
        
    
        gbc.gridx = 0; gbc.gridy = 4;
        gbc.gridwidth = 1;
        JLabel lblIdade = new JLabel("Idade (anos):");
        lblIdade.setVisible(false);
        panelEntrada.add(lblIdade, gbc);
        gbc.gridx = 1;
        txtIdade.setVisible(false);
        panelEntrada.add(txtIdade, gbc);
        
    
        chkInfantil.addActionListener(e -> {
            boolean isInfantil = chkInfantil.isSelected();
            lblIdade.setVisible(isInfantil);
            txtIdade.setVisible(isInfantil);
            pack();
        });
        
        add(panelEntrada, BorderLayout.NORTH);
        
     
        JPanel panelBotoes = new JPanel(new FlowLayout());
        
        JButton btnCalcular = new JButton("Calcular IMC");
        btnCalcular.addActionListener(this::calcularIMC);
        panelBotoes.add(btnCalcular);
        
        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.addActionListener(this::limparCampos);
        panelBotoes.add(btnLimpar);
        
        JButton btnExportar = new JButton("Exportar Histórico");
        btnExportar.addActionListener(this::exportarHistorico);
        panelBotoes.add(btnExportar);
        
        add(panelBotoes, BorderLayout.CENTER);
        
       
        txtAreaResultado.setEditable(false);
        txtAreaResultado.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(txtAreaResultado);
        scrollPane.setPreferredSize(new Dimension(500, 200));
        add(scrollPane, BorderLayout.SOUTH);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }