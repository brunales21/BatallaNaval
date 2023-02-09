import java.util.Random;

public class Main {
    public static void main(String[] args) {

        FabricaDeBarcos fdb = new FabricaDeBarcos();

        Jugador jh = new JugadorHumano(fdb.getNewBarcos());
        Jugador jb = new JugadorBot(fdb.getNewBarcos());

        jh.colocarBarcos();
        jb.colocarBarcos();

        jh.mostrarTablero();
        jb.mostrarTablero();

        jh.lanzarBomba(jb);
        jb.lanzarBomba(jh);





    }


}