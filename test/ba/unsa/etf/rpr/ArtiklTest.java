package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl testni = new Artikl("TV", 500, "301");
        assertEquals("TV", testni.getNaziv());
    }

    @Test
    void getCijena() {
        Artikl testni = new Artikl("TV", 500, "301");
        assertEquals(500, testni.getCijena());
    }

    @Test
    void getKod() {
        Artikl testni = new Artikl("TV", 500, "301");
        assertEquals("301", testni.getKod());
    }
}