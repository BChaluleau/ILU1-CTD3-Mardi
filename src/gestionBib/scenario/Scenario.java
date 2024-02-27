package gestionBib.scenario;

import gestionBib.entites.Bibliotheque;
import gestionBib.entites.Exemplaire;
import gestionBib.entites.Ouvrage;

public class Scenario {

	public static void main(String[] args) {
		System.out.println("debut...");
		Bibliotheque bibli = new Bibliotheque(10);
		Ouvrage ouvrage1 = new Ouvrage("Titre", "Auteurs", "Editeur", 2024, "ISBN");
		Ouvrage ouvrage2 = new Ouvrage("Un Autre Titre", "Auteurs", "Editeur", 2024, "Autre_ISBN");

		Exemplaire exemplaire = new Exemplaire("COTE_1");

		bibli.ajouteOuvrage(ouvrage1);
		bibli.ajouteOuvrage(ouvrage2);
		ouvrage2.ajouteExemplaire(new Exemplaire("COTE_4"));
		ouvrage1.ajouteExemplaire(exemplaire);
		ouvrage1.ajouteExemplaire(new Exemplaire("COTE_2"));
		ouvrage1.ajouteExemplaire(new Exemplaire("COTE_3"));

		System.out.println(bibli);

		System.out.println("...fin");

	}

}
