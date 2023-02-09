import java.util.Random;

public class JugadorBot extends Jugador {

    private Random random = new Random();

    public JugadorBot(Barco[] barcos) {
        super(barcos);
    }


    @Override
    public void lanzarBomba(Jugador jugador) {
        int x = random.nextInt(10);
        int y = random.nextInt(10);

        if (jugador.containsBarcoAtPos(x, y)) {
            System.out.println("tocado");
        }
        else {
            System.out.println("agua");
        }
    }

    @Override
    public void colocarBarcos() {
        int contadorBarcos = 0;

        int x;
        int y;
        do {
            x = random.nextInt(10);
            y = random.nextInt(10);
            if (!containsBarcoAtPos(x, y)) {
                setTablero(new Casilla(super.getBarcos()[contadorBarcos]), x, y);
                contadorBarcos++;
            }
        } while(contadorBarcos<5);
        System.out.println(x);
        System.out.println(y);
    }
}
