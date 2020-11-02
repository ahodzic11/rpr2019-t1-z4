package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket supermarket = new Supermarket();
        Artikl A = new Artikl("Pojacalo", 300, "505");
        supermarket.dodajArtikl(A);
        supermarket.izbaciArtiklSaKodom("505");
        assertEquals(0, supermarket.getBrojArtikala());
    }

    @Test
    void dodajArtikl() {
        Supermarket supermarket = new Supermarket();
        Artikl A = new Artikl("Pojacalo", 300, "505");
        supermarket.dodajArtikl(A);
        assertEquals(1, supermarket.getBrojArtikala());
    }
}