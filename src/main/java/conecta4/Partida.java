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

    public void ponerFicha(int turno) {
        Scanner teclat = new Scanner(System.in);
        if (turno == 1) {
            System.out.println("\nTurno del primer(1) jugador 'X'");
        } else {
            System.out.println("\nTurno del segundo(2) jugador 'O'");
        }

        System.out.printf("Elige una columna donde poner la ficha [1-%d] ", this.tablero.col);
        int ponerFicha = teclat.nextInt();
        teclat.nextLine();
        ponerFicha = ponerFicha - 1;

        // mirar si estas poniendo ficha fuera o si la columna esta llena
        // while (ponerFicha > this.tablero.tablero[0].length - 1 || ponerFicha < 0
        // || this.tablero.columnaLlena(ponerFicha)) {
        // if (this.tablero.columnaLlena(ponerFicha)) {
        // System.err.println("Columna llena! elige otra columna");
        // } else {
        // System.err.println("Error, columna no valida!");
        // }

        while (ponerFicha > this.tablero.tablero[0].length - 1 || ponerFicha < 0
                || this.tablero.columnaLlena(ponerFicha)) {
            if (ponerFicha > this.tablero.tablero.length - 1 || ponerFicha < 0) {
                System.err.println("Error, columna no valida!");
                System.out.printf("Elige una columna donde poner la ficha [1-%d] ", this.tablero.col);
                ponerFicha = teclat.nextInt();
                ponerFicha = ponerFicha - 1;
                teclat.nextLine();

            } else if (this.tablero.columnaLlena(ponerFicha)) {
                System.err.println("Columna llena! elige otra columna");
                System.out.printf("Elige una columna donde poner la ficha [1-%d] ", this.tablero.col);
                ponerFicha = teclat.nextInt();
                ponerFicha = ponerFicha - 1;
                teclat.nextLine();
            }
        }

        // System.out.printf("Elige una columna donde poner la ficha [1-%d] ",
        // this.tablero.col);
        // ponerFicha = teclat.nextInt();
        // ponerFicha = ponerFicha - 1;
        // teclat.nextLine();
        // }

        // poner ficha
        int fil = this.tablero.tablero.length - 1;
        boolean turnoAcabado = false;
        while (fil >= 0 && !turnoAcabado) { // bucle que recorre el array de las columnas
            if (this.tablero.tablero[fil][ponerFicha] == ' ') {
                if (turno == 1) {
                    this.tablero.tablero[fil][ponerFicha] = 'x';
                } else {
                    this.tablero.tablero[fil][ponerFicha] = 'o';
                }
                turnoAcabado = true;
            }
            fil--;
        }
    }

    public boolean empate() {
        Scanner teclat = new Scanner(System.in);
        String comandoSalir = "";
        boolean repetir = false;
        if (this.tablero.tableroLleno()) {
            System.out.println("\n===================================");
            System.out.println("EMPATE!");
            System.out.println("===================================");

            System.out.println("Repetir? (si/no) ");
            comandoSalir = teclat.nextLine();
            this.validarSiNo(comandoSalir);
            if (comandoSalir.equalsIgnoreCase("si")) {
                repetir = true;
                System.out.println("\n===================================");
            } else if (comandoSalir.equalsIgnoreCase("no")) {
                repetir = false;
            }
        }
        return repetir;
    }

    public boolean ganador() {
        Scanner teclat = new Scanner(System.in);
        String comandoSalir = "";
        boolean repetir = false;
        if (this.tablero.validaGanador() == 1) {
            System.out.println("\n===================================");
            System.out.println("JUGADOR 1 (X) GANADOR!");
            System.out.println("===================================");

        } else if (this.tablero.validaGanador() == 2) {
            System.out.println("\n===================================");
            System.out.println("JUGADOR 2 (O) GANADOR!");
            System.out.println("===================================");

        }
        System.out.println("Repetir? (si/no) ");
        comandoSalir = teclat.nextLine();
        this.validarSiNo(comandoSalir);
        if (comandoSalir.equalsIgnoreCase("si")) {
            repetir = true;
            System.out.println("\n===================================");
        } else if (comandoSalir.equalsIgnoreCase("no")) {
            repetir = false;
        }
        return repetir;
    }

    public void validarSiNo(String respuesta) {
        Scanner teclat = new Scanner(System.in);
        while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
            System.err.println("Error, opción inválida!");
            System.out.print("Repetir? (si/no) ");
            respuesta = teclat.nextLine();
        }
    }
}