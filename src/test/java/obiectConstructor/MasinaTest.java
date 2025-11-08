package obiectConstructor;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MasinaTest {
    @Test
    public void masinaTest() {
        Masina dacia = new Masina("Dacia", "Sandero", 2020, "Rosie",
                Arrays.asList("- Aer conditionat", "- Incalzire in scaune", "- Dezaburire parbriz"), false);
        dacia.prezentareMasina();
        dacia.calculImpozit();
        System.out.println();

        Masina mercedes = new Masina("Mercedes", "C200", 2015, "Gri",
                Arrays.asList("- Aer conditionat", "- Incalzire in scaune", "- Dezaburire parbriz"), true);
        mercedes.prezentareMasina();
        mercedes.calculImpozit();
        System.out.println();

        Masina volvo = new Masina("Volvo", "XC90", 2025, "Negru",
                Arrays.asList("- Aer conditionat", "- Incalzire in scaune", "- Dezaburire parbriz"), true, 20000);
        volvo.prezentareMasina();
        volvo.calculImpozit();
    }
}
