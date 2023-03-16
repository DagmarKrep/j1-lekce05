package cz.czechitas.lekce5;

import cz.czechitas.lekce5.model.Adresa;
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

        Telefon mankyTelefon = new Telefon();
        mankyTelefon.setPredcisli("+420");
        mankyTelefon.setTelefonniCislo("111222333");

        Adresa mankyAdresa = new Adresa();
        mankyAdresa.setUlice("Raholecka 5");
        mankyAdresa.setCastObce("Pod dubem");
        mankyAdresa.setObec("Raholec");
        mankyAdresa.setPsc("12311");

        Osoba manka = new Osoba();
        manka.setJmeno("Manka");
        manka.setPrijmeni("Rumcajsova");
        manka.setZena(true);
        manka.setRodneCislo("020202/0000");
        manka.setTelefon(mankyTelefon);
        manka.setPracovniEmail("manka@jicin.cz");
        manka.setSoukromyEmail("manka@raholec.cz");
        manka.setAdresa(mankyAdresa);

        System.out.println(manka);
        System.out.println("Cele jmeno: " + manka.getCeleJmeno());
        System.out.println("Telefon: "+ manka.getTelefon());
        System.out.println("Soukromy email: "+ manka.getSoukromyEmail());
        System.out.println("Pracovni email: "+ manka.getPracovniEmail());
        System.out.println(manka.getAdresa());

//        System.out.println("Telefon: "+ manka.getTelefon().getTelefonniCislo());

        System.out.println("Slavnostně přísahám, že jsem připraven ke každé špatnosti.");
    }

}
