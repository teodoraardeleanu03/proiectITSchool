package obiectConstructor;

import java.util.List;

public class Hotel {
    public String nume;
    public String adresa;
    public String oras;
    public String tara;
    public int numarStele;
    public List<String> facilitati;

    public Hotel(String nume, String adresa, String oras, String tara, int numarStele, List<String> facilitati) {
        this.nume = nume;
        this.adresa = adresa;
        this.oras = oras;
        this.tara = tara;
        this.numarStele = numarStele;
        this.facilitati = facilitati;
    }

    public void prezentareHotel() {
        System.out.println("Numele hotelului este " + nume);
        System.out.println("Adresa hotelului este " + adresa);
        System.out.println("Hotelul se afla in orasul " + oras);
        System.out.println("Hotelul se afla in tara " + tara);
        if (numarStele == 1) {
            System.out.println("Hotelul are o stea");
        } else {
            System.out.println("Hotelul are " + numarStele + " stele");
        }
        System.out.println("Facilitatile hotelului sunt: ");
        for (int i = 0; i < facilitati.size(); i++) {
            System.out.println(facilitati.get(i));
        }
    }

    public void calculeazaPretCamera() {
        switch (numarStele) {
            case 1:
                System.out.println("Pretul camerei este 100 ron");
                break;
            case 2:
                System.out.println("Pretul camerei este 200 ron");
                break;
            case 3:
                System.out.println("Pretul camerei este 300 ron");
                break;
            default:
                System.out.println("clasificare necunoscuta, nu se poate calcula pretul");
                break;
        }
    }
}
