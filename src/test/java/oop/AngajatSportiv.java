package oop;

public class AngajatSportiv extends Persoana implements AngajatInterface, SportivInterface {
    private String firma;
    private double salariu;
    private String contract;
    private int zileLibere;
    private String sport;
    private boolean sportEchipa;
    private int experienta;

    public AngajatSportiv(String nume, String prenume, int varsta, String adresa, String firma, double salariu,
                          String contract, int zileLibere, String sport, boolean sportEchipa, int experienta) {
        super(nume, prenume, varsta, adresa);
        this.firma = firma;
        this.salariu = salariu;
        this.contract = contract;
        this.zileLibere = zileLibere;
        this.sport = sport;
        this.sportEchipa = sportEchipa;
        this.experienta = experienta;
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
}
