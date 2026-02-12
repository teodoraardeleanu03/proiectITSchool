package polimorfism;

public class Masina extends Automobil {
    public Masina(String marca, String model, int an) {
        super(marca, model, an);
    }

    // polimorfism dinamic
    public void pornesteAutomobil() {
        //super.pornesteAutomobil();
        System.out.println("Masina porneste de la cheie");
    }

    // polimorfism static
    public void aplicareReducere() {
        System.out.println("In ianuarie se aplica 5% reducere");
    }

    public void aplicareReducere(int procent) {
        System.out.println("In ianuarie se aplica " + procent + "% reducere");
    }

    public void aplicareReducere(String cupon) {
        System.out.println("In ianuarie se aplica reducere cu cuponul " + cupon);
    }
}
