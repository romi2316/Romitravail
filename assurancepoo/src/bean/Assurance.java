package bean;

public class Assurance {

    private int age;
    private int permis;
    private int accident;
    private int fidelite;
    private int cptPointMalus;


    public Assurance(int age, int permis, int accident, int fidelite) {
        this.age = age;
        this.permis = permis;
        this.accident = accident;
        this.fidelite = fidelite;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPermis() {
        return permis;
    }

    public void setPermis(int permis) {
        this.permis = permis;
    }

    public int getAccident() {
        return accident;
    }

    public void setAccident(int accident) {
        this.accident = accident;
    }

    public int getFidelite() {
        return fidelite;
    }

    public void setFidelite(int fidelite) {
        this.fidelite = fidelite;
    }

    public void Calcul() {
        cptPointMalus = accident;
        String message = "";

        if (age < 25) {
            cptPointMalus++;
        }

        if (permis < 2) {
            cptPointMalus++;
        }

        if (fidelite>1) {
            cptPointMalus-= 1;

        }

        switch (cptPointMalus) {
            case -1:
                message = "Bleu";
                break;
            case 0:
                message = "Vert";
                break;
            case 1:
                message = "Orange";
                break;
            case 2:
                message = "Rouge";
                break;
            default:
                message = "Refus";
        }


        System.out.println("Le tarif est " + message);

    }
    }
