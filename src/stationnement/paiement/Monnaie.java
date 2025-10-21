package stationnement.paiement;

public enum Monnaie {
    QUART(0.25),
    DOLLAR(1.00),
    DEUX_DOLLARS(2.00);

    private double valeur;

    Monnaie(double valeur) {
        this.valeur = valeur;
    }

    public double getValeur() {
        return valeur;
    }
}
