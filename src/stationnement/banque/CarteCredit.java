package stationnement.banque;

import java.time.YearMonth;

public class CarteCredit {
    private String numeroCarte;
    private YearMonth dateExpiration;
    private double solde;

    public CarteCredit(String numeroCarte, YearMonth dateExpiration, int solde) {
        this.numeroCarte = numeroCarte;
        this.dateExpiration = dateExpiration;
        this.solde = solde;
    }

    public String getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(String numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    public YearMonth getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(YearMonth dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
