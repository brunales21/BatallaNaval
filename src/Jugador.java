public abstract class Jugador {
    private Barco[] barcos;
    private Casilla[][] tablero;
    private Casilla[][] tablero2;
    public Jugador(Barco[] barcos) {
        Tablero tableros = new Tablero();
        tablero = tableros.getTablero();
        tablero2 = tableros.getTablero2();
        this.barcos = barcos;
    }

    public abstract void lanzarBomba(Jugador jugador);

    public abstract void colocarBarcos();
    public Casilla[][] getTablero() {
        return tablero;
    }

    public Casilla[][] getTablero2() {
        return tablero2;
    }

    public void setTablero(Casilla c, int x, int y) {
        tablero[x][y] = c;
    }

    public void setTablero2(Casilla c, int x, int y) {
        tablero2[x][y] = c;
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

    public void mostrarTablero2() {
        for (int i = 0; i < tablero2.length; i++) {
            for (int j = 0; j < tablero2[0].length; j++) {
                System.out.print(tablero2[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }



    public boolean containsBarcoAtPos(int x, int y) {
        return tablero2[x][y].isBarco();
    }


}
