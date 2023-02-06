public class Casilla {
    private String simbolo;

    private String color;

    public Casilla(String simbolo, String color) {
        this.simbolo = simbolo;
        this.color = color;
    }

    @Override
    public String toString() {
        return simbolo+color;
    }
}
