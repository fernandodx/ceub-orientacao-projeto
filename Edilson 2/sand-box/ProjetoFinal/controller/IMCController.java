package controller;

import model.RegistroIMC;
import model.contract.IIMCController;

import java.util.ArrayList;
import java.util.List;

public class IMCController implements IIMCController {

    private List<RegistroIMC> historico = new ArrayList<>();

    @Override
    public void adicionarRegistro(String nome, double peso, double altura) {
        RegistroIMC registro = new RegistroIMC(nome, peso, altura);
        historico.add(registro);
    }

    @Override
    public List<RegistroIMC> getHistorico() {
        return historico;
    }
}

