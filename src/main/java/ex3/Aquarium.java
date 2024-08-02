package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un aquarium contenant différents types de poissons.
 */
public class Aquarium {

	private List<String> types;          // Types d'animaux dans l'aquarium
	private List<String> noms;           // Noms des animaux dans l'aquarium
	private List<String> comportements;  // Comportements des animaux dans l'aquarium

	/**
	 * Constructeur pour initialiser les listes d'animaux.
	 */
	public Aquarium() {
		this.types = new ArrayList<>();
		this.noms = new ArrayList<>();
		this.comportements = new ArrayList<>();
	}

	/**
	 * Ajoute un animal à l'aquarium.
	 *
	 * @param typeAnimal     le type de l'animal (par exemple, POISSON)
	 * @param nomAnimal      le nom de l'animal
	 * @param comportement   le comportement de l'animal (par exemple, HERBIVORE)
	 */
	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}

	/**
	 * Affiche la liste des noms d'animaux dans l'aquarium.
	 */
	public void afficherListeAnimaux() {
		for (String nom : noms) {
			System.out.println(nom);
		}
	}

	/**
	 * Calcule la quantité totale de nourriture (en kg) nécessaire par jour pour les animaux de l'aquarium.
	 *
	 * @return la quantité totale de nourriture par jour
	 */
	public double calculerKgsNourritureParJour() {
		return noms.size() * 0.2;
	}
}
