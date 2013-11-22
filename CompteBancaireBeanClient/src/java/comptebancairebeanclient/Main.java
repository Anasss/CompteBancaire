package comptebancairebeanclient;

//~--- non-JDK imports --------------------------------------------------------

import dosi.javaee.ejb3.CompteBeanRemote;

//~--- JDK imports ------------------------------------------------------------

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Mounir Lallali
 */
public class Main {
    public static void main(String[] args) {
        try {
            Context          context = new InitialContext();
            CompteBeanRemote compte  = (CompteBeanRemote) context.lookup("dosi.javaee.ejb3.CompteBeanRemote");
            
            String           num     = compte.creerCompte("Mounir", "Lallali");
            System.out.println("création du compte numéro : " + num);
            
            System.out.println("déposer 100 euros : " + compte.deposerArgent(100));
            System.out.println("retirer 30 euros : " + compte.retirerArgent(30));
            System.out.println("solde du compte : " + compte.soldeCompte());
            System.out.println("supprimer le compte ");
            compte.supprimerCompte();
        } catch (NamingException e) {
            System.out.println(e);
        }
    }
}
