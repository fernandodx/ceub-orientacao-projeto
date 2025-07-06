package Model.contract;

import java.util.List;

import Model.RegistroIMC;

public interface IIMCController {
    void adicionarRegistro(String nome, Double peso, Double altura);
    List<RegistroIMC> getHistorico();  // vai ser lista de registro de imc
}
