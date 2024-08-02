package ex3;

/**
 * Classe principale pour lancer l'application du zoo.
 */
public class ZooApplication {

    /**
     * Méthode principale pour exécuter l'application.
     *
     * @param args les arguments de la ligne de commande (non utilisés ici)
     */
    public static void main(String[] args) {
        // Création d'une instance du zoo avec le nom "Thoiry"
        Zoo zoo = new Zoo("Thoiry");

        // Ajout des animaux au zoo
        zoo.addAnimal("Gazelle", TypeAnimal.MAMMIFERE, Comportement.HERBIVORE);
        zoo.addAnimal("Zèbre", TypeAnimal.MAMMIFERE, Comportement.HERBIVORE);
        zoo.addAnimal("Lion", TypeAnimal.MAMMIFERE, Comportement.CARNIVORE);
        zoo.addAnimal("Panthère", TypeAnimal.MAMMIFERE, Comportement.CARNIVORE);
        zoo.addAnimal("Requin blanc", TypeAnimal.POISSON, Comportement.CARNIVORE);
        zoo.addAnimal("Truite dorée", TypeAnimal.POISSON, Comportement.HERBIVORE);
        zoo.addAnimal("Boa constrictor", TypeAnimal.REPTILE, Comportement.CARNIVORE);
        zoo.addAnimal("Python", TypeAnimal.REPTILE, Comportement.CARNIVORE);

        // Affichage de la liste des animaux présents dans le zoo
        zoo.afficherListeAnimaux();
    }
}
