//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Carro meuCarro = new Carro("Ember", "854.452.963-98", "OBO-9632","Honda","NSX");

        Moto minhaMoto = new Moto("Bruno", "854.632.714-89", "LOL-6532","Kawasaki","Ninja");

        System.out.println("[------Carro------]");
        System.out.println(meuCarro);
        meuCarro.acelerar();
        meuCarro.frear();

        System.out.println("[-------Moto------]");
        System.out.println(minhaMoto);
        minhaMoto.acelerar();
        minhaMoto.frear();

    }
}