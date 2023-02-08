public class Barco extends Casilla {
    private static final Barco barco = new Barco("* ", Color.RED);

    private static final Barco barcoMachine = new Barco("º ", Color.PURPLE);

    private static final  Barco lanzamientoHumanoAcertado = new Barco("X ",Color.RED);

    private static final  Barco lanzamientoHumanoFallido = new Barco("X ",Color.BLACK_BRIGHT);

    public Barco(String simbolo, String color) {
        super(simbolo, color);
    }
    public static Barco getBarco() {
        return barco;
    }
    public  static Barco getBarcoMachine(){
        return barcoMachine;
    }

    public static Barco getLanzamientoHumanoAcertadoGet() {
        return lanzamientoHumanoAcertado;
    }
    public static Barco getLanzamientoHumanoFallidoGet() {
        return lanzamientoHumanoFallido;
    }



}
