package oop;

public class SportivStudent extends Persoana implements SportivInterface, StudentInterface {
    private String sport;
    private boolean sportEchipa;
    private int experienta;
    private String facultate;
    private String domeniu;
    private int an;
    private boolean restante;

    public SportivStudent(String nume, String prenume, int varsta, String adresa, String sport, boolean sportEchipa,
                          int experienta, String facultate, String domeniu, int an, boolean restante) {
        super(nume, prenume, varsta, adresa);
        this.sport = sport;
        this.sportEchipa = sportEchipa;
        this.experienta = experienta;
        this.facultate = facultate;
        this.domeniu = domeniu;
        this.an = an;
        this.restante = restante;
    }

    @Override
    public void mergeLaAntrenamente() {

    }

    @Override
    public void participaLaCompetitii() {

    }

    @Override
    public void respectaRegimAlimentar() {

    }

    @Override
    public void mergeLaCursuri() {

    }

    @Override
    public void trebuieSaStudieze() {

    }

    @Override
    public void saNuAibaRestante() {

    }
}
