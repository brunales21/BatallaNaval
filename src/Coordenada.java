public abstract class Coordenada {
    static char[] getLetras() {
        char[] abecedario = new char[26];
        for (int i = 0; i < abecedario.length; i++) {
            abecedario[i] = (char)('A' + i);
        }
        return abecedario;
    }

    static int[] getNumeros() {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }
        return numeros;
    }
}
