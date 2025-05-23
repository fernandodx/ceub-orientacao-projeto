import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void exibirDadosInternetRepouso(Dispositivo dispositivo) {  // principio barbara liscov: troca subtipo(celular) pelo tipo superior (dispositivo)
        dispositivo.acessarInternet();
        dispositivo.entrarModoEconomiaEnergia();
    }

    public static void main(String[] args) throws Exception {         // estatico: é criado e já vai a memória, está em tempo de compilação e não execução

        List <Dispositivo> dispositivos = new ArrayList<>();
        dispositivos.add(new Celular());
        dispositivos.add(new VideoGame());
        dispositivos.add(new RoboAspirador());
        Collections.shuffle(dispositivos); // shuffle: embaralha lista

        for(Dispositivo d : dispositivos) {
            exibirDadosInternetRepouso(d);
        }
        
        RoboAspirador robo1 = new RoboAspirador();
        RoboIRoomba robo2 = new RoboIRoomba();
        robo1.aspirar();
        robo2.aspirar();

    }
}

abstract class Dispositivo {
    protected Double porcentagemBateria;
    public abstract void acessarInternet();
    public abstract void entrarModoEconomiaEnergia();
}

class Celular extends Dispositivo {

    public void realizarLigação() {
        System.out.println("Realizando ligação telefônica");
    }

    @Override
    public void acessarInternet() {
        System.out.println("Criando conexão 4g");
    }

    @Override
    public void entrarModoEconomiaEnergia() {
        System.out.println("Diminuindo o brilho da tela");
    }
    

}

class VideoGame extends Dispositivo {

    public void executarJogo() {
        System.out.println("Entrando no jogo");
    }

    @Override

    public void acessarInternet() {
        System.out.println("Iniciando conexão com  RJ45");
    }

    @Override
    public void entrarModoEconomiaEnergia() {
        System.out.println("Desliga o controle");
    }
    
}

class RoboAspirador extends Dispositivo {

    public void aspirar() {
        System.out.println("Iniciando aspiração de pó");
    }

    @Override
    public void acessarInternet() {
        System.out.println("Iniciar conexão com wifi");
    }

    @Override
    public void entrarModoEconomiaEnergia() {
        System.out.println("Retorna para a base");
    }

}

class RoboMondial extends RoboAspirador {

}

class RoboIRoomba extends RoboAspirador {
    @Override
    public void aspirar() {
        System.out.println("Mapeando a casa");
        super.aspirar();
    }
}