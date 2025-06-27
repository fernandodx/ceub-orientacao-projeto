package model.contract;

import model.Pessoa; // Importado para permitir List<Pessoa>

import java.util.List;

public interface IIMCController {
    // Método para adicionar um registro ao histórico, agora com um indicador se é infantil
    void adicionarRegistro(String nome, double peso, double altura, boolean isInfantil);

    // Método para obter o histórico, retornando uma lista de objetos Pessoa (polimorfismo)
    List<Pessoa> getHistorico();
}
