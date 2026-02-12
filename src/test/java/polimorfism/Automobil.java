package polimorfism;

public class Automobil {

    // polimorfism: dinamic (override) si static (overload)
    // dinamic = intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite
    // apare doar in relatia de mostenire
    // static = posibilitatea ca o metoda deja declarata sa aiba o structura la nivel de declarare diferita
    // metoda se diferentiaza prin numarul sau tipul de parametrii diferiti

    private String marca;
    private String model;
    private int an;

    public Automobil(String marca, String model, int an) {
        this.marca = marca;
        this.model = model;
        this.an = an;
    }

    // polimorfism dinamic
    public void pornesteAutomobil() {
        System.out.println("Automobilul porneste de la buton");
    }
}
