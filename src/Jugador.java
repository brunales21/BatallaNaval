public abstract class Jugador {
    private Barco[] barcos;
    private Casilla[][] tablero;
    public Jugador(Barco[] barcos) {
        tablero = new Tablero().getTablero();
        this.barcos = barcos;
    }

    public abstract void lanzarBomba(Jugador jugador);

    public abstract void colocarBarcos();
    public Casilla[][] getTablero() {
        return tablero;
    }

    public void setTablero(Casilla c, int x, int y) {
        tablero[x][y] = c;
    }

    public Barco[] getBarcos() {
        return barcos;
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

    public boolean containsBarcoAtPos(int x, int y) {
        return tablero[x][y].isBarco();
    }


}
