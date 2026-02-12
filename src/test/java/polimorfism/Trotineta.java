package polimorfism;

public class Trotineta extends Automobil{
    public Trotineta(String marca, String model, int an) {
        super(marca, model, an);
    }

    // polimorfism dinamic
    @Override
    public void pornesteAutomobil() {
        System.out.println("Trotineta porneste daca are bateria incarcata");
    }
}
