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
        System.out.println(angajat.getSalariu());
        angajat.mananca();
        System.out.println();
        angajat.afiseazaDetalii();
        System.out.println();
        angajat.afiseazaDetalii("Altex");
        System.out.println();
        angajat.afiseazaDetalii("Altex", true);
        System.out.println();
        angajat.ajungeLaTimpLaBirou();
        angajat.munceste();
        angajat.respectaRegulamentulIntern();

        Sportiv sportiv = new Sportiv("Ionescu", "Maria", 25, "Libertatii 10", "Fotbal", true, 3);
        sportiv.infoSportiv();
        sportiv.mananca();

        System.out.println();
        sportiv.cautaSportivi();
        System.out.println();
        sportiv.cautaSportivi("Tenis");
        System.out.println();
        sportiv.cautaSportivi("Fotbal", 2);
        System.out.println();
        sportiv.mergeLaAntrenamente();
        sportiv.participaLaCompetitii();
        sportiv.respectaRegimAlimentar();

        Student student = new Student("Georgescu", "Ion", 22, "Unirii 5", "Ion Mincu Timisoara", "IT", 2, false);
        student.infoStudent();
        student.mananca();

        System.out.println();
        student.cautaStudent();
        System.out.println();
        student.cautaStudent(true);
        System.out.println();
        student.cautaStudent("ASE", 3);
        student.mergeLaCursuri();
        student.trebuieSaStudieze();
        student.saNuAibaRestante();
    }
}
