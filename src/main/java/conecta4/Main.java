package conecta4;

public class Main {
    public static void main(String[] args) {
        // Creacion de clases
        Partida partida = new Partida();
        Tauler tablero = new Tauler();

        partida.setTablero(tablero);
        
        partida.tablero.creaTauler();
        partida.tablero.mostraTauler();
        partida.ponerFicha();
        partida.tablero.mostraTauler();
    }
}