public class Tablero {
    private final Casilla [][] tablero = new Casilla[10][10];
    private final Casilla [][] tablero2 = new Casilla[10][10];


    public Tablero() {
        initTableros();
    }

    public void initTableros() {
        initTablero();
        initTablero2();
    }

    public void initTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = new Casilla();
            }
        }
    }

    public void initTablero2() {
        for (int i = 0; i < tablero2.length; i++) {
            for (int j = 0; j < tablero2[0].length; j++) {
                tablero2[i][j] = new Casilla();
            }
        }
    }

    public void setTablero(Casilla c, int x, int y) {
        tablero[x][y] = c;
    }

    public Casilla[][] getTablero() {
        return tablero;
    }

    public Casilla[][] getTablero2() {
        return tablero2;
    }
}
