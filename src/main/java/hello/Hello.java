package hello;

import java.util.ArrayList;
import java.util.Scanner;

public class Hello {

    private static ArrayList<Personnages> player = new ArrayList<Personnages>();
    private static ArrayList<Weapon> weaponList = new ArrayList<Weapon>();
    private static ArrayList<Sortilege> sortList = new ArrayList<Sortilege>();

    private static Scanner userChoice = new Scanner(System.in);
    private static Boolean playgame = true;

    public static void main(String[] args) {

        System.out.println(" \nBienvenue dans le game\nWWWWWWAAAAAAARRRRRRIIIIIIIIOOOOOOORRRRRRRSSSSSSSS");

        //////////////////////////////////////////////////////////////////// CREATION DE 2 PERSONNAGES PAR DEFAULT 
        /*Weapon arme = new Weapon("Arbagun", 10);
        player.add(new Guerrier("Froud", 123, 456, arme));

        Sortilege sort = new Sortilege("Molassonne", 20);
        player.add(new Magicien("Azer", 456, 789, sort));*/
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
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
                afficherArme();
                afficherSort();
            }
            else if (menu.equals("3"))
            {
                modifierPerso();
            }
            else if (menu.equals("4"))
            {
                quitGame();
                
            }
        }   
    }

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// FONCTIONS
   
    public static void creerGuerrier() { ///////////////////////////////////////////////////////////  CREER UN NOUVEAU GUERRIER

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
        userChoice.nextLine();

        System.out.print(" \nChoisissez une arme : ");
        String nomArme = userChoice.nextLine();
        System.out.print("Puissance de l'arme : ");
        Integer armePower = userChoice.nextInt();

        Weapon armePouvoir = new Weapon(nomArme, armePower) ;
        weaponList.add(armePouvoir);

        System.out.print(" \nFelicitations, vous venez de creer un guerrier !\n");

        player.add(guerrierTest);
        userChoice.nextLine();
    }

    public static void creerMagicien() { /////////////////////////////////////////////////////////// CREER UN NOUVEAU MAGICIEN
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
        userChoice.nextLine();

        System.out.print(" \nChoisissez un sort : ");
        String nomSort = userChoice.nextLine();
        System.out.print("Puissance du sort : ");
        Integer sortPower = userChoice.nextInt();

        Sortilege sortPouvoir = new Sortilege(nomSort, sortPower) ;
        sortList.add(sortPouvoir);

        System.out.print(" \nFelicitations, vous venez de creer un magicien !\n");

        player.add(magicienTest);
        userChoice.nextLine();
    }

    
    public static void afficherPerso() { /////////////////////////////////////////////////////////// AFFICHER LES PERSONNAGES CREES
        for (int i = 0; i < player.size(); i++) {
            System.out.println(" \n*************************************************");
            System.out.println((player.get(i)).toString());
        }
    }

    public static void afficherArme() { /////////////////////////////////////////////////////////// AFFICHER LES ARMES CREES
        for (int i = 0; i < weaponList.size(); i++) {
            System.out.println(" \n*************************************************"); 
            System.out.println((weaponList.get(i)).toString());
             
        }   
    }
    
    public static void afficherSort() { /////////////////////////////////////////////////////////// AFFICHER LES ARMES CREES
        for (int i = 0; i < sortList.size(); i++) {
            System.out.println(" \n*************************************************"); 
            System.out.println((sortList.get(i)).toString());
             
             
        }
    }

    public static void modifierPerso() { /////////////////////////////////////////////////////////// MODIFIER LE NOM D'UN PERSONNAGE EXISTANT
            System.out.println("Quel personnage voulez vous modifier ?");
                int id = userChoice.nextInt();
                userChoice.nextLine();
                System.out.println("Entrez le nouveau nom : ");
                String nom =userChoice.nextLine();
        
                player.get(id).setName(nom);
    }
    public static void quitGame() { /////////////////////////////////////////////////////////// ARRETER LE JEU
        System.out.println(" \nyou just quit the game you pathetic loser ! ");
                playgame = false ;
    }
}
