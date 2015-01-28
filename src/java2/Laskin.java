package java2;


/**
 * Perusharjoituksia laskimen avulla
 * @author Ari Tuhkala
 *
 */
public class Laskin {

	/**
	 * Summaa kolme lukua
	 * @param a ensimm�inen luku
	 * @param b toinen luku
	 * @param c kolmas luku
	 * @return lukujen summa
	 */
	public int summaa (int a, int b, int c){
		return a + b + c;
	}	
	/**
	 * Summaa kaksi lukua
	 * @param a ensimm�inen luku
	 * @param b toinen luku
	 * @return lukujen summa
	 */
	public int summaa (int a, int b){
		return summaa (a,b,0);
	}
	
	/**
	 * Nollaa taulukon alkiot
	 * 
	 * Indeksi: 0 1 2
	 * Taulu:   4 6 8
	 * 
	 * Nollauksen j�lkeen
	 * Indeksi: 0 1 2
	 * Taulu:   0 0 0
	 * @param taulu taulukko, jonka alkiot nollataan
	 */
	public void nollaaTaulu (int [] taulu) {
	    for (int i=0; i<taulu.length;++i)
	        taulu[i]=0;
	}
	
	/**
	 * Etsi taulukon pienin alkio
	 *  
	 * @param taulu
	 * @return pienin 
	 * 
	 */
	public int palautaPienin (int [] taulu) {
		int pienin = taulu[0];
	    for (int i=1; i<taulu.length;++i)
	    	if (taulu[i]<pienin)
	    		pienin = taulu[i];
	    return pienin;
	}
	
/**
 * P��ohjelma
 * @param args
 */
	public static void main(String[] args) {
		Laskin laskin = new Laskin();
		
		//summaa metodi
		int summa = laskin.summaa(4,6);
		System.out.println(summa);
		
		//Tyhj� taulu, jossa on 5 indeksi�	
		int [] tyhjaTaulu = new int [5];
		System.out.println("Indeksiss� 0: " + tyhjaTaulu[0] + "\nIndeksiss� 1: " + tyhjaTaulu[1]);
		
		//T�ytet��n taulun pari ekaa alkiota
		tyhjaTaulu[0] = 100;
		tyhjaTaulu[1] = 1000;
		tyhjaTaulu[2] = 2;
		tyhjaTaulu[3] = 20;
		tyhjaTaulu[4] = 1234;
		System.out.println("Indeksiss� 0: " + tyhjaTaulu[0] + "\nIndeksiss� 1: " + tyhjaTaulu[1]);
		
		System.out.println("Talukon pienin arvo " + laskin.palautaPienin(tyhjaTaulu));
		
		//Uuden taulukon alustaminen arvoilla
		int  taulu [] = {4,6};
		System.out.println(laskin.summaa(taulu[0], taulu[1]));

		//Mit� tarkoittaa k�yt�nn�ss�, ett� taulukko on olioviite? Toteuta metodi ja pohdi
		laskin.nollaaTaulu(taulu);
		System.out.println("Nollauksen j�lkeen:\nIndeksiss� 0: " + taulu[0] + "\nIndeksiss� 1: " + taulu[1]);
		
		
		
	}

}
