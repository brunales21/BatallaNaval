import java.util.Scanner;

public class JugadorHumano extends Jugador {

    private Scanner sc = new Scanner(System.in);

    public JugadorHumano(Barco[] barcos) {
        super(barcos);
    }


    @Override
    public void lanzarBomba(Jugador jugador) {
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (jugador.containsBarcoAtPos(x, y)) {
            System.out.println("tocado");
        }
        else {
            System.out.println("agua");
        }

    }

    @Override
    public void colocarBarcos() {
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            getTablero()[x][y] = new Casilla(super.getBarcos()[i]);
        }

    }
}
