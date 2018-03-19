package hello;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        Personnages personnages[] = new Personnages[8];

        for (int i=0; i<personnages.length; i++)
        {

        Scanner userChoice = new Scanner(System.in);
    
       

        System.out.println("Choisissez un personnage : guerrier - magicien ");

                String choix = userChoice.nextLine();

                if (choix.equals ("guerrier")){
                    System.out.println("Vous etes un guerrier ! \nChoisissez un nom !");
                
                    String nomGuerrier = userChoice.nextLine();
                    Personnages guerrierTest = new Guerrier();
                    guerrierTest.setName(nomGuerrier);

                    System.out.println("Choisissez votre arme :");
                    String nomArme = userChoice.nextLine();
                    
                    System.out.print("Niveau de vie : ");
                    Integer number = userChoice.nextInt();
                    
                    
                    System.out.print("Niveau de force : ");
                    Integer numberForce = userChoice.nextInt();

                    System.out.println("*************************************************");
                    System.out.println("Caracteristiques du guerrier\nNom : " +nomGuerrier+"\nArme : "+nomArme+"\nNiveau de vie : "+number+ "\nNiveau de force : "+numberForce+ "\n*************************************************");
                  


                } else {
                    System.out.println("Vous etes un magicien ! \nChoisissez un nom !");
            
                    String nomMagicien = userChoice.nextLine();
                    Personnages magicienTest = new Magicien();
                    magicienTest.setName(nomMagicien);

                    System.out.println("Choisissez votre philtre :");
                    String nomPhiltre = userChoice.nextLine();

                    System.out.print("Niveau de vie : ");
                    Integer number = userChoice.nextInt();

                    System.out.print("Niveau de force : ");
                    Integer numberForce = userChoice.nextInt();

                    System.out.println("*************************************************");
                    System.out.println("Caracteristiques du magicien\nNom : " +nomMagicien+"\nPhiltre : "+nomPhiltre+"\nNiveau de vie : "+number+ "\nNiveau de force : "+numberForce+ "\n*************************************************");
                }

       
            } 

    }
}
    

        
