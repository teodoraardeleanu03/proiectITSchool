package oop;

public interface AngajatInterface {

    // Abstractizarea = conceptul prin care putem defini comportamentul unei clase.
    // Abstractizarea se poate face prin 2 feluri: interfete si clase abstracte.
    // Interfetele contin doar metode abstracte (Metodele nu au - body -)
    // Toate metodele abstracte sunt publice:
    // Intr-o interfata putem defini metode cu void sau return;
    // Intr-o interfata nu putem avea un constructor - Nu putem face un obiect
    // Interfata se implementeaza - O interfata se implementeaza, iar o clasa se mosteneste
    // Clasa care implementeaza o interfata trebuie sa implementeze toate metodele din interfata
    // O clasa poate implementa mai multe interfete
    // O interfata poate mosteni o alta interfata

    void ajungeLaTimpLaBirou();

    void munceste();

    void respectaRegulamentulIntern();
}
