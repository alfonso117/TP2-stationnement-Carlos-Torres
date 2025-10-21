package stationnement;

public class Place {
    private StatutPlace statut;

    public Place(StatutPlace statut) {
        this.statut = statut;
    }

    public StatutPlace getStatut() {
        return statut;
    }

    public void setStatut(StatutPlace statut) {
        this.statut = statut;
    }
}
