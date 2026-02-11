package structuriAlternative;

import org.testng.annotations.Test;

public class StructuriAlternative2 {

    @Test
    public void testMethod() {
        determinareNumarPar(4);
        determinareNumarPar(-5);
        determinareNumarPar(5);
        determinareNumarPar(-4);
    }

    // verificam daca un numar este par si pozitiv
    // / = operator care targheteaza la o impartire catul (div)
    // % = operator care targheteaza la o impartire restul (mod)
    public void determinareNumarPar(int numar) {
        if (numar > 0) {
            if (numar % 2 == 0) {
                System.out.println("Numarul " + numar + " este par si pozitiv.");
            } else {
                System.out.println("Numarul " + numar + " este impar si pozitiv.");
            }
        } else {
            if (numar % 2 != 0) {
                System.out.println("Numarul " + numar + " este impar si negativ.");
            } else {
                System.out.println("Numarul " + numar + " este par si negativ.");
            }
        }
    }
}
