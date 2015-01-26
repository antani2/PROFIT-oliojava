package java2;

import fi.jyu.mit.graphics.*;

/**
 * Harjoitellaan piirtely‰ ja kuormittamista
 * @author Ari Tuhkala
 *
 */
public class Lumiukko {
	
	/**
	 * Piirt‰‰ lumiukon annettuun paikkaan
	 * 
	 * @param w
	 * @param x
	 * @param y
	 * @param isonPallonSade
	 * @param keskipallonSade
	 * @param pikkupallonSade
	 */
	public void piirraLumiukko(EasyWindow w,double x, double y,double isonPallonSade, double keskipallonSade, double pikkupallonSade) {

	        double keskiPallonY = y + isonPallonSade +  keskipallonSade; //ratkaise t‰h‰n keskiPallonY
	        double pikkuPallonY = keskiPallonY + keskipallonSade + pikkupallonSade; //ratkaise t‰h‰n pikkuPallonY
	        
	        w.addCircle(x,y,isonPallonSade); //piirt‰‰ ison pallon
	        w.addCircle(x,keskiPallonY,keskipallonSade); //piirt‰‰ keskipallon
	        w.addCircle(x,pikkuPallonY,pikkupallonSade); //piirt‰‰ pikkupallon
	        
	}
	
	public void piirraLumiukko(EasyWindow w,double x, double y) {

		piirraLumiukko(w,x, y,35, 25, 10);
	}

	public void piirraLumiukko(EasyWindow w,double x, double y, double isonPallonSade) {

		piirraLumiukko(w,x, y,isonPallonSade, 25, 10);
	}
	public void piirraLumiukko(EasyWindow w,double x, double y, double isonPallonSade, double keskipallonSade) {

		piirraLumiukko(w,x, y,isonPallonSade, keskipallonSade, 10);
	}	
	
    public static void main(String[] args) {
    	//Luodaan uusi ikkuna
        EasyWindow window = new EasyWindow();
        
        window.scale(0, 0, 1000, 1000);
        
        //Luodaan lumiukko-olio
        Lumiukko lumiukko = new Lumiukko ();
        
        // Piirret‰‰n lumiukko (ikkuna, johon piirret‰‰n,x,y,alimman pallon s‰de, keskipallon s‰de, ylimm‰n pallon s‰de)
        lumiukko.piirraLumiukko(window,100,100,20,20,20);
        lumiukko.piirraLumiukko(window,200,100);
        lumiukko.piirraLumiukko(window,400,100,80);
        lumiukko.piirraLumiukko(window,600,100,80,60);
        
        
        /**
         *Pist‰ alla olevat toimimaan
         * 
    	 *lumiukko(window, x, y); // piirt‰‰ standardikokoisen lumiukon
    	 *lumiukko(window, x, y, isonPallonSade);
    	 *lumiukko(window, x, y, isonPallonSade, keskiPallonSade); 
    	 *lumiukko(window, x, y, isonPallonSade, keskiPallonSade, pienenPallonSade);
         **/
        
        // N‰ytet‰‰n ikkuna
        window.showWindow();
    }

}
