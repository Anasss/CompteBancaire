package dosi.javaee.ejb3;

/**
 *
 * @author Mounir Lallali
 */
public class CompteBancaire {
    private float  solde = 0;
    private String nomProprietaire;
    private String numCompte;
    private String prenomProprietaire;

    String CompteBancaire(String nom, String prenom) {
        this.numCompte          = Long.toString(System.currentTimeMillis());
        this.prenomProprietaire = prenom;
        this.nomProprietaire    = nom;
        this.solde              = 0;

        return numCompte;
    }

    String getNomProprietaire() {
        return this.nomProprietaire;
    }

    void setNomProprietaire(String nom) {
        this.nomProprietaire = nom;
    }

    String getPrenomProprietaire() {
        return this.prenomProprietaire;
    }

    void setPrenomProprietaire(String prenom) {
        this.prenomProprietaire = prenom;
    }

    float getSolde() {
        return this.solde;
    }

    void setSolde(float solde) {
        this.solde = solde;
    }
}
