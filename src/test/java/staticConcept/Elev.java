package staticConcept;

public class Elev {

    //static este un keyword pe care il folosim cu scopul de a salva o valoare default pentru o variabila definita
    //daca folosim acest lucru salvam spatiu in memorie si toate obiectele pe care le definim vor folosi aceeasi valoare
    public String nume;
    public String prenume;
    public int varsta;
    public static String scoala = "Liviu Rebreanu";
    public static int indexEcuson = 0;

    public Elev(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        indexEcuson++;
    }

    public void prezentareElev() {
        System.out.println("Numele elevului este: " + nume);
        System.out.println("Prenumele elevului este: " + prenume);
        System.out.println("Varsta elevului este: " + varsta);
        System.out.println("Scoala elevului este: " + scoala);
    }

    public void calculEcuson() {
        System.out.println("Nr de elevi cu ecuson este " + indexEcuson);
    }

    public static void infoElev() {
        System.out.println("Salut, sunt un elev al scolii");
    }
}

