package cz.czechitas.lekce5;

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

        Osoba Manka = new Osoba();
        ...

        Adresa Raholec = new Adresa();
        Raholec.setUlice();
        Manka.setAdresa(Raholec);

        System.out.println("Slavnostně přísahám, že jsem připraven ke každé špatnosti.");
    }

}
