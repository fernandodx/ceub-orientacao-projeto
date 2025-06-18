public class Passaro extends AnimalEstimacao {

    public Passaro(String nome) {
        super(nome);
    }

    @Override
    public void Som() {
        System.out.println(nome + ": Cantando");
    }
}
