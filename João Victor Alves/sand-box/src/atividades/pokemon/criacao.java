package Atividades.pokemon;

public class Criacao {
    public static void main(String[] args) throws Exception {
        Pokemon pikachu = new Pokemon("Pikachu", 5);
        Pokemon charmander = new Pokemon("Charmander", 4);

        Luta luta = new Luta(pikachu, charmander);
        luta.iniciarLuta();

        pikachu.apresentarLutas();
        charmander.apresentarLutas();

        Ginasio ginasio = new Ginasio("Ginásio da Cidade Verde");
        Treinamento treino1 = new Treinamento("Treino de Força", 45);
        Treinamento treino2 = new Treinamento("Treino de Velocidade", 30);

        ginasio.registrarTreinamento(pikachu, treino1);
        ginasio.registrarTreinamento(pikachu, treino2);
        ginasio.registrarTreinamento(charmander, treino1);

        pikachu.apresentarGinasios();
        charmander.apresentarGinasios();
    }
}

