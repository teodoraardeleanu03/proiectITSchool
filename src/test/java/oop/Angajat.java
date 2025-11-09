package oop;

public class Angajat extends Persoana {
    public String firma;
    public double salariu;
    public String contract;
    public int zileLibere;

    public Angajat(String nume, String prenume, int varsta, String adresa, String firma, double salariu, String contract, int zileLibere) {
        super(nume, prenume, varsta, adresa);
        this.firma = firma;
        this.salariu = salariu;
        this.contract = contract;
        this.zileLibere = zileLibere;
    }

    public void infoAngajat() {
        infoPersoana();
        System.out.println("Firma la care lucreaza angajatul este " + firma);
        System.out.println("Salariul angajatului este " + salariu);
        System.out.println("Perioada contractului este " + contract);
        System.out.println("Cate zile libere are angajatul? " + zileLibere);
    }
}
