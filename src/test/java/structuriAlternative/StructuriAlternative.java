package structuriAlternative;

import org.testng.annotations.Test;

public class StructuriAlternative {

    // In programare exista 2 tipuri de structuri: alternative si repetitive
    // Structuri alternative: if ... else / switch ... case

    @Test
    public void metodaTest() {
//        verificaPersoanaMajora(16);
//        verificaPersoanaMajora(18);
//        verificareNumarPar(25);
//        verificareNumarPar(20);
//        divizibilCinciPozitiv(10);
//        divizibilCinciPozitiv(2);
//        divizibilCinciPozitiv(-4);
        zileleSaptamanii(7);

    }

    public void verificaPersoanaMajora(int varsta) {
        if(varsta >= 18) {
            System.out.println("Persoana este majora");
        } else {
            System.out.println("Persoana este minora");
        }
    }

    public void verificareNumarPar(int numar) {
        if(numar % 2 == 0) {
            System.out.println(numar + " este numar par");
        } else {
            System.out.println((numar + " este numar impar"));
        }
    }

    public void divizibilCinciPozitiv(int numar) {
        if(numar > 0 && numar % 5 == 0) {
            System.out.println(numar + " este pozitiv si divizibil cu 5");
        } else {
            System.out.println(numar + " nu indeplineste una dintre conditii");
        }
    }

    // la if compilatorul evalueaza fiecare conditie pas cu pas
    // la switch compilatorul sare la valoarea pe care i-am dat-o ca si parametru

    public void zileleSaptamanii(int zi) {
        switch(zi) {
            case 1:
                System.out.println("Astazi este luni");
                break;
            case 2:
                System.out.println("Astazi este marti");
                break;
            case 3:
                System.out.println("Astazi este miercuri");
                break;
            case 4:
                System.out.println("Astazi este joi");
                break;
            case 5:
                System.out.println("Astazi este vineri");
                break;
            case 6:
                System.out.println("Astazi este sambata");
                break;
            case 7:
                System.out.println("Astazi este duminica");
                break;
            default:
                System.out.println("Nu mai exista zile");
        }
    }
}

