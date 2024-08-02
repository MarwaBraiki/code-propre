package ex2;

/**
 * Classe de test pour vérifier le fonctionnement des classes CompteBancaire et LivretA.
 */
public class TestComptes {
    public static void main(String[] args) {
        // Test Compte Courant
        CompteBancaire compteCourant = new CompteCourant(1000, 500);
        System.out.println("Solde Compte Courant: " + compteCourant.getSolde());
        boolean debitReussi = compteCourant.debiterMontant(1500); // Débit réussi avec découvert
        System.out.println("Débit Compte Courant Réussi : " + debitReussi);
        System.out.println("Solde Compte Courant après débit: " + compteCourant.getSolde());

        // Test Livret A
        LivretA livretA = new LivretA(5000, 1.5);
        System.out.println("Solde Livret A: " + livretA.getSolde());
        boolean debitReussiLivret = livretA.debiterMontant(1000); // Débit échoué, découvert interdit
        System.out.println("Débit Livret A Réussi : " + debitReussiLivret);
        livretA.appliquerRemuAnnuelle();
        System.out.println("Solde Livret A après rémunération: " + livretA.getSolde());
    }
}
