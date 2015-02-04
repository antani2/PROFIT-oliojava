package java3esimerkit;
/**
 * 
 * @author tani
 *
 */
public class LukuTesti {

	public static void main(String[] args) {
		Kokonaisluku luku = new Kokonaisluku(3);
		luku.lisaa(4);
		luku.vahenna(3);
		System.out.println(luku.getArvo());
	}

}
