public class FabricaDeBarcos {

    private static final int CANTIDAD_BARCOS = 5;
    /*
    private static final Casilla[][] barco1 = {{new Casilla("* ", Color.PURPLE), }}
    private static final Casilla[][] barco2 = {}
    private static final Casilla[][] barco3 = {}
    private static final Casilla[][] barco4 = {}
    private static final Casilla[][] barco5 = {}
    
     */

    public Barco[] getNewBarcos() {
        Barco[] barcos = new Barco[CANTIDAD_BARCOS];
        for (int i = 0; i < barcos.length; i++) {
            barcos[i] = new Barco();
        }
        return barcos;
    }



}
