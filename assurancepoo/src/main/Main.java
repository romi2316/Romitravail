package main;

import bean.Assurance;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){
       int age;
       int permis;
       int accident;
       int fidelite;


        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez l'age");
        age = sc.nextInt();
        System.out.println("Permis");
        permis = sc.nextInt();
        System.out.println("accident");
        accident = sc.nextInt();
        System.out.println("fidelite");
        fidelite = sc.nextInt();

        Assurance assu =new Assurance(age,permis,accident,fidelite);
        assu.Calcul();
    }

}