import java.util.Random;
import java.util.Scanner;

public class JugadorBot extends Jugador {

    private Random random = new Random();
    private final Barco barco = new Barco("* ", Color.PURPLE);


    @Override
    public Barco getBarco() {
        return barco;
    }

    @Override
    public void lanzarBomba(Jugador jugador, Tablero comun) {
        int x = random.nextInt(10);
        int y = random.nextInt(10);


        if (jugador.getTablero()[x][y].equals(jugador.getBarco())) {
            System.out.println("tocado");
        }
        else {
            System.out.println("agua");
        }
    }

    @Override
    public void colocarBarcos() {
        int contadorBarcos = 5;

        int x;
        int y;
        do {
            x = random.nextInt(10);
            y = random.nextInt(10);
            if (!getTablero()[x][y].equals(barco)) {
                setTablero(barco, x, y);
                contadorBarcos--;
            }
        } while(contadorBarcos>0);
        System.out.println(x);
        System.out.println(y);
    }
}
