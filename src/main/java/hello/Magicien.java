package hello;
import java.util.Random;

public class Magicien extends Personnages {
    
   
   // protected Boolean philtre = true;

    Sortilege monSort = new Sortilege();

    public Magicien (String nom, int life, int force, Sortilege sort){
        this.setName(nom);
        this.setLife(life);
        this.setForce(force);
        this.setMonSort(sort);
    }

    public Magicien (){}

    public void setMonSort(Sortilege sort) 
    {
        this.monSort= sort;
    }

    public String toString(){
        return super.toString()+" \n" ;
    }


}