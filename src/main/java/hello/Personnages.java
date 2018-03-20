package hello ;

public abstract class Personnages {

        protected String nom = "";
        protected String img = "not done yet";
        protected int life = 100;
        protected int force = 50;

        public void setName(String nom) {
            this.nom = nom;
        }

        public String getName(){
            return this.nom;
        }

        public void setLife(int life) {
            this.life = life;
        }

        public int getLife() {
            return this.life;
        }

        public void setForce(int force) {
            this.force = force;
        }

        public int getForce() {
            return this.force;
        }
      
        public String toString(){
            return
                "Nom: "+this.nom+
                " \nNiveau de vie: "+this.life+
                " \nNiveau de force: "+this.force;
        }

}

