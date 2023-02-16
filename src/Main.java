import java.util.Random;

public class Main {
    public static void main(String[] args) {


        cleanConsole();
        FabricaDeBarcos fdb = new FabricaDeBarcos();

        Jugador jh = new JugadorHumano(fdb.getNewBarcos());
        Jugador jb = new JugadorBot(fdb.getNewBarcos());

        jh.colocarBarcos();
        jb.colocarBarcos();

        do {
            cleanConsole();
            jb.mostrarTablero();
            jh.mostrarTablero2();

            jh.lanzarBomba(jb);
            jb.lanzarBomba(jh);

            sleep(1);

        } while (true);
    }

    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            //  Handle any exceptions.
        }
    }

    public static void cleanConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void sleep(int s) {
        try {
            Thread.sleep(s* 1000L); // detiene la ejecución durante 3 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    


}