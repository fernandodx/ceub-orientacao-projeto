package controller;

import model.Pessoa;
import model.RegistroIMC;
import model.RegistroIMCInfantil;
import model.contract.IIMCController;

import java.util.ArrayList;
import java.util.List;

public class IMCController implements IIMCController { // Renomeado para JIMCController

    // O histórico agora armazena objetos do tipo Pessoa, permitindo polimorfismo
    // para RegistroIMC e RegistroIMCInfantil
    private List<Pessoa> historico = new ArrayList<>();

    @Override
    public void adicionarRegistro(String nome, double peso, double altura, boolean isInfantil) {
        // Adiciona um novo registro ao histórico, criando o tipo correto (adulto ou infantil)
        if (isInfantil) {
            RegistroIMCInfantil registro = new RegistroIMCInfantil(altura, nome, peso);
            historico.add(registro);
        } else {
            RegistroIMC registro = new RegistroIMC(altura, nome, peso);
            historico.add(registro);
        }
    }

    @Override
    public List<Pessoa> getHistorico() {
        // Retorna a lista completa do histórico de registros (adultos e infantis)
        return historico;
    }
}
