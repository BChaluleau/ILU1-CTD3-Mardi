package gestionBib.entites;

public class Ouvrage {

	private String titre;
	private String auteurs;
	private String editeur;
	private int annee;
	private String isbn;

	private Exemplaire[] exemplaires = new Exemplaire[50];
	private int nbExemplaires = 0;

	public Ouvrage(String titre, String auteurs, String editeur, int annee, String isbn) {
		this.titre = titre;
		this.auteurs = auteurs;
		this.editeur = editeur;
		this.annee = annee;
		this.isbn = isbn;
	}

	public String getTitre() {
		return titre;
	}

	public String getAuteurs() {
		return auteurs;
	}

	public String getEditeur() {
		return editeur;
	}

	public int getAnnee() {
		return annee;
	}

	public String getIsbn() {
		return isbn;
	}

	public Exemplaire[] getExemplaires() {
		return exemplaires;
	}

	public int getNbExemplaires() {
		return nbExemplaires;
	}

	public void ajouteExemplaire(Exemplaire exemplaire) {
		if (nbExemplaires >= 50) {
			System.out.println("trop d'exemplaires");
			return;
		}

		exemplaires[nbExemplaires] = exemplaire;
		nbExemplaires++;
	}

	@Override
	public String toString() {
		String tos = "Ouvrage [titre=" + titre + ", auteurs=" + auteurs + ", editeur=" + editeur + ", annee=" + annee
				+ ", isbn=" + isbn + ", nbExemplaires=" + nbExemplaires + "]";
		for (Exemplaire exemplaire : exemplaires) {
			if (exemplaire != null) {
				tos = tos + "\t" + exemplaire.getCote();
			}

		}

		return tos;
	}

}
