package gestionBib.scenario;

import gestionBib.entites.Bibliotheque;
import gestionBib.entites.Exemplaire;
import gestionBib.entites.Ouvrage;

public class Scenario {

	public static void main(String[] args) {
		System.out.println("debut...");
		Bibliotheque bibli = new Bibliotheque(10);
		Ouvrage ouvrage1 = new Ouvrage("Titre", "Auteurs", "Editeur", 2024, "ISBN");
		Exemplaire exemplaire = new Exemplaire("COTE");
		System.out.println("...fin");

	}

}
