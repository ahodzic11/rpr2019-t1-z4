package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa K = new Korpa();
        Artikl A = new Artikl("Gitara", 500, "Les Paul");
        K.dodajArtikl(A);
        assertEquals(1, K.getBrojArtikala());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa K = new Korpa();
        Artikl A = new Artikl("Gitara", 500, "Les Paul");
        K.dodajArtikl(A);
        K.izbaciArtiklSaKodom("Les Paul");
        assertEquals(0, K.getBrojArtikala());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa K = new Korpa();
        Artikl A = new Artikl("Gitara", 500, "Les Paul");
        K.dodajArtikl(A);
        assertEquals(500, K.dajUkupnuCijenuArtikala());
    }
}