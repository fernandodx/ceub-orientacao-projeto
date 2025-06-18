public class Cachorro extends AnimalEstimacao {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void Som() {
        System.out.println(nome + ": Au Au");
    }
}
