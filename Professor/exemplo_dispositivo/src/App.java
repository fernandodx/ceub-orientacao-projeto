
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void exibirDadosInternetRepouso(Dispositivo dispositivo){
        dispositivo.acessarInternet();
        dispositivo.entrarModoEconomiaEnergia();
    }

    public static void main(String[] args) throws Exception {

        List<Dispositivo> dispositivos = new ArrayList<>();
        dispositivos.add(new Celular());
        dispositivos.add(new RoboAspirador());
        dispositivos.add(new VideoGame());
    
        Collections.shuffle(dispositivos);
        
        for(Dispositivo d : dispositivos) {
            // 1˚ exemplo de polimorfismo, mesmo método , objetos diferentes, comportamentos diferentes.
            // Isso resulta em polimorfismo na prática.
            exibirDadosInternetRepouso(d);
        }


        //2˚ parte Exemplo Override
        RoboAspirador robo = new RoboAspirador();
        RoboIRoomba roboIRoomba = new RoboIRoomba();

        robo.aspirar(); //aspirar normal
        roboIRoomba.aspirar(); //aspirar normal + mapear a casa

    }
}

abstract class Dispositivo {
    protected Double porcentagemBateria;
    public abstract void acessarInternet();
    public abstract void entrarModoEconomiaEnergia();
}

class Celular extends Dispositivo {

    public void realizarLigacao(){
        System.out.println("Realizando ligação telefônica");
    }

    @Override
    public void acessarInternet() { 
        System.out.println("Criando conexão 4G");
    }

    @Override
    public void entrarModoEconomiaEnergia() {
         System.out.println("Diminuir brilho da tela.");
    }
}

class VideoGame extends Dispositivo {

    public void executarJogo(){
        System.out.println("Executar Jogo");
    }

    @Override
    public void acessarInternet() {
        System.out.println("Iniciando conexão com RJ45");
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
       System.out.println("Iniciar com o WIFI");
    }

    @Override
    public void entrarModoEconomiaEnergia() {
        System.out.println("Retorna para a base");
    }

}

class  RoboMondial extends RoboAspirador {
    //Comportamento padrão herdado de RoboAspirado
}

class RoboIRoomba extends  RoboAspirador {

    @Override
    public void aspirar() {
        System.out.println("Mapeando a casa");
        super.aspirar();
    }
}