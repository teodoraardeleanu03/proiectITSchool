package oop;

public class Angajat extends Persoana implements AngajatInterface {
    private String firma;
    private double salariu;
    private String contract;
    private int zileLibere;

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

    public void mananca() {
        System.out.println("Angajatul mananca in pauza de masa.");
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public int getZileLibere() {
        return zileLibere;
    }

    public void setZileLibere(int zileLibere) {
        this.zileLibere = zileLibere;
    }

    // Polimorfism static
    // Metoda fara parametri
    public void afiseazaDetalii() {
        System.out.println("Afisez toti angajatii din companie");
    }

    public void afiseazaDetalii(String firma) {
        System.out.println("Afisez angajatii din firma: " + firma);
    }

    public void afiseazaDetalii(String firma, boolean contract) {
        System.out.println("Afisez angajatii din: " + firma + " cu contract pe perioada determinata " + contract);
    }

    @Override
    public void ajungeLaTimpLaBirou() {
        System.out.println("Angajatul trebuie sa ajunga la birou la 8.");
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul trebuie sa munceasca in intervalul 8 - 17");
    }

    @Override
    public void respectaRegulamentulIntern() {
        System.out.println("Angajatul respecta ordinul intern.");
    }
}
