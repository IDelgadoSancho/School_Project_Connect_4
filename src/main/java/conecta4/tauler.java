package conecta4;

public class tauler {
    int numCol;
    int numFil;
    int tauler[][];

    public tauler(int numCol, int numFil) {
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
}
