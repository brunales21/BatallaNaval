import java.util.Scanner;

public class JugadorHumano extends Jugador {

    private Scanner sc = new Scanner(System.in);

    public JugadorHumano(Barco[] barcos) {
        super(barcos);
    }


    @Override
    public void lanzarBomba(Jugador jugadorBot) {

        String coordenadas = sc.nextLine().replaceAll(" ", "");
        int x = Integer.parseInt(coordenadas.charAt(0)+"");
        int y = coordenadas.charAt(1)-65;

        if (jugadorBot.containsBarcoAtPos(x, y)) {
            jugadorBot.setTablero(new Casilla(new Barco(true)), x, y);
            //System.out.println("tocado");
        }
        else {
            jugadorBot.setTablero(new Casilla(true), x, y);
            //System.out.println("aguas");
        }
    }

    @Override
    public void colocarBarcos() {
        for (int i = 0; i < 5; i++) {
            String coordenadas = sc.nextLine().replaceAll(" ", "");
            int x = Integer.parseInt(coordenadas.charAt(0)+"");
            int y = Integer.parseInt(coordenadas.charAt(1)+"");
            setTablero2(new Casilla(super.getBarcos()[i]), x, y);
        }
    }


}
