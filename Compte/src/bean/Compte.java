package bean;

public class Compte {


   private String nom;

 private int id;

  private double solde;

public void printMsg(String message){
    System.out.println("____>>>> Alerte : " + message + " <<<<____");
}
    public Compte(String nom, int id) {
        this.nom = nom;
        this.id = id;
        this.solde = 0.0;
    }

    @Override
    public String toString() {
        return "Compte {" +
                "nom =" + nom + '\'' +
                ", id =" + id +
                ", solde =" + solde +
                '}';
    }

    public void depot(double montant) {
        if (montant >= 0) {
            this.solde += montant;
        }else{
this.printMsg("Le montant de depôt doit être positif !!");
        }

    }

    public void retrait(double montant) {
        if (montant >= 0 && (this.solde - montant) > 0) {
            this.solde -= montant;
        }else {
           this.printMsg(" Le montant de retrait doit être positif et inferieur au solde!!");
        }
    }



    public void virement (Compte c, double montant) {
        if (montant > 0 && (this.solde - montant) > 0) {
            this.retrait(montant);
            c.depot(montant);
        }else {
            this.printMsg("Virement impossible : Montant négatif ou solde insuffisant !!");
        }
    }
    }

