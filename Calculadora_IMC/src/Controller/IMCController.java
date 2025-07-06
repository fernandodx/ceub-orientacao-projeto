package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.RegistroIMC;
import Model.contract.IIMCController;

public class IMCController implements IIMCController {

    private List<RegistroIMC> historico = new ArrayList<>();

    @Override
    public void adicionarRegistro(String nome, Double peso, Double altura) {
        // Voce deve implemtar este metodo , Criar um registro imc e adicionar ele na
        // lista
    }

    @Override
    public List<RegistroIMC> getHistorico() {
        // Voce deve implemtar esse metodo
        return historico;
    }
}
