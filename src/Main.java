public class Main {
    public static void main(String[] args) {
        Tablero t = new Tablero();
        Casilla c = new Casilla("~", Color.BLUE);
        t.initTablero(c);
        t.mostrarTablero();
    }
}