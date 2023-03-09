package cz.czechitas.lekce5.model;

import java.util.Objects;

    public class Osoba {
    private String jmeno;
    private String prijmeni;
    private boolean zena;
    private boolean muz;
    private String rodneCislo;
    private Telefon telefon;
    private String pracovniEmail;
    private String soukromyEmail;


    public String getJmeno() {
            return jmeno;
        }
    public void setJmeno(String jmeno) {
        Objects.requireNonNull(jmeno);
        if (jmeno.isBlank()) {
            System.err.println("Jméno nemůže být prázdné.");
            return;
        }
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
            return prijmeni;
        }

    public void setPrijmeni(String prijmeni) {
        Objects.requireNonNull(prijmeni);
        if (prijmeni.isBlank()) {
            System.err.println("Příjmení nemůže být prázdné.");
            return;
        }
        this.prijmeni = prijmeni;
    }

    public String getCeleJmeno() {
        return jmeno + " " + prijmeni;
    }

    public boolean isZena() {
        return this.zena;
    }

    public void setZena(boolean zena) {
        this.zena = zena;
    }

    public boolean isMuz() {
        return muz;
    }

    public void setMuz(boolean muz) {
        this.muz = muz;
    }

    public String getRodneCislo() {
        return rodneCislo;
    }

    public void setRodneCislo(String rodneCislo) {
        Objects.requireNonNull(rodneCislo);
        if (rodneCislo.isBlank()) {
            System.err.println("Rodné číslo nemůže být prázdné.");
            return;
        }
        if (!rodneCislo.contains("/")) {
            System.err.println("Rodné číslo musí obsahovat lomítko.");
            return;
        }
        this.rodneCislo = rodneCislo;
    }

    public Telefon getTelefon() {
        return telefon;
    }

    public void setTelefon(Telefon telefon) {
        this.telefon = telefon;
    }

    public String getPracovniEmail() {
        return pracovniEmail;
    }

    public void setPracovniEmail(String pracovniEmail) {
        Objects.requireNonNull(pracovniEmail);
        if (pracovniEmail.isBlank()) {
            System.err.println("Pole 'Pracovní email' nemůže být prázdné.");
            return;
        }
        this.pracovniEmail = pracovniEmail;
    }

    public String getSoukromyEmail() {
        return soukromyEmail;
    }

    public void setSoukromyEmail(String soukromyEmail) {
        Objects.requireNonNull(soukromyEmail);
        if (soukromyEmail.isBlank()) {
            System.err.println("Pole 'Soukromý email' nemůže být prázdné.");
            return;
        }
        this.pracovniEmail = soukromyEmail;
        }

        public String toString() {
        return jmeno + " " + prijmeni + " (" + rodneCislo + ")";
    }


}

