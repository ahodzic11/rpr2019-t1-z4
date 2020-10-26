package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] korpa = new Artikl[50];
    private int brojArtikala = 0;
    public void dodajArtikl(String naziv, int cijena, String kod){
        korpa[brojArtikala] = new Artikl(naziv, cijena, kod);
    }
}
