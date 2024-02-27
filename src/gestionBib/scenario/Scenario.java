package gestionBib.scenario;

import gestionBib.entites.Bibliotheque;
import gestionBib.entites.Ouvrage;

public class Scenario {

	public static void main(String[] args) {
		System.out.println("debut...");
		Bibliotheque bibli = new Bibliotheque(10);

		Ouvrage ouvrage1 = bibli.ajouteOuvrage("Titre", "Auteurs", "Editeur", 2024, "ISBN");

		bibli.ajouteOuvrage("Un Autre Titre", "Auteurs", "Editeur", 2024, "Autre_ISBN");
		ouvrage1.ajouteExemplaire("COTE_1");
		ouvrage1.ajouteExemplaire("COTE_2");
		ouvrage1.ajouteExemplaire("COTE_3");

		System.out.println(bibli);

		System.out.println("...fin");

	}

}
