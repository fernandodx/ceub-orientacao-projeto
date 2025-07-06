package model.contract;

import java.util.List;
import model.RegistroIMC;

public interface IIMCController {
    
    // Registro de adultos
    void adicionarRegistro(String nome, double peso, double altura);

    // Registro de crianças
    void adicionarRegistroInfantil(String nome, double peso, double altura, int idadeMeses);

    // Histórico separado
    List<RegistroIMC> getHistorico();
    List<RegistroIMC> getHistoricoInfantil();

    // Histórico completo (mistura adultos e infantis)
    List<RegistroIMC> getHistoricoCompleto();

    // Busca
    List<RegistroIMC> buscarPorNome(String nome);

    // Remoção
    boolean removerRegistro(String nome);

    // Exportação
    boolean exportarHistoricoCSV(String caminhoArquivo); // true se sucesso
}
