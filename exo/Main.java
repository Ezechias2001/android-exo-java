public class Main 
{
    
    public static void main (String []args)
    {
        Voiture v1 = new Voiture ("Toyota", 400); 
        Voiture v2 = new Voiture ("Corolla", 800);

        Avion a1 = new Avion (34,"Air-DES", 1234);

        v1.seDeplacer("Vas-y!");
        v2.seDeplacer("rouler");

        a1.seDeplacer("top");
        a1.decoler();
        a1.atterrir();
    }
}


