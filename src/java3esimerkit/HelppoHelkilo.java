package java3esimerkit;

public class HelppoHelkilo {
    private String etuNimi;
    private String sukuNimi;
    private int syntymavuosi;

    public HelppoHelkilo(String etuNimi, String sukuNimi, int sVuosi) {
      this.etuNimi = etuNimi;
      this.sukuNimi = sukuNimi;
      this.syntymavuosi = sVuosi;
    }
    
    public String  getNimi()       { return etuNimi + " " + sukuNimi;       }
    public int  getSyntymavuosi() { return syntymavuosi;}
    public String  toString() { return getNimi() + " " + getSyntymavuosi() ;}
    
    public static void main(String[] args) {
        HelppoHelkilo aku = new HelppoHelkilo("Aku", "Ankka", 1934);
        System.out.println(aku.getNimi());  // tulostaa Aku Ankka
        System.out.println(aku.getSyntymavuosi());  // tulostaa 1934
        System.out.println(aku.toString()); // tulostaa Aku|Ankka|1934
    }

}
