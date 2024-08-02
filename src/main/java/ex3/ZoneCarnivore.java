package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une zone carnivore contenant différents types de carnivores.
 */
public class ZoneCarnivore {

    private List<String> types;          // Types d'animaux dans la zone
    private List<String> noms;           // Noms des animaux dans la zone
    private List<String> comportements;  // Comportements des animaux dans la zone

    /**
     * Constructeur pour initialiser les listes d'animaux.
     */
    public ZoneCarnivore() {
        this.types = new ArrayList<>();
        this.noms = new ArrayList<>();
        this.comportements = new ArrayList<>();
    }

    /**
     * Ajoute un animal à la zone carnivore.
     *
     * @param typeAnimal     le type de l'animal (par exemple, MAMMIFERE)
     * @param nomAnimal      le nom de l'animal
     * @param comportement   le comportement de l'animal (par exemple, CARNIVORE)
     */
    public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
        types.add(typeAnimal);
        noms.add(nomAnimal);
        comportements.add(comportement);
    }

    /**
     * Affiche la liste des noms d'animaux dans la zone carnivore.
     */
    public void afficherListeAnimaux() {
        for (String nom : noms) {
            System.out.println(nom);
        }
    }

    /**
     * Calcule la quantité totale de nourriture (en kg) nécessaire par jour pour les animaux de la zone.
     *
     * @return la quantité totale de nourriture par jour
     */
    public double calculerKgsNourritureParJour() {
        return noms.size() * 10;
    }
}
