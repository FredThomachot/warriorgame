package hello;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        Personnages personnages[] = new Personnages[10];
        Scanner userChoice = new Scanner(System.in);

        System.out.println("*************************************************");
        System.out.println("Welcome to Warriorz, the JAVA game");
        System.out.println("*************************************************");

        System.out.println("Choisissez un personnage : guerrier - magicien ");

                String choix = userChoice.nextLine();

                if (choix.equals ("guerrier")){
                    System.out.println("Vous etes un guerrier !");
                    System.out.println("Choisissez un nom :");
                
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
                    System.out.println("Caracteristiques du guerrier => ");
                    System.out.println("Nom : " +nomGuerrier); 
                    System.out.println("Arme : "+nomArme);
                    System.out.println("Niveau de vie : "+number);
                    System.out.println("Niveau de force : "+numberForce);
                    System.out.println("*************************************************");
                  


                } else {
                    System.out.println("Vous etes un magicien !");
                    System.out.println("Choisissez un nom :");
            
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
                    System.out.println("Caracteristiques du magicien => ");
                    System.out.println("Nom : " +nomMagicien); 
                    System.out.println("Philtre : "+nomPhiltre);
                    System.out.println("Niveau de vie : "+number);
                    System.out.println("Niveau de force : "+numberForce);
                    System.out.println("*************************************************");
                }

       
          

    }
}
    

        
