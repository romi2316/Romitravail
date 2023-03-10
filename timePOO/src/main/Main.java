package main;

import bean.Time;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

int hr=0;
int min = 0;
int sec = 0 ;

        Scanner sc =new Scanner(System.in);
        System.out.println("Entrez l'heure");

        hr=sc.nextInt();

        System.out.println("Entrez les minutes");

        min=sc.nextInt();

        System.out.println("Entrez les secondes");

        sec=sc.nextInt();

Time t = new Time (hr,min,sec);

t.nextTime();

    }

}
