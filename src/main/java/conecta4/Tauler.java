package conecta4;

import java.util.Scanner;

public class Tauler {
    int col;
    int fil;
    char tablero[][];

    public Tauler() {
    }

    public int getcol() {
        return col;
    }

    public void setcol(int col) {
        this.col = col;
    }

    public int getfil() {
        return fil;
    }

    public void setfil(int fil) {
        this.fil = fil;
    }

    public char[][] getablero() {
        return tablero;
    }

    public void creaTauler() {
        Scanner teclat = new Scanner(System.in);
        int numFil = this.fil;
        int numCol = this.col;
        // creacion array bidimensional (tablero)
        System.out.print("Cuantas filas quieres? (min 4) --> ");
        numFil = teclat.nextInt();
        System.out.print("Cuantas columnas quieres? (min 4) --> ");
        numCol = teclat.nextInt();

        // condicion para tablero mayor que 4x4
        while (numFil < 4 || numCol < 4) {
            System.err.println("\nError, el tablero ha de ser como minimo de 4 x 4!");
            System.out.print("Cuantas filas quieres? (min 4) --> ");
            numFil = teclat.nextInt();
            System.out.print("Cuantas columnas quieres? (min 4) --> ");
            numCol = teclat.nextInt();
            teclat.nextLine();
        }
        System.out.println();
        this.col = numCol;
        this.fil = numFil;
        this.tablero = new char[numFil][numCol];

        // llenar el array con espacion en blanco
        for (int f = 0; f < this.tablero.length; f++) {
            for (int c = 0; c < this.tablero[f].length; c++) {
                this.tablero[f][c] = ' ';
            }
        }
    }

    public void mostraTauler(){
        int numfil = this.fil;
        int numCol = this.col;

        // mostrar tablero
                for (int f = 0; f < this.tablero.length; f++) {
                    System.out.print("  ");
                    for (int i = 0; i < numCol; i++) {  //bucle para poner los "--------------------"
                        System.out.printf("---");
                    }
                    System.out.println();
                    System.out.printf("%2d", numfil);  //numeros de las filas

                    for (int c = 0; c < this.tablero[f].length; c++) {
                        System.out.printf("[%s]", this.tablero[f][c]); //celdas
                    }
                    System.out.println();
                    numfil--;
                }
                System.out.print("  ");
                for (int i = 0; i < numCol; i++) {  //bucle para poner los "---------------" al final
                    System.out.print("---");
                }
                System.out.println();
                System.out.print(" ");
                for (int i = 0; i < numCol; i++) {  //numeros de cada columna
                    System.out.printf("  %d", i + 1);
                }
                System.out.println();
    }
}
