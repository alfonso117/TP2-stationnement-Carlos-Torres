package stationnement.paiement;

import java.time.YearMonth;
import stationnement.banque.CarteCredit;

public class PaiementCarte {

    public boolean verifierDateExpiration(CarteCredit carte){
        YearMonth dateCarte = carte.getDateExpiration();
        YearMonth present = YearMonth.now();
        return !dateCarte.isBefore(present);
    }

    public boolean verifierNumeroCarte(CarteCredit carte){
        String numeroCarte = carte.getNumeroCarte();
        return numeroCarte.matches("([0-9]{16})");
    }

    public boolean verifierSolde(CarteCredit carte){
        double solde = carte.getSolde();
        boolean soldeValide = false;

        if (solde <= 0){
            System.out.println("Solde insuffisant");
        } else {
            soldeValide = true;
        }
        return soldeValide;
    }
}
