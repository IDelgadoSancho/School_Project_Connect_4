package conecta4;

import java.util.Scanner;

public class Partida {

    Tauler tablero;

    public Partida() {
    }

    public Tauler getTablero() {
        return tablero;
    }

    public void setTablero(Tauler tablero) {
        this.tablero = tablero;
    }

    public void ponerFicha() {
        Scanner teclat = new Scanner(System.in);
        System.out.println("\nTurno del primer(1) jugador 'X'");
        System.out.printf("Elige una columna donde poner la ficha [1-%d] ", this.tablero.col);
        int ponerFicha = teclat.nextInt();
        teclat.nextLine();
        ponerFicha = ponerFicha - 1;

        // mirar si estas poniendo ficha fuera
        while (ponerFicha > this.tablero.tablero[0].length - 1 || ponerFicha < 0) {
            System.err.println("Error, columna no valida!");
            System.out.printf("Elige una columna donde poner la ficha [1-%d] ", this.tablero.col);
            ponerFicha = teclat.nextInt();
            ponerFicha = ponerFicha - 1;
            teclat.nextLine();
        }

        // poner ficha
        int fil = this.tablero.tablero.length - 1;
        boolean turnoAcabado = false;
        while (fil >= 0 && turnoAcabado) { // bucle que recorre el array de las columnas
            if (this.tablero.tablero[fil][ponerFicha] == ' ') {
                this.tablero.tablero[fil][ponerFicha] = 'x';
                turnoAcabado = true;
                fil--;
            }
        }
    }
}
