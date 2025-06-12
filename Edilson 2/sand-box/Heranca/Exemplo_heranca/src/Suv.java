public class Suv  extends Carro {

    public Suv(String modelo, int ano) {
        super(modelo, ano);
        
    }


    @Override 
    void Ligar() {
        System.out.println("Acende farol");
        super.Ligar();
    }
}
