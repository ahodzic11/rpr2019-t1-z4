package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] supermarket = new Artikl[1000];
    private int brojArtikala =0;
    public void dodajArtikl(String naziv, int cijena, String kod){
        supermarket[brojArtikala] = new Artikl(naziv, cijena, kod);
    }

    public Artikl[] getArtikli(){
        return supermarket;
    }

    public void izbaciArtiklSaKodom(int kod){
        for(int i=0; i<brojArtikala; i++){
            if(supermarket[i].getKod().equals(kod)){
                supermarket[i]=null;
            }
        }
    }
}
