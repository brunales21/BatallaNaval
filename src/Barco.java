public class Barco {
    private Casilla[][] barco;
    private String simbolo = "* ";
    private String color = Color.PURPLE;
    private boolean damaged;


    public Barco(boolean damaged) {
        if (damaged) {
            this.simbolo = "* ";
            this.color = Color.RED;
        } else{
            new Barco();
        }
    }

    public Barco() {
        this.simbolo = simbolo;
        this.color = color;
    }

    @Override
    public String toString() {
        return color+simbolo;
    }


}
