package polimorfism;

import org.testng.annotations.Test;

public class PolimorfismTest {

    @Test
    public void testMethod() {
        Masina masina = new Masina("Dacia", "Logan", 2020);
        masina.pornesteAutomobil();
        masina.aplicareReducere();
        masina.aplicareReducere(10);
        masina.aplicareReducere("REDUCERE10");

        Trotineta trotineta = new Trotineta("Xiaomi", "M365", 2019);
        trotineta.pornesteAutomobil();
    }

}
