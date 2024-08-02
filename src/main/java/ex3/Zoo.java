package ex3;

/**
 * Représente un zoo contenant plusieurs zones avec différents types d'animaux.
 */
public class Zoo {

	private String nom;                  // Nom du zoo
	private SavaneAfricaine savaneAfricaine;  // Zone savane africaine
	private ZoneCarnivore zoneCarnivore;     // Zone carnivore
	private FermeReptile fermeReptile;       // Ferme des reptiles
	private Aquarium aquarium;               // Aquarium

	/**
	 * Constructeur pour initialiser le zoo avec un nom et créer les différentes zones.
	 *
	 * @param nom le nom du zoo
	 */
	public Zoo(String nom) {
		this.nom = nom;
		this.savaneAfricaine = new SavaneAfricaine();
		this.zoneCarnivore = new ZoneCarnivore();
		this.fermeReptile = new FermeReptile();
		this.aquarium = new Aquarium();
	}

	/**
	 * Ajoute un animal à la zone appropriée en fonction de son type et de son comportement.
	 *
	 * @param nomAnimal      le nom de l'animal
	 * @param typeAnimal     le type de l'animal (par exemple, MAMMIFERE, REPTILE, POISSON)
	 * @param comportement   le comportement de l'animal (par exemple, CARNIVORE, HERBIVORE)
	 */
	public void addAnimal(String nomAnimal, TypeAnimal typeAnimal, Comportement comportement) {
		// Vérifiez que les zones ne sont pas null
		if (savaneAfricaine == null || zoneCarnivore == null || fermeReptile == null || aquarium == null) {
			throw new IllegalStateException("Une ou plusieurs zones ne sont pas initialisées.");
		}

		// Ajoute l'animal à la zone appropriée en fonction du type et du comportement
		switch (typeAnimal) {
			case MAMMIFERE:
				if (comportement == Comportement.CARNIVORE) {
					zoneCarnivore.addAnimal(typeAnimal.name(), nomAnimal, comportement.name());
				} else if (comportement == Comportement.HERBIVORE) {
					savaneAfricaine.addAnimal(typeAnimal.name(), nomAnimal, comportement.name());
				}
				break;
			case REPTILE:
				fermeReptile.addAnimal(typeAnimal.name(), nomAnimal, comportement.name());
				break;
			case POISSON:
				aquarium.addAnimal(typeAnimal.name(), nomAnimal, comportement.name());
				break;
			default:
				throw new IllegalArgumentException("Type d'animal non reconnu : " + typeAnimal);
		}
	}

	/**
	 * Affiche la liste des animaux présents dans toutes les zones du zoo.
	 */
	public void afficherListeAnimaux() {
		if (savaneAfricaine != null) {
			savaneAfricaine.afficherListeAnimaux();
		}
		if (zoneCarnivore != null) {
			zoneCarnivore.afficherListeAnimaux();
		}
		if (fermeReptile != null) {
			fermeReptile.afficherListeAnimaux();
		}
		if (aquarium != null) {
			aquarium.afficherListeAnimaux();
		}
	}

	/**
	 * Getter pour le nom du zoo.
	 *
	 * @return le nom du zoo
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour le nom du zoo.
	 *
	 * @param nom le nom du zoo à définir
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
