package hello;

import java.util.ArrayList;
import java.util.Scanner;

public class Hello {

    private static ArrayList<Personnages> player = new ArrayList<Personnages>();
    private static Scanner userChoice = new Scanner(System.in);
    private static Boolean playgame = true;

    public static void main(String[] args) {

        System.out.println(" \nBienvenue dans le game\nWWWWWWWAAAAAAAAAARRRRRRRRIIIIIIIIIIIIOOOOOOOOOOOOORRRRRRRRRRRRRRSSSSSSSSSSSSSSS");

        while (playgame) {

            System.out.println("\nQue voulez vous faire ?\n1-Creer un personnage\n2-Afficher les personnages\n3-Modifier un personnage\n4-Quitter le jeu ");
            String menu = userChoice.nextLine();

            if (menu.equals("1")) 
                    {
                        System.out.println(" \nChoisissez un personnage : \n1-guerrier\n2-magicien");
                        String choix = userChoice.nextLine();

                        if (choix.equals("1") || choix.equals("guerrier")) 
                        {
                            creerGuerrier();
                        } 
                        else if (choix.equals("2") || choix.equals("magicien")) 
                        {
                            creerMagicien(); 
                        } 
                    }
            else if (menu.equals("2"))
            {
                afficherPerso();
            }
            else if (menu.equals("3"))
            {
                System.out.println("Quel personnage voulez vous modifier ? \n");
                int id = userChoice.nextInt();
                userChoice.nextLine();
                System.out.println("Entrez le nouveau nom : \n");
                String nom =userChoice.nextLine();
               
                modifierPerso(id, nom);
            }
            else if (menu.equals("4"))
            {
                System.out.println(" \nyou just quit the game you pathetic loser ! ");
                playgame = false ;
            }
        }   
    }

    public static void creerGuerrier() {

        System.out.println(" \nVous etes un guerrier ! \nChoisissez un nom de guerrier !\n ");
        String nomGuerrier = userChoice.nextLine();
        Personnages guerrierTest = new Guerrier();
        guerrierTest.setName(nomGuerrier);

        System.out.print(" \nNiveau de vie : ");
        Integer number = userChoice.nextInt();
        guerrierTest.setLife(number);

        System.out.print("Niveau de force : ");
        Integer numberForce = userChoice.nextInt();
        guerrierTest.setForce(numberForce);
        System.out.print(" \nFelicitations, vous venez de creer un guerrier !\n");

        player.add(guerrierTest);
        userChoice.nextLine();
    }

    public static void creerMagicien() {
        System.out.println(" \nVous etes un magicien ! \nChoisissez un nom de magicien !\n ");
        String nomMagicien = userChoice.nextLine();
        Personnages magicienTest = new Magicien();
        magicienTest.setName(nomMagicien);

        System.out.print(" \nNiveau de vie : ");
        Integer number = userChoice.nextInt();
        magicienTest.setLife(number);

        System.out.print("Niveau de force : ");
        Integer numberForce = userChoice.nextInt();
        magicienTest.setForce(numberForce);
        System.out.print(" \nFelicitations, vous venez de creer un magicien !\n");

        player.add(magicienTest);
        userChoice.nextLine();
    }

    public static void afficherPerso() {
        for (int i = 0; i < player.size(); i++) {
            System.out.println(" \n*************************************************");
            System.out.println((player.get(i)).toString());
            System.out.println("*************************************************");
        }
    }
    public static void modifierPerso(int indexPerso, String nom) {
        player.get(indexPerso).setName(nom);
   
    }
}
