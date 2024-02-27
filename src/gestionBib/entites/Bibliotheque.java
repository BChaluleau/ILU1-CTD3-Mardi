package gestionBib.entites;

public class Bibliotheque {

	private Ouvrage[] fond; // pas de valeur par défaut
	private int nbMaxOuvrages;
	private int nbOuvrages = 0;

	public Bibliotheque(int nbMaxOuvrages) {
		this.nbMaxOuvrages = nbMaxOuvrages;
		this.fond = new Ouvrage[nbMaxOuvrages];
	}

	public Ouvrage[] getFond() {
		return fond;
	}

	public int getNbMaxOuvrages() {
		return nbMaxOuvrages;
	}

	public int getNbOuvrages() {
		return nbOuvrages;
	}

}
