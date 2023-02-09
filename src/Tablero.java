public class Tablero {
    private final Casilla [][] tablero = new Casilla[10][10];

    public Tablero() {
        initTablero();
    }

    public void initTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = new Casilla();
            }
        }
    }

    public void setTablero(Casilla c, int x, int y) {
        tablero[x][y] = c;
    }

    public Casilla[][] getTablero() {
        return tablero;
    }



}
