public class Barco {
    private String simbolo;
    private String color;


    public Barco(String simbolo, String color) {
        this.simbolo = simbolo;
        this.color = color;
    }

    @Override
    public String toString() {
        return color+simbolo;
    }


}
