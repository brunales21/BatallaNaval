import java.util.Scanner;

public class JugadorHumano extends Jugador {

    private final Scanner sc = new Scanner(System.in);
    private final Barco barco = new Barco("* ", Color.RED);

    private static final  Barco lanzamientoHumanoAcertado = new Barco("X ",Color.RED);

    private static final  Barco lanzamientoHumanoFallido = new Barco("X ",Color.BLACK_BRIGHT);




    @Override
    public void lanzarBomba(Jugador jugador, Tablero comun) {
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (jugador.getTablero()[x][y].equals(jugador.getBarco())) {
            System.out.println("tocado");
            comun.getTablero()[x][y]=lanzamientoHumanoAcertado;
        }
        else {
            System.out.println("agua");
            comun.getTablero()[x][y]=lanzamientoHumanoFallido;

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
