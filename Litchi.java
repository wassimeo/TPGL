public class Litchi {
    private double prix;
    private String origine;
	
    public Litchi() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Litchi(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Litchi de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 litchis sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Litchi or = (Litchi) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une litchi a des pepins
        return true;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
        Litchi o = new Litchi(80,"Suisse");
        Litchi o2 = new Litchi(80, "Suisse");
        System.out.println(o.toString());
        System.out.println(o.equals(o2));
	System.out.println("ca marche");
   }
}
