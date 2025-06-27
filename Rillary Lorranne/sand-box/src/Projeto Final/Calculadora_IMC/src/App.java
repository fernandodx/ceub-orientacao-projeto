package app;

import javax.swing.SwingUtilities;
import view.JanelaPrincipal;

public class App {
    public static void main(String[] args) {
        System.out.println("Aplicação Calculadora de IMC iniciando...");

        // A interface gráfica deve sempre rodar na Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            new JanelaPrincipal(); // Cria e exibe a janela
            System.out.println("Interface carregada com sucesso.");
        });
    }
}
