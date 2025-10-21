package stationnement;

public class Transaction {
    private boolean transactionCourante;
    private String codeStationnement;
    private int heureDebut;
    private int heureFin;
    private double montantTotal;

    public boolean isTransactionCourante() {
        return transactionCourante;
    }

    public void setTransactionCourante(boolean transactionCourante) {
        this.transactionCourante = transactionCourante;
    }
}
