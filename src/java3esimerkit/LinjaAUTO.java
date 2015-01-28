package java3esimerkit;
/**
 * @author profit-guest01
 * Toteuta luokka LinjaAuto, jossa on ominaisuudet paikkojen lukum��r� 
 * ja vapaiden paikkojen lukum��r�. Tee metodit tulosta (vrt. Henkilo-teht�v�)
 *  sek� lisaa ja vahenna muuttamaan matkustajien lukum��r��. Kirjoita testip��ohjelma.
 *
 */
public class LinjaAUTO {
    
    private int paikkoja;
    private int vapaita;
    
    public LinjaAUTO(int paikkoja){
        this.paikkoja = paikkoja;
        this.vapaita = paikkoja;
    }
    public void tulosta(){
        System.out.println("Paikkoja "+ paikkoja + ", vapaana " + vapaita);
        return;
    }
    
    public void lisaa(){
        if (vapaita>0)
            vapaita--;
    }
    
    public void vahenna(){
        if (vapaita<paikkoja)
            vapaita++;
    }
    

    public static void main(String[] args) {
        LinjaAUTO bussi1 = new LinjaAUTO(45);
        bussi1.tulosta();
        bussi1.lisaa();
        bussi1.lisaa();
        bussi1.lisaa();
        bussi1.tulosta();
        bussi1.vahenna();
        bussi1.vahenna();
        bussi1.vahenna();
        bussi1.tulosta();
    }

}
