package hello;
import java.util.Random;

public class Guerrier extends Personnages {
    
    protected String arme[]  = {"Hachette","Ferraille", "Sabre", "Arbalette","Toupie infernale"};
    protected Boolean bouclier = true;

    Random rnd = new Random();

    public String toString() {
        return "Personnage : Guerrier \nArme : "+arme[rnd.nextInt(5)]+ "\n" +super.toString();
    }
 }

    
    
    /*public void setWeapon(String arme) {
        this.arme = arme ;
    }
    
    public String getWeapon(){
        return this.arme ;
    }*/

    