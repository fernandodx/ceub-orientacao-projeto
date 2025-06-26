package model.contract;

import java.util.List;
import model.RegistroIMC;

public interface IIMCController {
    void adicionarRegistro(String nome, double peso, double altura);
    List<RegistroIMC> getHistorico();
}