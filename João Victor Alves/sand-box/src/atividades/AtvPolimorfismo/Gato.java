public class Gato extends AnimalEstimacao {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void Som() {
        System.out.println(nome + ": Miau");
    }
}
