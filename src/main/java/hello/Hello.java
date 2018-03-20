package hello;

import java.util.ArrayList;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        ArrayList<Personnages> player = new ArrayList<Personnages>();

        Scanner userChoice = new Scanner(System.in);

        while (true) {
            System.out.println(
                    " \nBienvenue dans le game, que voulez vous faire ?\n1-Creer un personnage\n2-Afficher les personnages");
            String menu = userChoice.nextLine();

            if (menu.equals("1")) {

                System.out.println(" \nChoisissez un personnage : \n1-guerrier\n2-magicien");
                String choix = userChoice.nextLine();

                if (choix.equals("1") || choix.equals("guerrier")) {

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

                } else if (choix.equals("2") || choix.equals("magicien")) {

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
            }

            else  {
                for (int i = 0; i < player.size(); i++) {
                    System.out.println(" \n*************************************************");
                    System.out.println((player.get(i)).getClass().getName());
                    System.out.println((player.get(i)).toString());
                    System.out.println("*************************************************");
                }

            } 
           
        }
    }
}
