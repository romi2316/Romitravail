package bean;

public class Monnais {


    private int cptBillet10;
    private int cptBillet5;
    private int cptPiece1;




    public Monnais(int cptBillet5,int cptBillet10, int cptPiece1){
        this.cptBillet5=cptBillet5;
        this.cptBillet10=cptBillet10;
        this.cptPiece1=cptPiece1;
    }

    public int getCptBillet10() {
        return cptBillet10;
    }

    public void setCptBillet10(int cptBillet10) {
        this.cptBillet10 = cptBillet10;
    }

    public int getCptBillet5() {
        return cptBillet5;
    }

    public void setCptBillet5(int cptBillet5) {
        this.cptBillet5 = cptBillet5;
    }

    public int getCptPiece1() {
        return cptPiece1;
    }

    public void setCptPiece1(int cptPiece1) {
        this.cptPiece1 = cptPiece1;
    }
}
