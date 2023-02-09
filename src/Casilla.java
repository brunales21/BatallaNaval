public class Casilla {
    private Barco barco = null;

    static final String COLOR_AGUA = Color.BLUE;
    static final String SIMBOLO_AGUA = "~ ";
    static final String SIMBOLO_AGUATOCADA = "O ";


    private String color;
    private String simbolo;

    public Casilla() {

    }

    public Casilla(String simbolo, String color) {
        this.simbolo = simbolo;
        this.color = color;

    }



    public Casilla(Barco barco) {
        this.barco = barco;
    }

    public boolean isBarco() {
        return this.barco != null;
    }

    @Override
    public String toString() {
        if (barco == null) {
            return color + getWaterStatus();
        }
        return barco.toString();
    }

    public String getWaterStatus() {
        if (simbolo.equals(SIMBOLO_AGUA)) {
            return SIMBOLO_AGUA;
        } else {
            return SIMBOLO_AGUATOCADA;
        }
    }




}
