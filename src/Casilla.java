import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Casilla {
    private Barco barco = null;
    private String color;
    private String simbolo;
    static final String SIMBOLO_AGUA = "~ ";
    static final String SIMBOLO_AGUATOCADA = "O ";

    public Casilla(boolean damaged) {
        if (damaged){
            this.simbolo = SIMBOLO_AGUATOCADA;
        } else {
            this.simbolo = SIMBOLO_AGUA;
        }
        this.color = Color.BLUE;

    }
    public Casilla() {
        this.simbolo = SIMBOLO_AGUA;
        this.color = Color.BLUE;
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
