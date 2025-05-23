public class App {
    public static void main(String[] args) throws Exception {
        Produto xicara = new Produto();
        xicara.setNome("xicara floral");
        xicara.setQuantidade(10);
        xicara.setPreco(15.99);

        xicara.comprar(20);
        xicara.vender(5);
    }
}
