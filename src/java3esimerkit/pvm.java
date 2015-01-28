package java3esimerkit;


/*
 * Toteuta luokka, jolla kuvataan p‰iv‰m‰‰r‰. 
 * Kirjoita ainakin sopiva muodostaja ja metodi toString, 
 * jolla p‰iv‰m‰‰r‰ saadaan merkkijonoksi. 
 * Testaa luokkaa tavalla tai toisella. 
 * Toimintona riitt‰‰ ett‰ p‰iv‰m‰‰r‰ syntyy ja saadaan tulostettua 
 * (ei tarvita mit‰‰n Lisaa-metodeja).
 */
public class pvm {
    private int paiva, kuukausi, vuosi;
    
    public pvm (int p, int k, int v){
        this.paiva = p;
        this.kuukausi = k;
        this.vuosi = v;
    }
    public String toString(){
       return paiva + " " + kuukausi + " " + vuosi;
    }
    
    
    public static void main(String[] args) {
        pvm date = new pvm(3,4,1955);
        System.out.println(date.toString());
    }
}
