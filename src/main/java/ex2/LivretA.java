package ex2;

/**
 * Représente un compte bancaire de type Livret A, avec un taux de rémunération.
 */
public class LivretA extends CompteBancaire {
	private double tauxRemuneration;

	/**
	 * Constructeur pour initialiser un Livret A avec un solde initial et un taux de rémunération.
	 *
	 * @param soldeInitial le solde initial du compte
	 * @param tauxRemuneration le taux de rémunération du livret A
	 */
	public LivretA(double soldeInitial, double tauxRemuneration) {
		super(soldeInitial, 0); // Pas de découvert autorisé pour Livret A
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Débite un montant du solde du Livret A.
	 *
	 * @param montant le montant à débiter
	 * @return true si le débit a été effectué, false sinon
	 */
	@Override
	public boolean debiterMontant(double montant) {
		if (this.solde >= montant) {
			this.solde -= montant;
			return true;
		}
		return false;
	}

	/**
	 * Applique la rémunération annuelle au solde du Livret A.
	 */
	public void appliquerRemuAnnuelle() {
		this.solde += this.solde * tauxRemuneration / 100;
	}

	/**
	 * Getter pour le taux de rémunération.
	 *
	 * @return le taux de rémunération du Livret A
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter pour le taux de rémunération.
	 *
	 * @param tauxRemuneration le taux de rémunération à définir
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
