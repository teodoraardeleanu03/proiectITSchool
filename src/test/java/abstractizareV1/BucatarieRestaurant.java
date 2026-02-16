package abstractizareV1;

public class BucatarieRestaurant extends Restaurant implements IRestaurantVegan, IRestaurantNonVegan {

    public BucatarieRestaurant(String nume, String adresa, int telefon) {
        super(nume, adresa, telefon);
    }

    @Override
    public void servesteHumus() {

    }

    @Override
    public void servesteSalataVerde() {

    }

    @Override
    public void servesteSucAvocado() {

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
