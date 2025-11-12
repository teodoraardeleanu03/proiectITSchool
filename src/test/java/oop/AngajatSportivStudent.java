package oop;

public class AngajatSportivStudent extends Persoana implements AngajatInterface, SportivInterface, StudentInterface {
    private String firma;
    private double salariu;
    private String contract;
    private int zileLibere;
    private String sport;
    private boolean sportEchipa;
    private int experienta;
    private String facultate;
    private String domeniu;
    private int an;
    private boolean restante;

    public AngajatSportivStudent(String nume, String prenume, int varsta, String adresa, String firma, double salariu,
                                 String contract, int zileLibere, String sport, boolean sportEchipa, int experienta,
                                 String facultate, String domeniu, int an, boolean restante) {
        super(nume, prenume, varsta, adresa);
        this.firma = firma;
        this.salariu = salariu;
        this.contract = contract;
        this.zileLibere = zileLibere;
        this.sport = sport;
        this.sportEchipa = sportEchipa;
        this.experienta = experienta;
        this.facultate = facultate;
        this.domeniu = domeniu;
        this.an = an;
        this.restante = restante;
    }

    @Override
    public void ajungeLaTimpLaBirou() {

    }

    @Override
    public void munceste() {

    }

    @Override
    public void respectaRegulamentulIntern() {

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
