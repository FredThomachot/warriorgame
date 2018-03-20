package hello;

public class Guerrier extends Personnages {
    
    protected String arme = "";
    protected Boolean bouclier = true;

    
    public void setWeapon(String arme) {
        this.arme = arme ;
    }
    
    public String getWeapon(){
        return this.arme ;
    }
    
 }
