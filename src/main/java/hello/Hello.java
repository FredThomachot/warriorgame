package hello;

import java.util.ArrayList;
import java.util.Scanner;

public class Hello {

    private static ArrayList<Personnages> player = new ArrayList<Personnages>();
    private static Scanner userChoice = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(" \nBienvenue dans le game\n");

        while (true) {

            System.out.println(
                    " \nQue voulez vous faire ?\n1-Creer un personnage\n2-Afficher les personnages\n3-Menu qui sert a rien");
            String menu = userChoice.nextLine();

            if (menu.equals("1")) 
            {

                System.out.println(" \nChoisissez un personnage : \n1-guerrier\n2-magicien");
                String choix = userChoice.nextLine();

                if (choix.equals("1") || choix.equals("guerrier")) {
                    creerGuerrier();

                } else if (choix.equals("2") || choix.equals("magicien")) {
                    creerMagicien(); 
                }   
            } 
            else
            {
                afficherPerso();
            }
        
        }   
    }

    public static void creerGuerrier() {

        System.out.println(" \nVous etes un guerrier ! \nChoisissez un nom ! ");
        String nomGuerrier = userChoice.nextLine();
        Personnages guerrierTest = new Guerrier();
        guerrierTest.setName(nomGuerrier);

        System.out.print(" \nNiveau de vie : ");
        Integer number = userChoice.nextInt();
        guerrierTest.setLife(number);

        System.out.print("Niveau de force : ");
        Integer numberForce = userChoice.nextInt();
        guerrierTest.setForce(numberForce);

        player.add(guerrierTest);
    }

    public static void creerMagicien() {
        System.out.println(" \nVous etes un magicien ! \nChoisissez un nom !");
        String nomMagicien = userChoice.nextLine();
        Personnages magicienTest = new Magicien();
        magicienTest.setName(nomMagicien);

        System.out.print(" \nNiveau de vie : ");
        Integer number = userChoice.nextInt();
        magicienTest.setLife(number);

        System.out.print("Niveau de force : ");
        Integer numberForce = userChoice.nextInt();
        magicienTest.setForce(numberForce);

        player.add(magicienTest);
    }

    public static void afficherPerso() {
        for (int i = 0; i < player.size(); i++) {
            System.out.println(" \n*************************************************");
            System.out.println((player.get(i)).toString());
            System.out.println("*************************************************");
        }
    }
}
