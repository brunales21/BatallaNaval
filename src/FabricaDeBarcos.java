public class FabricaDeBarcos {

    private static final int CANTIDAD_BARCOS = 5;

    public Barco[] getNewBarcos() {
        Barco[] barcos = new Barco[CANTIDAD_BARCOS];
        for (int i = 0; i < barcos.length; i++) {
            barcos[i] = new Barco("* ", Color.WHITE_BOLD_BRIGHT);
        }
        return barcos;
    }
}
