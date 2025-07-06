package controller; 

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.RegistroIMC;
import model.RegistroIMCInfantil;
import model.contract.IIMCController;

public class IMCController implements IIMCController {

    private final List<RegistroIMC> historicoAdulto = new ArrayList<>();
    private final List<RegistroIMC> historicoInfantil = new ArrayList<>();

    @Override
    public void adicionarRegistro(String nome, double peso, double altura) {
        RegistroIMC registro = new RegistroIMC(nome, peso, altura);
        historicoAdulto.add(registro);
    }

    @Override
    public void adicionarRegistroInfantil(String nome, double peso, double altura, int idadeMeses) {
        RegistroIMCInfantil registro = new RegistroIMCInfantil(nome, peso, altura, idadeMeses);
        historicoInfantil.add(registro);
    }

    @Override
    public List<RegistroIMC> getHistorico() {
        return historicoAdulto;
    }

    @Override
    public List<RegistroIMC> getHistoricoInfantil() {
        return historicoInfantil;
    }

    //  Método adicional: Buscar por nome (adulto e infantil)
    public List<RegistroIMC> buscarPorNome(String nome) {
        List<RegistroIMC> resultados = new ArrayList<>();
        resultados.addAll(historicoAdulto.stream()
            .filter(r -> r.getNome().equalsIgnoreCase(nome))
            .collect(Collectors.toList()));
        resultados.addAll(historicoInfantil.stream()
            .filter(r -> r.getNome().equalsIgnoreCase(nome))
            .collect(Collectors.toList()));
        return resultados;
    }

    // Método adicional: Remover um registro pelo nome (primeira ocorrência)
    public boolean removerRegistro(String nome) {
        return historicoAdulto.removeIf(r -> r.getNome().equalsIgnoreCase(nome)) ||
               historicoInfantil.removeIf(r -> r.getNome().equalsIgnoreCase(nome));
    }

    //  Método adicional: Obter todos os registros (misturado)
    public List<RegistroIMC> getHistoricoCompleto() {
        List<RegistroIMC> completo = new ArrayList<>(historicoAdulto);
        completo.addAll(historicoInfantil);
        return completo;
    }
}
