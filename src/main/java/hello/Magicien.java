package hello;
import java.util.Random;

public class Magicien extends Personnages {
    
    protected String sort[]  = {"Mort instantanee","Paralysie", "Glacage extreme", "Fondue vivante","Tourniboulie"};
    protected Boolean philtre = true;

    Random rnd = new Random();

    public String toString() {
        return "Personnage : Magicien \nSort : "+sort[rnd.nextInt(5)]+"\n" +super.toString();
    }

}

    /*public void setSort(String sort) {
        this.sort = sort ;
    }
    
    public String getSort(){
        return this.sort ;
    }*/

    
