package gestionBib.entites;

public class Bibliotheque {

	private Ouvrage[] fond; // pas de valeur par défaut
	private int nbMaxOuvrages;
	private int nbOuvrages = 0;

	public Bibliotheque(int nbMaxOuvrages) {
		this.nbMaxOuvrages = nbMaxOuvrages;
		this.fond = new Ouvrage[nbMaxOuvrages];
	}

}
