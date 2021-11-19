public class Avion extends Vehicule implements Volable {

    private int nbreDePlace; 
    
    public Avion(int nbr, String marque, double poids){
        this.nbreDePlace=nbr;
        this.marque = marque; 
        this.poids = poids; 

    }

    public void seDeplacer(String rouler){
        System.out.println(rouler);
    }
    public void decoler() {
        System.out.println("Je décolle"); 
    }
    public void atterrir() {
        System.out.println("J'atteris!"); 
    }
}
