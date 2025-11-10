package oop;

import org.testng.annotations.Test;

public class MostenireTest {

    @Test
    public void metodaTest() {
        Angajat angajat = new Angajat("Popescu", "Andrei", 30, "Luptei 40", "Emerson", 2500, "nedeterminat", 10);
        angajat.infoAngajat();

        System.out.println(angajat.getVarsta());
        angajat.setVarsta(26);
        System.out.println(angajat.getVarsta());


//        Sportiv sportiv = new Sportiv("Ionescu", "Maria", 25, "Libertatii 10", "Fotbal", true, 3);
//        sportiv.infoSportiv();
//
//        Student student = new Student("Georgescu", "Ion", 22, "Unirii 5", "Ion Mincu Timisoara", "IT", 2, false);
//        student.infoStudent();
    }
}
