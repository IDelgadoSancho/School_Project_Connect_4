package conecta4;

public class Main {
    public static void main(String[] args) {
        // Creacion de clases
        Partida partida = new Partida();
        Tauler tablero = new Tauler();

        // Creacion d evariables
        int turno = 1;
        boolean repetir = true;

        // Creacion del tablero
        partida.setTablero(tablero);
        partida.tablero.creaTauler();

        // Bucle pincipal
        do {
            partida.tablero.vaciartablero();
            partida.tablero.mostraTauler();

            // Bucle poner fichas
            while (!partida.tablero.tableroLleno() /** || ganador */
            ) {
                partida.ponerFicha(turno);
                partida.tablero.mostraTauler();
                if (turno == 1) {
                    turno--;
                } else {
                    turno++;
                }
            }
            if (partida.tablero.tableroLleno()) {
                if (partida.empate()) {
                    repetir = true;
                } else {
                    repetir = false;
                }
            }
        } while (repetir);
    }
}