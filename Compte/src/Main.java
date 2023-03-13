import bean.Compte;

public class Main {
    public static void main(String[] args) {


        Compte c1 = new Compte ("Marie", 1 );
        Compte c2 = new Compte("Rachida", 2);


        System.out.println(c1);
c1.depot(-5000);
        System.out.println(c1);
   c1.retrait(-2000);
        System.out.println(c1);

c1.virement(c2 ,10000);
        System.out.println(c1);
        System.out.println(c2);

        c2.virement(c1 ,100);
        System.out.println(c1);
        System.out.println(c2);
    }
}
