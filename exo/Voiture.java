
public class Voiture extends Vehicule
{
    public Voiture (String marque, double poids )
    {
        this.marque = marque; 
        this.poids = poids; 

        System.out.println(this.marque + "  -  "+ this.poids);
    }

    public void seDeplacer(String rouler)
    {
        System.out.println(rouler);
    }

}
