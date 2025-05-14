public class MesaDeTeste {
    public static void main(String[] args) {
        Revolver magnum = new Revolver(5);
        magnum.carregar(new Cartucho(true));
        magnum.carregar(new Cartucho(false));
        magnum.carregar(new Cartucho(false));
        magnum.carregar(new Cartucho(false));
        magnum.embaralhar();

        Jogador boneco = new Jogador("Boneco de Teste");

        boneco.tentarAtirar(magnum);
        boneco.tentarAtirar(magnum);
        boneco.tentarAtirar(magnum);
        boneco.tentarAtirar(magnum);
        boneco.tentarAtirar(magnum);

    }
}
