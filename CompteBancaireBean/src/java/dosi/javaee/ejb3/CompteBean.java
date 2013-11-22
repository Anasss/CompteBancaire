package dosi.javaee.ejb3;

//~--- JDK imports ------------------------------------------------------------

import javax.ejb.Remove;
import javax.ejb.Stateful;

/**
 *
 * @author Mounir Lallali
 */
@Stateful
public class CompteBean implements CompteBeanRemote {
    private final CompteBancaire cb = new CompteBancaire();
    private String               numCompte;

    @Override

    // Override pour indiquer que cette méthode surcharge une méthode parente
    public float deposerArgent(float somme) {
        float solde = this.cb.getSolde() + somme;
        this.cb.setSolde(solde);
        return solde;
    }

    @Override
    public float retirerArgent(float somme) {
        float solde = this.cb.getSolde() - somme;
        this.cb.setSolde(solde);
        return solde;
    }

    @Override
    public float soldeCompte() {
        return this.cb.getSolde();
    }

    @Override
    public String creerCompte(String prenom, String nom) {
        this.numCompte = this.cb.CompteBancaire(nom, prenom);
        return this.numCompte;
    }

    @Remove
    @Override
    public void supprimerCompte() {
        this.cb.setSolde(0);
    }
}
