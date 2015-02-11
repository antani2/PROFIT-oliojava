package java4;

public class Oppilas {

    private String nimi; // Oppilaan nimi.
    private Oppilas seuraava; // Linkki edelliseen oppilaaseen.
    
    public Oppilas() {
       nimi = null;
       seuraava = null;
    }
    
    public Oppilas(String pNimi, Oppilas pSeuraava) {
        nimi = pNimi;
        seuraava = pSeuraava;
    }

}
