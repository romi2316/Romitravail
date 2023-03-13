public class Main {
    public static void main(String[] args) {

    }
}



    public String nextTime(){

        String str = "";

        this.setSec(++this.sec);
        if(this.sec>59){
            this.setMin(++this.min);
            this.setSec(0);
            if(this.min>59){
                this.setHeur(++this.heur);
                this.setMin(0);
                if(this.heur>23){
                    this.setHeur(0);
                }
            }
        }
        str = this.heur + " h " + this.min + " min " + this.sec + " sec";

        return str;
    }