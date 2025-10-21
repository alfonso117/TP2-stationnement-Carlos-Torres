package stationnement;

import stationnement.banque.CarteCredit;
import stationnement.paiement.PaiementCarte;

public class Borne {
    private Transaction transactionCourante;
    private double montantTotal;
    private final int MAX_TEMPS_STATIONNEMENT = 2;
    private boolean placeValide;

    public Borne() {
        transactionCourante = null;
    }

    public int getMAX_TEMPS_STATIONNEMENT() {
        return MAX_TEMPS_STATIONNEMENT;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }

    public boolean verifierCode(String code){
        return code.matches("(G|SQ)\\d{3}");
    }

    public void paiement(PaiementCarte paiement, CarteCredit carte){
        boolean soldeValide = paiement.verifierSolde(carte);

        if (soldeValide){

        }
    }
}
