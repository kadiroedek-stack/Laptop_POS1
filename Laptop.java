public class Laptop
{
    private String hersteller;
    private int kosten;
    private boolean neu;
    
    public Laptop(String neuHersteller, int neuKosten, boolean neuNeu)
    {
        setHersteller(neuHersteller);
        setKosten(neuKosten);
        setNeu(neuNeu);
    }
    
    public Laptop(String neuHersteller, boolean neuNeu)
    {
        setHersteller(neuHersteller);
        setKosten(1000);
        setNeu(neuNeu);
    }
    
    public Laptop()
    {
        setHersteller("Lenovo");
        setKosten(1000);
        setNeu(true);
    }
   
    
    

    
    
    
    
    
    
    
    
}

