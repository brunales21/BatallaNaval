import java.util.Scanner;

public class JugadorHumano extends Jugador {

    private Scanner sc = new Scanner(System.in);
    private final Barco barco = new Barco("* ", Color.RED);

    private static final  Barco lanzamientoHumanoAcertado = new Barco("X ",Color.RED);

    private static final  Barco lanzamientoHumanoFallido = new Barco("X ",Color.BLACK_BRIGHT);


    @Override
    public void lanzarBomba(Jugador jugador) {
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (jugador.containsBarco(x, y)) {
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
            getTablero()[x][y] = barco;
        }

    }
}
