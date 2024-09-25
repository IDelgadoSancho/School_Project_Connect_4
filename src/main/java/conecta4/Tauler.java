package conecta4;

public class Tauler {
    int numCol;
    int numFil;
    char celdas[][];

    public Tauler(int numCol, int numFil) {
        this.numCol = numCol;
        this.numFil = numFil;
    }

    public int getNumCol() {
        return numCol;
    }

    public void setNumCol(int numCol) {
        this.numCol = numCol;
    }

    public int getNumFil() {
        return numFil;
    }

    public void setNumFil(int numFil) {
        this.numFil = numFil;
    }

    public char[][] getCeldas() {
        return celdas;
    }

    public void creaTauler(int numFil, int numCol) {
        char espacio = ' ';
        char celdas[][] = new char[numFil][numCol];
        for (int f = 0; f < celdas.length; f++) {
            for (int c = 0; c < celdas[f].length; c++) {
                celdas[f][c] = espacio;
            }
        }
    }

    public void mostraTauler(int numfil, int numcol) {
        numfil = celdas.length;
        for (int f = 0; f < celdas.length; f++) {
            System.out.print("  ");
            for (int i = 0; i < numCol; i++) { // bucle para poner los "--------------------"
                System.out.printf("---");
            }
            System.out.println();
            System.out.printf("%2d", numfil); // numeros de las filas

            for (int c = 0; c < celdas[f].length; c++) {
                System.out.printf("[%s]", celdas[f][c]); // celdas
            }
            System.out.println();
            numfil--;
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
}
