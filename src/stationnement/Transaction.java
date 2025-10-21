package stationnement;

public class Transaction {
    private String codeStationnement;
    private int heureDebut;
    private int heureFin;
    private double montantTotal;

    public Transaction(String codeStationnement) {
        this.codeStationnement = codeStationnement;
    }

    public String getCodeStationnement() {
        return codeStationnement;
    }

    public void setCodeStationnement(String codeStationnement) {
        this.codeStationnement = codeStationnement;
    }

    public int getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(int heureDebut) {
        this.heureDebut = heureDebut;
    }

    public int getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(int heureFin) {
        this.heureFin = heureFin;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }
}
