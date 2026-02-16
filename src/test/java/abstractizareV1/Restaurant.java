package abstractizareV1;

public class Restaurant {

    // abstractizare = conceptul prin care putem defini comportamentul unei clase
    // abstractizare: interfete - clasa abstracta
    // interfata = este o structura care contine doar metode abstracte
    // o metoda abstracta este o metoda care nu are implementare
    // clasa care implementeaza interfata trebuie sa implementeze toate metodele abstracte
    // toate metodele din interfata sunt abstracte si publice
    // o interfata nu poate contine un constructor => nu poti face un obiect dintr-o interfata
    // o clasa poate implementa mai multe interfete
    // o interfata poate mosteni o alta interfata

    private String nume;
    private String adresa;
    private int telefon;

    public Restaurant(String nume, String adresa, int telefon) {
        this.nume = nume;
        this.adresa = adresa;
        this.telefon = telefon;
    }
}
