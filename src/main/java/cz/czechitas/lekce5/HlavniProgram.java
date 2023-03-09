package cz.czechitas.lekce5;

import cz.czechitas.lekce5.model.Osoba;
import cz.czechitas.lekce5.model.Telefon;

/**
 * Hlaví třída pro lekci 5.
 */
public class HlavniProgram {

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {
        //TODO tady bude náš kód

        Osoba manka = new Osoba();
        manka.setJmeno("Manka");
        Telefon mankyTelefon = new Telefon();

        ...

        Adresa Raholec = new Adresa();
        Raholec.setUlice();
        Manka.setAdresa(Raholec);

        System.out.println("Slavnostně přísahám, že jsem připraven ke každé špatnosti.");
    }

}
