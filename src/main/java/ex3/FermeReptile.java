package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une ferme de reptiles contenant différents types de reptiles.
 */
public class FermeReptile {

	private List<String> types;          // Types d'animaux dans la ferme
	private List<String> noms;           // Noms des animaux dans la ferme
	private List<String> comportements;  // Comportements des animaux dans la ferme

	/**
	 * Constructeur pour initialiser les listes d'animaux.
	 */
	public FermeReptile() {
		this.types = new ArrayList<>();
		this.noms = new ArrayList<>();
		this.comportements = new ArrayList<>();
	}

	/**
	 * Ajoute un animal à la ferme de reptiles.
	 *
	 * @param typeAnimal     le type de l'animal (par exemple, REPTILE)
	 * @param nomAnimal      le nom de l'animal
	 * @param comportement   le comportement de l'animal (par exemple, CARNIVORE)
	 */
	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}

	/**
	 * Affiche la liste des noms d'animaux dans la ferme de reptiles.
	 */
	public void afficherListeAnimaux() {
		for (String nom : noms) {
			System.out.println(nom);
		}
	}

	/**
	 * Compte le nombre d'animaux dans la ferme de reptiles.
	 *
	 * @return le nombre d'animaux
	 */
	public int compterAnimaux() {
		return noms.size();
	}

	/**
	 * Calcule la quantité totale de nourriture (en kg) nécessaire par jour pour les animaux de la ferme.
	 *
	 * @return la quantité totale de nourriture par jour
	 */
	public double calculerKgsNourritureParJour() {
		return noms.size() * 0.1;
	}
}
