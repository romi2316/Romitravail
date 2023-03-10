package com.impression.www;

import bean.Impression;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre de photocopies");

        Impression im = new Impression(sc.nextInt());

        if(im.getNbrPhotocopies()<=10){
            System.out.println(im.getNbrPhotocopies()*0.1f + "€");
        } else if (im.getNbrPhotocopies()<=30) {
            System.out.println((im.getNbrPhotocopies()-10)*0.09 + 1+ "€");
        } else {
            System.out.println((im.getNbrPhotocopies()-30)*0.08 + 2.8+ "€");
        }
    }


    }

