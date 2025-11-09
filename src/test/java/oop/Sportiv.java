package oop;

public class Sportiv extends Persoana {
    public String sport;
    public boolean sportEchipa;
    public int experienta;

    public Sportiv(String nume, String prenume, int varsta, String adresa, String sport, boolean sportEchipa, int experienta) {
        super(nume, prenume, varsta, adresa);
        this.sport = sport;
        this.sportEchipa = sportEchipa;
        this.experienta = experienta;
    }

    public void infoSportiv() {
        infoPersoana();
        System.out.println("Sportul este " + sport);
        System.out.println("Sportivul face parte dintr-o echipa? " + sportEchipa);
        System.out.println("Experienta sportivului este de " + experienta);
    }
}
