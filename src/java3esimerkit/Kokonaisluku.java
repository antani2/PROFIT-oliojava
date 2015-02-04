package java3esimerkit;

/**
 * M‰‰rittele luokka Kokonaisluku, jolla on yksi yksityinen 
 * int-tyyppinen attribuutti nimelt‰ arvo. Tee luokalle kaksi 
 * konstruktoria. Toisella ei ole parametreja ja se alustaa 
 * kokonaisluvun arvoksi 0. Toisella on int-tyyppinen 
 * parametri ja se asettaa kyseisen arvon kokonaisluvun arvoksi.
 * 

Tee luokalle metodit lis‰‰, v‰henn‰, kerro ja jaa. 
N‰ill‰ metodeilla on int-tyyppinen parametri ja ne 
tekev‰t kyseiset laskutoimitukset. Vinkki: toteuta 
ensin saantimetodit.

Tee luokka LukuTesti, jonka p‰‰ohjelmaassa testaat 
Kokonaisluku-luokan toimintaa. Ohjelma voi esimerkiksi 
kysy‰ k‰ytt‰j‰lt‰ luotavan luvun arvon ja kysell‰ t‰m‰n 
j‰lkeen, mit‰ luvulle tehd‰‰n. Jokaisen toiminnon j‰lkeen 
n‰ytˆlle tulostetaan kokonaisluvun sen hetkisen arvon.
 * @author tani
 *
 */
public class Kokonaisluku {
	private int arvo;
	
	public Kokonaisluku(){
		arvo = 0;
	}

	public Kokonaisluku(int alkuArvo){
		arvo = alkuArvo;
	}
	public int getArvo(){
		return arvo;
	}
	
	public void lisaa(int value){
		arvo += value;
	}
	
	public void vahenna(int value){
		arvo -= value;
	}	

}


