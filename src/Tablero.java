public class Tablero {
    private Casilla [][] tablero = new Casilla[10][10];
    private Casilla agua = new Casilla("~ ", Color.BLUE);

    public Tablero() {
        initTablero(agua);
    }
    public void initTablero(Casilla s) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = s;
            }
        }
    }

    public Casilla[][] getTablero() {
        return tablero;
    }
}
