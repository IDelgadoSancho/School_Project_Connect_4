package conecta4;
import java.util.Scanner;

public class Partida {
    boolean taulerLleno;
    boolean colLlena;
    boolean filLlena;
    boolean turno;
    char fichaX = 'x';
    char fichaO = 'o';
    int contX;
    int contO;

    public Partida() {
    }

    public boolean isTaulerLleno() {
        return taulerLleno;
    }

    public void setTaulerLleno(boolean taulerLleno) {
        this.taulerLleno = taulerLleno;
    }

    public boolean isColLlena() {
        return colLlena;
    }

    public void setColLlena(boolean colLlena) {
        this.colLlena = colLlena;
    }

    public boolean isFilLlena() {
        return filLlena;
    }

    public void setFilLlena(boolean filLlena) {
        this.filLlena = filLlena;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public char getFichaX() {
        return fichaX;
    }

    public void setFichaX(char fichaX) {
        this.fichaX = fichaX;
    }

    public char getFichaO() {
        return fichaO;
    }

    public void setFichaO(char fichaO) {
        this.fichaO = fichaO;
    }

    public int getContX() {
        return contX;
    }

    public void setContX(int contX) {
        this.contX = contX;
    }

    public int getContO() {
        return contO;
    }

    public void setContO(int contO) {
        this.contO = contO;
    }

    public void creacioTauler(int numFil, int numCol){
        Scanner teclat = new Scanner(System.in);
        System.out.print("Cuantas filas quieres? (min 4) --> ");
        numFil = teclat.nextInt();
        System.out.print("Cuantas columnas quieres? (min 4) --> ");
        numCol = teclat.nextInt();
        Tauler tablero1 = new Tauler(numFil, numCol);

        //condicion para tablero mayor que 4x4
        while (numFil < 4 || numCol < 4) {
            System.err.println("\nError, el tablero ha de ser como minimo de 4 x 4!");
            System.out.print("Cuantas filas quieres? (min 4) --> ");
            numFil = teclat.nextInt();
            System.out.print("Cuantas columnas quieres? (min 4) --> ");
            numCol = teclat.nextInt();
            teclat.nextLine();
            celdas = new char[numFil][numCol];
        }
        }

    }

