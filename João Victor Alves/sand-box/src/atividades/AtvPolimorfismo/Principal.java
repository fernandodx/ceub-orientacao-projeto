import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Criando uma lista de animais de estimação
        ArrayList<AnimalEstimacao> animais = new ArrayList<>();

        // Adicionando diferentes tipos de animais
        animais.add(new Cachorro("Astolfo"));
        animais.add(new Gato("Roberto"));
        animais.add(new Passaro("Eustacio"));

        // Percorrendo a lista e fazendo cada animal emitir seu som
        for (AnimalEstimacao animal : animais) {
            animal.Som();
        }
    }
}
