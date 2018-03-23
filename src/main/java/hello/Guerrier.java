package hello;
import java.util.Random;

public class Guerrier extends Personnages {
    
    
    //protected Boolean bouclier = true;

    private Weapon monArme = new Weapon();


    public Guerrier (String nom, int life, int force, Weapon arme){
        this.setName(nom);
        this.setLife(life);
        this.setForce(force);
        this.setMonArme(arme);
    }

    public Guerrier (){}

    public void setMonArme(Weapon arme) 
    {
        this.monArme= arme;
    }

    public String toString(){
        return super.toString()+" \n" +monArme;
    }


}
    

    

    
    
 