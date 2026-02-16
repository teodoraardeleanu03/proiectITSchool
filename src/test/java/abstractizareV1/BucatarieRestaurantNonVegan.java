package abstractizareV1;

public class BucatarieRestaurantNonVegan extends Restaurant implements IRestaurantNonVegan {
    public BucatarieRestaurantNonVegan(String nume, String adresa, int telefon) {
        super(nume, adresa, telefon);
    }

    @Override
    public void servesteBurger() {

    }

    @Override
    public void servestePaste() {

    }

    @Override
    public void servesteCostite() {

    }

    @Override
    public void servestePizza() {

    }
}
