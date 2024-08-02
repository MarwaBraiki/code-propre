package ex1;

import java.util.Date;

/**
 * Représente une entreprise avec des informations de base telles que le SIRET, le nom, l'adresse et la date de création.
 */
public class Entreprise {

	/**
	 * Numéro SIRET de l'entreprise.
	 */
	public int siret;

	/**
	 * Nom de l'entreprise.
	 */
	public String nom;

	/**
	 * Adresse de l'entreprise.
	 */
	public String adresse;

	/**
	 * Date de création de l'entreprise.
	 */
	public Date dateCreation;

	/**
	 * Capital maximum autorisé pour l'entreprise.
	 */
	public static final int CAPITAL_MAX = 3000000;

	/**
	 * Affiche le statut de l'entreprise, y compris le numéro SIRET, le nom, l'adresse et la date de création.
	 */
	public void afficherStatut() {
		System.out.println("Statut de l'entreprise :");
		System.out.println("SIRET : " + siret);
		System.out.println("Nom : " + nom);
		System.out.println("Adresse : " + adresse);
		System.out.println("Date de création : " + dateCreation);
	}
}
