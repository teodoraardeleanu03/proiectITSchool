package oop;

import org.testng.annotations.Test;

public class MostenireTest {

    @Test
    public void metodaTest() {
        Angajat anagajat = new Angajat("Popescu", "Andrei", 30, "Luptei 40", "Emerson", 2500, "nedeterminat", 10);
        anagajat.infoAngajat();

        Sportiv sportiv = new Sportiv("Ionescu", "Maria", 25, "Libertatii 10", "Fotbal", true, 3);
        sportiv.infoSportiv();
    }
}
