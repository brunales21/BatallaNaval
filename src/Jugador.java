import java.util.Scanner;

public class Jugador {
    private Scanner sc = new Scanner(System.in);
    private Casilla[][] tablero;
    private String tipo;


    public Jugador() {
        tablero = new Tablero().getTablero();
    }
    public void colocarBarcos() {
        for (int i = 0; i<5; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            tablero[x][y] = Barco.getBarco();
        }
    }

    public void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }
}
