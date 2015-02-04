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
    private int compareTo( pvm pv2){
    	if (this.vuosi < pv2.vuosi)
    		return -1;
    	else if (this.vuosi > pv2.vuosi)
    		return 1;
    	else if (this.kuukausi < pv2.kuukausi)
    		return -1;
    	else if (this.kuukausi > pv2.kuukausi)
    		return 1;
    	else if (this.paiva < pv2.paiva)
    		return -1;
    	else if (this.paiva > pv2.paiva)
    		return 1;
    	else
    		return 0;
    }
    
    private boolean equals( pvm pv2){
    	if (this.compareTo(pv2) ==0)
    		return true;
    	return false;
    }
    
    public static void main(String[] args) {
        pvm date = new pvm(3,4,1955);
        System.out.println(date.toString());
        pvm date2 = new pvm(30,11,1939);
        System.out.println(date2.toString());
        System.out.println("Compare date (date2) "+ date.compareTo(date2));
        System.out.println("Compare date2 (date) "+ date2.compareTo(date));
        System.out.println("Compare date (date) "+ date.compareTo(date));
        System.out.println("Compare date2 (date2) "+ date2.compareTo(date2));
        date.equals(date2);
        System.out.println(date.equals(date2));
        if ( date.equals(date2) != true ) 
        	System.out.println(date + " != " + date2);
        else 
        	System.out.println(date + " = " + date2);
        
    }
}
