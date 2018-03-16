package hello ;

public abstract class Personnages {

        protected String nom = "";
        protected int niveaudevie = 100;
        protected int force = 50;

        public void setName(String nom) {
            this.nom = nom ;
        }

        public String getName(){
            return this.nom ;
        }
}

