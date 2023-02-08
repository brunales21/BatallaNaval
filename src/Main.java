import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Jugador jh = new JugadorHumano();
        Jugador jb = new JugadorBot();

        jh.colocarBarcos();
        jb.colocarBarcos();

        jh.mostrarTablero();
        jb.mostrarTablero();

        jh.lanzarBomba(jb);
        jb.lanzarBomba(jh);





    }


}