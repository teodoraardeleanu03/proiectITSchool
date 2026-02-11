package staticConcept;

import org.testng.annotations.Test;

public class StaticTest {

    @Test
    public void testMethod() {
        Elev alex = new Elev("Elev1", "Alex", 10);
        Elev maria = new Elev("Elev2", "Maria", 9);
        Elev ion = new Elev("Elev3", "Ion", 8);
        Elev ana = new Elev("Elev4", "Ana", 7);
        Elev mihai = new Elev("Elev5", "Mihai", 6);

        alex.prezentareElev();
        System.out.println();

        maria.prezentareElev();
        System.out.println();

        ion.prezentareElev();
        System.out.println();

        ana.prezentareElev();
        System.out.println();

        mihai.prezentareElev();
        System.out.println();
        mihai.calculEcuson();

        Elev.infoElev();
    }
}
