public class Casilla {
    private String simbolo;

    private String color;

    public Casilla(String simbolo, String color) {
        this.simbolo = simbolo;
        this.color = color;
    }

    public Casilla(String s) {
        this.simbolo = s;
    }

    public Casilla() {

    }

    @Override
    public String toString() {
        return color + simbolo;
    }

}
