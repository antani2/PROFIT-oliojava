package java3esimerkit;
public class Henkilo {
  private final String hetu;
  private String nimi;
  private Henkilo puoliso;

  public Henkilo(String hetu) {
    this.hetu = hetu;
  }

  public String  getHetu()       { return hetu;       }
  public void    setNimi(String uNimi) { nimi = uNimi; }
  public String  getNimi()       { return nimi;       }
  public Henkilo getPuoliso()    { return puoliso;    }

  public void avioidu(Henkilo h) {
    //Varmistetaan, ett‰ kumpikaan osapuoli ei ole naimisissa.
    h.eroa();
    eroa();
    //Menn‰‰n naimisiin.
    puoliso = h;
    h.puoliso = this;
    
  }

  public void eroa() {
    if ( puoliso != null ) {
      puoliso.puoliso = null;
      puoliso = null;
    }
  }
  
  public static void main (String [] args) {
      Henkilo hlo1 = new Henkilo("111211-000j");
      hlo1.setNimi("Pekka");
      Henkilo hlo2 = new Henkilo("111111-000a");
      hlo2.setNimi("Leena");
      hlo1.avioidu(hlo2);
      System.out.println("Nimi " + hlo1.getNimi());
      System.out.println("Puoliso " + hlo1.getPuoliso().getNimi());
      System.out.println("Nimi " + hlo2.getNimi());
      System.out.println("Puoliso " + hlo2.getPuoliso().getNimi());
  }
  
}