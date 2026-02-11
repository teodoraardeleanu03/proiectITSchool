package structuriRepetitive;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    // Structurile repetitive: FOR, WHILE, FOR-EACH, DO-WHILE
    @Test
    public void metodaTest() {
        //afisareNumere(100);
        afisareNumerePare(50);
        afisareNumereWhile(100);
    }

    // afisare primele n numere
    public void afisareNumere(int capat) {
        for(int index = 0; index < capat; index++) {
            System.out.println("Vreau sa afisez numarul " + index);
        }
    }

    // Metoda de mai sus cu "for" facuta cu "while"
    public void afisareNumereWhile(int capat) {
        int index = 0;
        while(index < capat) {
            System.out.println("Vreau sa afisez numarul " + index);
            index++;
        }
    }

    // afisare numere pare de la 0 la 50
    public void afisareNumerePare(int capat) {
        for(int i = 0; i <= capat; i++) {
            if(i % 2 == 0) {
                System.out.println("Vreau sa afisez " + i);
            }
        }
    }
}
