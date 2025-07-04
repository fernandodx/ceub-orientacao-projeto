import controller.IMCController;
import model.Pessoa;
import model.RegistroIMC;
import view.JanelaPrincipal;

public class App {
    public static void main(String[] args) throws Exception {
    Pessoa pessoa = new RegistroIMC("Julia", 50.0, 1.77);
    if (pessoa instanceof RegistroIMC) {
            RegistroIMC registro = (RegistroIMC) pessoa;
            registro.calcularIMC();
            registro.classificarIMC();
            System.out.println(registro);
        }

    RegistroIMC registroIMC = new RegistroIMC("Julia", 70.0, 1.60);
    registroIMC.calcularIMC();
    registroIMC.classificarIMC();

    IMCController imcController = new IMCController();
    imcController.adicionarRegistro("Julia - 16/06/2025", 50.0, 1.77);
    for (RegistroIMC r : imcController.getHistorico()) {
        System.out.println(r);
    }
    new JanelaPrincipal();
    }
}
