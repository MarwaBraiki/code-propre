package ex1;

import java.util.Date;

public class TestEntreprise {
    public static void main(String[] args) {
        Entreprise entreprise = new Entreprise();
        entreprise.siret = 123456789;
        entreprise.nom = "Tech Solutions";
        entreprise.adresse = "123 Rue de l'Innovation, Paris";
        entreprise.dateCreation = new Date(); // Utilise la date actuelle pour cet exemple

        entreprise.afficherStatut(); // Affiche le statut de l'entreprise
    }
}
