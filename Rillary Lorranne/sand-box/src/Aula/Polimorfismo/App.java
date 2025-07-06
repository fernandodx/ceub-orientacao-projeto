import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.sound.midi.SysexMessage;

public class App {

    public static void  exibirDadosInternetRepouso(Dispositivo dispositivo) {
        dispositivo.acessarInternet();
        dispositivo.entrarModoEconomiaEnergia();
    }

        public static void main(String[] args) throws Exception {
        
        List<Dispositivo> dispositivos = new ArrayList<>();
        dispositivos.add(new Celular());
        dispositivos.add(new VideoGame());
        dispositivos.add(new RoboAspirador());

        Collections.shuffle(dispositivos);


        for(Dispositivo d : dispositivos)  {
            // 1° exemplo de polimorfismo, mesmo metodo, objetivo diferentes,comportamentos diferentes.
            // Isso resulta em polimorfismo na pratica
            exibirDadosInternetRepouso(d);
         } 

         //2° parte Exemplo Overrride
         RoboAspirador robo = new RoboAspirador();
         RoboIRoomba roboIRoomba = new RoboIRoomba();

         robo.aspirar();
         // robo.aspirar();  // aspirar normal
         roboIRoomba.aspirar();
         // aspirar normal + mapear a casa
         

    }
}

abstract class Dispositivo{
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
       System.out.println("Criando conexão 4G");
    }

    @Override
    public void entrarModoEconomiaEnergia() {
       System.out.println("Diminuir o Brilho da Tela");
    }

}

class VideoGame extends Dispositivo {

    public void executarJogo () {
        System.out.println("Executar Jogo");
    }

    @Override
    public void acessarInternet() {
      System.out.println("Iniciando conexão com RJ45");
    }

    @Override
    public void entrarModoEconomiaEnergia() {
       System.out.println("Desligar o controle");
    }

}

class RoboAspirador extends Dispositivo {

public void aspirar() {
    System.out.println("Iniciando aspiração de pó");
}

    @Override
    public void acessarInternet() {
       System.out.println("Iniciar com WIFI");
    }

    @Override
    public void entrarModoEconomiaEnergia() {
        System.out.println("Retornar para a base");
    }

}

class RoboMundial extends RoboAspirador {
    // Comportamento padrão herdado de robo aspirador 

}

class RoboIRoomba extends RoboAspirador {

    @Override
    public void aspirar() {
        System.out.println("Mapeando a casa");
        super.aspirar();
    }
} 
    
