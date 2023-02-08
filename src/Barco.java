public class Barco extends Casilla {
    private static final Barco barco = new Barco("* ", Color.RED);

    public Barco(String simbolo, String color) {
        super(simbolo, color);
    }
    public static Barco getBarco() {
        return barco;
    }


}
