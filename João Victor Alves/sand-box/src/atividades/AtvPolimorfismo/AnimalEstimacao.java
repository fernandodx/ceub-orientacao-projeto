public abstract class AnimalEstimacao {
    protected String nome;

    // Construtor
    public AnimalEstimacao(String nome) {
        this.nome = nome;
    }

    // Método abstrato
    public abstract void Som();
}
