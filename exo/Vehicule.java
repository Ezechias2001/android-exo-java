
abstract public class Vehicule 
{   

    protected String marque; 
    protected double poids ; 

    abstract public void seDeplacer(String rouler);
   
    public void Arreter ()
    {
        System.out.println("Il s'arrête.");
    }
}
