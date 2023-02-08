public class Tablero {
    private final Casilla [][] tablero = new Casilla[10][10];

    private static Casilla agua = new Casilla("~ ", Color.BLUE);

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

    public void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void setTablero(Casilla c, int x, int y) {
        tablero[x][y] = c;
    }

    public Casilla[][] getTablero() {
        return tablero;
    }



}
