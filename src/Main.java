import java.util.Random;

        public class Main {
            public static void main(String[] args) {
                Tablero comun= new Tablero();
                Jugador jh = new JugadorHumano();
                Jugador jb = new JugadorBot();

                jh.colocarBarcos();
                jb.colocarBarcos();

                jh.mostrarTablero();
                jb.mostrarTablero();

                jh.lanzarBomba(jb,comun);
                jb.lanzarBomba(jh,comun);

                comun.mostrarTablero();





            }




        }


