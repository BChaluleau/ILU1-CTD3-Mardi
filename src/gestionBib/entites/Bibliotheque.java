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

	public Ouvrage ajouteOuvrage(String titre, String auteurs, String editeur, int annee, String isbn) {
		if (nbOuvrages >= nbMaxOuvrages) {
			System.out.println("Bibli pleine");
			return null;
		}

		Ouvrage ouvrage = new Ouvrage(titre, auteurs, editeur, annee, isbn);
		fond[nbOuvrages] = ouvrage;
		nbOuvrages++;
		return ouvrage;
	}

	@Override
	public String toString() {
		String tos = "Bibliotheque [nbMaxOuvrages=" + nbMaxOuvrages + ", nbOuvrages=" + nbOuvrages + "]";
		for (Ouvrage ouvrage : fond) {
			if (ouvrage != null) {
				tos = tos + "\n\t" + ouvrage.toString();
			}
		}

		return tos;
	}

}
