package exceptions;

import org.testng.annotations.Test;

public class Exceptie {

    // exceptie = eroare care apare in momentul in care programul ruleaza
    // exceptiile trebuie tratate deoarece contin informatii din interior care pot sa fie exploatate
    // ca sa tratam o exceptie, se foloseste structura try..catch..finally

    // 2 tipuri de exceptii: unchecked si checked
    // checked => exceptii care apar in momentul in care vrem sa folosim o anumita clasa
    // uncheck => exceptii care ne iau prin surprindere

    // 2 keyword specifice: throw si throws
    // throw => cuvant pe care il folosim cand vrem sa facem trigger la o exceptie
    // throws => cuvant pe care il folosim ca sa adaugam exceptia la semnatura metodei (VECI!!!)

    @Test
    public void testMethod() {

    }

    //checked
    public void checkedExample() {
    }
}
