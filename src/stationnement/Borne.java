package stationnement;

import stationnement.banque.CarteCredit;
import stationnement.paiement.PaiementCarte;

public class Borne {
    private String codeStationnement;
    private int heureDebutTarif = 6;
    private int heureFinTarif = 22;
    private boolean heurePaye;
    private int MAX_TEMPS_STATIONNEMENT = 2;
    private double montantTotal;

    public Borne(int heureDebutTarif, int heureFinTarif, int MAX_TEMPS_STATIONNEMENT) {
        this.heureDebutTarif = heureDebutTarif;
        this.heureFinTarif = heureFinTarif;
        this.MAX_TEMPS_STATIONNEMENT = MAX_TEMPS_STATIONNEMENT;
    }

    public String getCodeStationnement() {
        return codeStationnement;
    }

    public void setCodeStationnement(String codeStationnement) {
        this.codeStationnement = codeStationnement;
    }

    public int getHeureDebutTarif() {
        return heureDebutTarif;
    }

    public int getHeureFinTarif() {
        return heureFinTarif;
    }

    public boolean isHeurePaye() {
        return heurePaye;
    }

    public void setHeurePaye(boolean heurePaye) {
        this.heurePaye = heurePaye;
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

    public boolean verifierCode(Borne c){
        String code = c.getCodeStationnement();
        return code.matches("(G|SQ)\\d{3}");
    }

    public void paiement(PaiementCarte paiement, CarteCredit carte){
        boolean soldeValide = paiement.verifierSolde(carte);

        if (soldeValide){

        }
    }
}


