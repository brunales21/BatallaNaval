import java.util.Random;
import java.util.Scanner;

public abstract class Jugador {
    private Barco barco;
    private Casilla[][] tablero;
    public Jugador() {
        tablero = new Tablero().getTablero();
        barco = new Barco("*", Color.RED);
    }

    public abstract void lanzarBomba(Jugador jugador);

    public abstract void colocarBarcos();
    public Casilla[][] getTablero() {
        return tablero;
    }

    public void setTablero(Casilla c, int x, int y) {
        tablero[x][y] = c;
    }

    public Barco getBarco() {
        return barco;
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

    public boolean containsBarco(int x, int y) {
        return barco.equals(tablero[x][y]);
    }
}
