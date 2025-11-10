package oop;

public class Student extends Persoana {
    public String facultate;
    public String domeniu;
    public int an;
    public boolean restante;

    public Student(String nume, String prenume, int varsta, String adresa, String facultate, String domeniu, int an, boolean restante) {
        super(nume, prenume, varsta, adresa);
        this.facultate = facultate;
        this.domeniu = domeniu;
        this.an = an;
        this.restante = restante;
    }

    public void infoStudent() {
        infoPersoana();
        System.out.println("Facultatea la care studiaza este " + facultate);
        System.out.println("Domeniul in care studiaza este " + domeniu);
        System.out.println("In ce an este studentul? " + an);
        System.out.println("Are studentul restante? " + restante);
    }
}
