import java.util.List;
import java.util.function.DoubleUnaryOperator;

public class App {
    public static void main(String[] args) throws Exception {
        

        List<Dispositivo> dispositivos = List.of(new Celular(), new RoboAspirador(), new VideoGame());
    }
}

abstract class Dispositivo {
    protected Double porcentagemBateria;
    public abstract void acessarInternet();
    public abstract void entrarModoEconomiaEnergia();

    
}


public class  Celular extends Dispositivo {

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

    public void executarJogo() {
        System.out.println("Executar Jogo");
    }

    @Override
    public void acessarInternet() {
        System.out.println("Iniciando conexão com RJ45");
    }

    @Override
    public void entrarModoEconomiaEnergia() {
        System.out.println("Delisgar o controle");
    }
    

    class RoboAspirador extends Dispositivo {

        
        public void apirar(){
            System.out.println("Aspirar");
        }

        @Override
        public void acessarInternet() {
            System.out.println("Iniciar com o WIFI");
        }

        @Override
        public void entrarModoEconomiaEnergia() {
           System.out.println("Retornar pra base");
        }

    }
}