package conecta4;

public class partida {
    boolean taulerLleno;
    boolean colLlena;
    boolean filLlena;
    boolean turno;
    char fichaX = 'x';
    char fichaO = 'o';
    int contX;
    int contO;

    public partida() {
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

    public void crearTauler(int filas, int columnas) {

    }

}
