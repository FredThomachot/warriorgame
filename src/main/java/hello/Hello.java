package hello;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Warriorz game");
        System.out.println("Selectionnez un personnage : ");

        System.out.println("*************************************************");

        System.out.println("Veuillez saisir un nom de guerrier :");
        String nomGuerrier = sc.nextLine();
        System.out.println("Choisissez votre arme :");
        String nomArme = sc.nextLine();
        System.out.println("Le nom de votre guerrier est : " +nomGuerrier+ " et votre arme est : " +nomArme);

        System.out.println("*************************************************");

        System.out.println("Veuillez saisir un nom de magicien :");
        String nomMagicien = sc.nextLine();
        System.out.println("Choisissez votre philtre :");
        String nomPhiltre = sc.nextLine();
        System.out.println("Le nom de votre magicien est : " +nomMagicien+ " et votre philtre est : " +nomPhiltre);

        System.out.println("*************************************************");

        Personnages guerrierTest = new Guerrier();
        Personnages magicienTest = new Magicien();

        guerrierTest.setName(nomGuerrier);
        magicienTest.setName(nomMagicien);

        System.out.println(guerrierTest.getName()+" vs "+magicienTest.getName());
   
    }
}