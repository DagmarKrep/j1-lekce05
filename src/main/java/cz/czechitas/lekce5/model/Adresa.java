package cz.czechitas.lekce5.model;

import java.util.Objects;

public class Adresa {
    private String ulice;
    private String cisloDomu;
    private String mesto;
    private String psc;

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public String getCisloDomu() {
        return cisloDomu;
    }

    public void setCisloDomu(String cisloDomu) {
        this.cisloDomu = cisloDomu;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        this.psc = psc;
    }
}
