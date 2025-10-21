package stationnement.paiement;

public class PaiementMonnaie {

    double somme = 0, piece = 0, LIMITE_DOLLARS = 6;

    public void ajouterPiece(char touche){
        switch (touche){
            case '1': piece = Monnaie.DOLLAR.getValeur(); break;
            case '2': piece = Monnaie.DEUX_DOLLARS.getValeur(); break;
            case 'Q': piece = Monnaie.QUART.getValeur(); break;
            default: break;
        }
    }

    public void sommeMonnaies(){
        somme += piece;
    }

    public double getSomme() {
        return somme;
    }

    public void reinitialiser(){
        piece = 0;
        somme = 0;
    }

    public void atteintMax(){
        if (somme >= LIMITE_DOLLARS) {
            System.out.println("Vous avez atteint le maximum. Nous n'acceptons plus de monnaies");
        }
    }
}
