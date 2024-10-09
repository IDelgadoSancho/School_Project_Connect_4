package conecta4;

import java.util.Scanner;

public class Tauler {
    int col;
    int numfil;
    char tablero[][];

    public Tauler() {
    }

    public int getcol() {
        return col;
    }

    public void setcol(int col) {
        this.col = col;
    }

    public int getnumfil() {
        return numfil;
    }

    public void setnumfil(int numfil) {
        this.numfil = numfil;
    }

    public char[][] getablero() {
        return tablero;
    }

    public void creaTauler() {
        Scanner teclat = new Scanner(System.in);
        int numnumfil = this.numfil;
        int numCol = this.col;
        // creacion array bidimensional (tablero)
        System.out.print("Cuantas numfilas quieres? (min 4) --> ");
        numnumfil = teclat.nextInt();
        System.out.print("Cuantas columnas quieres? (min 4) --> ");
        numCol = teclat.nextInt();

        // condicion para tablero mayor que 4x4
        while (numnumfil < 4 || numCol < 4) {
            System.err.println("\nError, el tablero ha de ser como minimo de 4 x 4!");
            System.out.print("Cuantas numfilas quieres? (min 4) --> ");
            numnumfil = teclat.nextInt();
            System.out.print("Cuantas columnas quieres? (min 4) --> ");
            numCol = teclat.nextInt();
            teclat.nextLine();
        }
        System.out.println();
        this.col = numCol;
        this.numfil = numnumfil;
        this.tablero = new char[numnumfil][numCol];
    }

    public void vaciartablero() {
        for (int f = 0; f < this.tablero.length; f++) {
            for (int c = 0; c < this.tablero[f].length; c++) {
                this.tablero[f][c] = ' ';
            }
        }
    }

    public void mostraTauler() {
        int numnumfil = this.numfil;
        int numCol = this.col;

        // mostrar tablero
        for (int f = 0; f < this.tablero.length; f++) {
            System.out.print("  ");
            for (int i = 0; i < numCol; i++) { // bucle para poner los "--------------------"
                System.out.printf("---");
            }
            System.out.println();
            System.out.printf("%2d", numnumfil); // numeros de las numfilas

            for (int c = 0; c < this.tablero[f].length; c++) {
                System.out.printf("[%s]", this.tablero[f][c]); // celdas
            }
            System.out.println();
            numnumfil--;
        }
        System.out.print("  ");
        for (int i = 0; i < numCol; i++) { // bucle para poner los "---------------" al final
            System.out.print("---");
        }
        System.out.println();
        System.out.print(" ");
        for (int i = 0; i < numCol; i++) { // numeros de cada columna
            System.out.printf("  %d", i + 1);
        }
        System.out.println();
    }

    public boolean columnaLlena(int columna) {
        boolean columnaLlena = false;
        int numfil = this.tablero.length - 1;
        columnaLlena = false;
        // comprueba la columna si esta llena
        while (numfil >= 0) {
            if (this.tablero[numfil][columna] == ' ') {
                columnaLlena = false;
            } else if (numfil == 0 && this.tablero[numfil][columna] != ' ') { // comprobar columan llena
                columnaLlena = true;
            }
            numfil--;
        }
        return columnaLlena;
    }

    public boolean tableroLleno() {
        boolean tableroLleno = false;
        int contLleno = 0;
        for (int c = 0; c < this.col; c++) {
            if (this.tablero[0][c] != ' ') {
                contLleno++;
            }
        }
        if (contLleno == this.col) {
            tableroLleno = true;
        }
        return tableroLleno;
    }

}
