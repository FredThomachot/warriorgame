package hello;

public class Magicien extends Personnages {
    
    protected String sort = "";
    protected Boolean philtre = true;

    public void setSort(String sort) {
        this.sort = sort ;
    }
    
    public String getSort(){
        return this.sort ;
    }

}
