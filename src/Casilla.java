public class Casilla {
    private Barco barco = null;

    public Casilla() {

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
            return Color.BLUE+"~ ";
        }
        return barco.toString();
    }

}
