import view.JanelaPrincipal;

public class App {
    public static void main(String[] args) throws Exception {
       
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();   
        }
        
        SwingUtilities.invokeLater(() -> {
            new JanelaPrincipal();
        });
    }
}