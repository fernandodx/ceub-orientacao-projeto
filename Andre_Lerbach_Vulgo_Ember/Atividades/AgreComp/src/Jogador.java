public class Jogador {
    private String nome;
    private int vida;

    public Jogador(String nome) {
        this.nome = nome;
        this.vida = 5;
    }

    public String getNome() {
        return nome;
    }

    public void tentarAtirar(Revolver revolver) {
        System.out.println(nome + " gira o tambor e aperta o gatilho...");
        Cartucho resultado = revolver.atirar();

        if (resultado != null && resultado.isVivo()) {
            vida--;
            System.out.println("[ --- BANG! --- ]"+
                                "\n Você vai conhecer Airton Senna em poucos segundos");
            System.out.println("Sua vida agora é: "+vida);
            System.out.println("");

        } else if (resultado != null) {
            System.out.println("[ --- Click!--- ]"+
                                "\n Cartucho vazio... ");
            System.out.println("");

        } else {
            System.out.println("[ --- Tambor Vazio!--- ]"+
                            "\n RECARREGUE!");
            System.out.println("");
        }

        if (vida == 0) {
            System.out.println("");
            System.out.println("[------------------------------]");
            System.out.println("[ --- Você morreu --- ]");
            System.out.println("[------------------------------]");
        }
    }
}