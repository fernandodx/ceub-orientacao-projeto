public class Cartucho {
    private boolean isVivo;

    public Cartucho(boolean isVivo) {
        this.isVivo = isVivo;
    }

    public boolean isVivo() {
        return isVivo;
    }

    @Override
    public String toString() {
        return isVivo ? "Cartucho VIVO" : "Cartucho VAZIO";
    }
}