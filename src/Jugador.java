import java.util.Random;
import java.util.Scanner;

public class Jugador {

    private Random barcoOrdena = new Random();
    private Scanner sc = new Scanner(System.in);
    private Casilla[][] tablero;
    private boolean esHumano;


    public Casilla[][] getTablero() {
        return tablero;
    }

    public Jugador() {
        tablero = new Tablero().getTablero();
    }
    public Jugador(boolean esHumano) {
        this.esHumano=esHumano;
        tablero = new Tablero().getTablero();
    }

    public void colocarBarcos() {
        int indice=5;
        if (esHumano == true) {

            for (int i = 0; i < 5; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                tablero[x][y] = Barco.getBarco();
            }
        }else{
            while (indice>0){

                int x = barcoOrdena.nextInt(10);
                int y = barcoOrdena.nextInt(10);

                if (tablero[x][y].equals(Barco.getBarcoMachine()) || tablero[x][y].equals(Barco.getBarco())) {

                }else {
                    tablero[x][y] = Barco.getBarcoMachine();
                    indice--;
                }
            }

        }
    }

    public  void lanzamiento (Casilla [][] tableroComun, Jugador [][] j1, Jugador [][] j2 ){
        if (esHumano){
            int x = sc.nextInt();
            int y = sc.nextInt();

           if (j2[x][y].equals(Barco.getBarcoMachine())){
                System.out.println("Tocado");
                tableroComun[x][y]= Barco.getLanzamientoHumanoAcertadoGet();

            }else {
               System.out.println("Agua");
               tableroComun[x][y]=Barco.getLanzamientoHumanoFallidoGet();
           }
        }
    }

    public void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
