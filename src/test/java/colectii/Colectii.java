package colectii;

import org.testng.annotations.Test;

import java.util.*;

public class Colectii {
    // array, list, set/map
    @Test
    public void metodaTest() {
        //cursantiArray();
        //cursantiList();
        //listaMasini();
        //exemple();
        //tariOrase();
        caietRetete();
    }

    public void cursantiArray() {
        String[] cursanti = new String[5];
        cursanti[0] = "Teodora";
        cursanti[1] = "Ioana";
        cursanti[2] = "Mihai";
        cursanti[3] = "Monica";
        cursanti[4] = "Andrei";

        for (int i = 0; i < cursanti.length; i++) {
            System.out.println("Numele cursantului este " + cursanti[i]);
        }
    }

    public void cursantiList() {
        List<String> cursanti = new ArrayList<>();
        cursanti.add("Teodora");
        cursanti.add("Oana");
        cursanti.add("Ioana");
        for(int i = 0; i < cursanti.size(); i++) {
            System.out.println("Numele cursantului este: " + cursanti.get(i));
        }
    }

    public void listaMasini() {
        List<String> masini = new ArrayList<>();
        masini.add("Dacia");
        masini.add("Volvo");
        masini.add("BMW");
        masini.add("Skoda");

        for(int i = 0; i < masini.size(); i++) {
            System.out.println("Numele masinii este: " + masini.get(i));
        }
    }

    // Maps - cheie = valoare
    // Parcurgerea se face pe baza cheilor folosind un set

    public void exemple() {
        Map<String, String> elemente = new HashMap<>();
        elemente.put("Masina", "Dacia");
        elemente.put("Persoana", "Alex");
        elemente.put("Telefon", "iPhone");
        for(String key: elemente.keySet()) {
            System.out.println("Cheia este " + key);
            System.out.println("Valoarea este " + elemente.get(key));
        }
    }

    public void tariOrase() {
        Map<String, List<String>> obiecte = new HashMap<>();
        List<String> oraseRomania = Arrays.asList("Cluj", "Bucuresti", "Timisoara");
        List<String> oraseItalia = Arrays.asList("Torino", "Roma", "Verona");
        List<String> oraseSpania = Arrays.asList("Madrid", "Barcelona", "Valencia");

        obiecte.put("Romania", oraseRomania);
        obiecte.put("Italia", oraseItalia);
        obiecte.put("Spania", oraseSpania);

        for(String key: obiecte.keySet()) {
            System.out.println("Tara este: " + key);
            System.out.println("Orasele sunt: " + obiecte.get(key));
        }
    }

    public void caietRetete() {
        Map<String, List<String>> ingrediente = new HashMap<>();
        List<String> ingredienteSupaPui = Arrays.asList("pui", "apa", "legume");
        List<String> ingredientePrajitura = Arrays.asList("zahar", "lapte", "fructe");
        List<String> ingredienteSarmale = Arrays.asList("orez", "carne tocata", "sos rosii");

        ingrediente.put("Supa Pui", ingredienteSupaPui);
        ingrediente.put("Prajitura", ingredientePrajitura);
        ingrediente.put("Sarmale", ingredienteSarmale);

        for(String key: ingrediente.keySet()) {
            System.out.println("Reteta este: " + key);
            System.out.println("Ingredientele sunt: " + ingrediente.get(key));
        }
    }
}
