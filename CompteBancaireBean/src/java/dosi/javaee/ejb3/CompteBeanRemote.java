package dosi.javaee.ejb3;

//~--- JDK imports ------------------------------------------------------------

import javax.ejb.Remote;
import javax.ejb.Remove;

/**
 *
 * @author Mounir Lallali
 */
@Remote
public interface CompteBeanRemote {
    public float deposerArgent(float somme);

    public float retirerArgent(float somme);

    public float soldeCompte();

    @Remove
    public void supprimerCompte();

    public String creerCompte(String prenom, String nom);
    
}
