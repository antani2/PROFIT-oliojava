package java4;

public class Koulu {
    private Oppilas viimeinen;
    private Oppilas ensimmainen;

    public Koulu() {
        viimeinen = null;
        ensimmainen = null;
    }
    
    public void lisaaOppilas(String nimi){
        Oppilas oppilas = new Oppilas(nimi,viimeinen);
        viimeinen = oppilas;
        if (ensimmainen == null)
            ensimmainen = oppilas;
    }
    
    public void tulosta(){
        //
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Koulu koulu = new Koulu();
        koulu.lisaaOppilas("Kalle);
        
    }

}
