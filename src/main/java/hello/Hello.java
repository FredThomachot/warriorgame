package hello;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        Personnages personnagesTab[] = new Personnages[10];
       

        for (int i=0; i<personnagesTab.length; i++) {
       
        Scanner userChoice = new Scanner(System.in);

        System.out.println(" \nBienvenue dans le game, que voulez vous faire ?\n1-Creer un personnage\n2-Modifier un personnage\n3-Fight like a brave !");
        String menu = userChoice.nextLine();

        if (menu.equals("1")){ 

            System.out.println(" \nChoisissez un personnage : \n1-guerrier\n2-magicien");
            String choix = userChoice.nextLine();

            if (choix.equals("1")||choix.equals("guerrier")){

                System.out.println(" \nVous etes un guerrier ! \nChoisissez un nom ! ");
                String nomGuerrier = userChoice.nextLine();
                Personnages guerrierTest = new Guerrier();
                guerrierTest.setName(nomGuerrier);

                System.out.println(" \nChoisissez votre arme :");
                String nomArme = userChoice.nextLine();
                           
                System.out.print(" \nNiveau de vie : ");
                Integer number = userChoice.nextInt();
                guerrierTest.setLife(number);
                        
                System.out.print("Niveau de force : ");
                Integer numberForce = userChoice.nextInt();
                guerrierTest.setForce(numberForce);

                System.out.println(" \n*************************************************\n ");
                System.out.println(guerrierTest.toString()+"\nArme : "+nomArme);
                System.out.println(" \n*************************************************");
               
            }
            else if(choix.equals("2")||choix.equals("magicien")) {
                       
                System.out.println(" \nVous etes un magicien ! \nChoisissez un nom !");
                String nomMagicien = userChoice.nextLine();
                Personnages magicienTest = new Magicien();
                magicienTest.setName(nomMagicien);

                System.out.println(" \nChoisissez votre philtre :");
                String nomPhiltre = userChoice.nextLine();

                System.out.print(" \nNiveau de vie : ");
                Integer number = userChoice.nextInt();
                magicienTest.setLife(number);

                System.out.print("Niveau de force : ");
                Integer numberForce = userChoice.nextInt();
                magicienTest.setForce(numberForce);

                System.out.println(" \n*************************************************\n ");
                System.out.println(magicienTest.toString()+"\naPhiltre : "+nomPhiltre);
                System.out.println(" \n*************************************************");  
               
            }
            }
                
        else if (menu.equals("2")) {   
            System.out.println(" \n YOU CAN NOT DO THIS (YET)\n ");
            } 
        else {
            System.out.println(" \nµµµµµµµµ%%%%%%%%%%%FFFFFIIIIIIIIIGGGGGGGHHHHHHHHHHTTTTTTTTTTTTTT%%%%%%%%%%%µµµµµµµµ\n ");
            }
        }
    } 
} 

    

        
