package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une savane africaine contenant différents types de mammifères.
 */
public class SavaneAfricaine {

	private List<String> types;          // Types d'animaux dans la savane
	private List<String> noms;           // Noms des animaux dans la savane
	private List<String> comportements;  // Comportements des animaux dans la savane

	/**
	 * Constructeur pour initialiser les listes d'animaux.
	 */
	public SavaneAfricaine() {
		this.types = new ArrayList<>();
		this.noms = new ArrayList<>();
		this.comportements = new ArrayList<>();
	}

	/**
	 * Ajoute un animal à la savane africaine.
	 *
	 * @param typeAnimal     le type de l'animal (par exemple, MAMMIFERE)
	 * @param nomAnimal      le nom de l'animal
	 * @param comportement   le comportement de l'animal (par exemple, HERBIVORE)
	 */
	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}

	/**
	 * Affiche la liste des noms d'animaux dans la savane africaine.
	 */
	public void afficherListeAnimaux() {
		for (String nom : noms) {
			System.out.println(nom);
		}
	}

	/**
	 * Compte le nombre d'animaux dans la savane africaine.
	 *
	 * @return le nombre d'animaux
	 */
	public int compterAnimaux() {
		return noms.size();
	}

	/**
	 * Calcule la quantité totale de nourriture (en kg) nécessaire par jour pour les animaux de la savane.
	 *
	 * @return la quantité totale de nourriture par jour
	 */
	public int calculerKgsNourritureParJour() {
		return noms.size() * 10;
	}
}
