package oop;

public class Student extends Persoana implements StudentInterface {
    private String facultate;
    private String domeniu;
    private int an;
    private boolean restante;

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

    public void mananca() {
        super.mananca();
        System.out.println("Studentul mananca intre cursuri.");
    }

    public void cautaStudent() {
        System.out.println("Afisez toti studentii");
    }

    public void cautaStudent(String facultate, int an) {
        System.out.println("Afisez studentii de la facultatea " + facultate + " care sunt in anul " + an);
    }

    public void cautaStudent(boolean restante) {
        System.out.println("Afisez studentii care au restante: " + restante);
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public String getDomeniu() {
        return domeniu;
    }

    public void setDomeniu(String domeniu) {
        this.domeniu = domeniu;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public boolean isRestante() {
        return restante;
    }

    public void setRestante(boolean restante) {
        this.restante = restante;
    }

    @Override
    public void mergeLaCursuri() {
        System.out.println("Studentul este obligat sa mearga la cursuri.");
    }

    @Override
    public void trebuieSaStudieze() {
        System.out.println("Studentul trebuie sa studieze pentru examene.");
    }

    @Override
    public void saNuAibaRestante() {
        System.out.println("Studentul trebuie sa nu aiba restante la examene.");
    }
}
