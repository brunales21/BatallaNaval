import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Jugador bru = new Jugador(true);
        Jugador mach = new Jugador(false);

        bru.mostrarTablero();
        bru.colocarBarcos();
        bru.mostrarTablero();

        mach.colocarBarcos();
        mach.mostrarTablero();



    }


}