package ex2;

/**
 * Représente un compte courant avec un découvert autorisé.
 */
public class CompteCourant extends CompteBancaire {

    /**
     * Constructeur pour initialiser un Compte Courant avec un solde initial et un découvert autorisé.
     *
     * @param soldeInitial le solde initial du compte
     * @param decouvertAutorise le montant du découvert autorisé
     */
    public CompteCourant(double soldeInitial, double decouvertAutorise) {
        super(soldeInitial, decouvertAutorise);
    }

    /**
     * Débite un montant du solde du Compte Courant.
     *
     * @param montant le montant à débiter
     * @return true si le débit a été effectué, false sinon
     */
    @Override
    public boolean debiterMontant(double montant) {
        if (this.solde + this.decouvert >= montant) {
            this.solde -= montant;
            return true;
        }
        return false;
    }
}
