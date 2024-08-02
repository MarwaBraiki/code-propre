package ex2;

/**
 * Représente un compte bancaire avec un solde et la possibilité de débiter et créditer le compte.
 */
public abstract class CompteBancaire {
	protected double solde;
	protected double decouvert;

	/**
	 * Constructeur pour initialiser un compte bancaire avec un solde initial et un découvert autorisé.
	 *
	 * @param soldeInitial le solde initial du compte
	 * @param decouvertAutorise le montant du découvert autorisé
	 */
	public CompteBancaire(double soldeInitial, double decouvertAutorise) {
		this.solde = soldeInitial;
		this.decouvert = decouvertAutorise;
	}

	/**
	 * Ajoute un montant au solde du compte.
	 *
	 * @param montant le montant à ajouter
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Débite un montant du solde du compte.
	 *
	 * @param montant le montant à débiter
	 * @return true si le débit a été effectué, false sinon
	 */
	public abstract boolean debiterMontant(double montant);

	/**
	 * Getter pour le solde.
	 *
	 * @return le solde du compte
	 */
	public double getSolde() {
		return solde;
	}
}
