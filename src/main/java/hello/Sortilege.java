package hello ;

    public class Sortilege  {

        private String nom = "";
        private int power = 0 ;


    public Sortilege(){}

    public Sortilege(String nom, int power) {
        this.nom = nom;
        this.power = power;
    }

    public void setName(String nom) {
        this.nom = nom;
    }

    public String getName(){
        return this.nom;
    }

    public void setPower(int power){
        this.power = power;
    }

    public int getPower(){
        return this.power;
    } 

    public String toString(){
        return
            "Sort: "+this.nom+" \nForce du sort: "+this.power;
    }
}