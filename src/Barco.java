public class Barco {
    private Casilla[][] barco;
    private String simbolo = "* ";
    private String color = Color.PURPLE;


    public Barco() {
        this.simbolo = simbolo;
        this.color = color;
    }

    @Override
    public String toString() {
        return color+simbolo;
    }


}
