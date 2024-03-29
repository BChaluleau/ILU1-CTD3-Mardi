package gestionBib.entites;

public class Ouvrage {

	private String titre;
	private String auteurs;
	private String editeur;
	private int annee;
	private String isbn;
	private GenreLitteraire genre;

	private Exemplaire[] exemplaires = new Exemplaire[50];
	private int nbExemplaires = 0;

	public Ouvrage(GenreLitteraire genre, String titre, String auteurs, String editeur, int annee, String isbn) {
		this.titre = titre;
		this.auteurs = auteurs;
		this.editeur = editeur;
		this.annee = annee;
		this.isbn = isbn;
		this.genre = genre;
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

	public Exemplaire ajouteExemplaire(String cote) {
		if (nbExemplaires >= 50) {
			System.out.println("trop d'exemplaires");
			return null;
		}

		Exemplaire exemplaire = new Exemplaire(cote);
		exemplaires[nbExemplaires] = exemplaire;
		nbExemplaires++;
		return exemplaire;
	}

	@Override
	public String toString() {
		String tos = "Ouvrage [genre=" + genre + " titre=" + titre + ", auteurs=" + auteurs + ", editeur=" + editeur
				+ ", annee=" + annee + ", isbn=" + isbn + ", nbExemplaires=" + nbExemplaires + "]";
		for (Exemplaire exemplaire : exemplaires) {
			if (exemplaire != null) {
				tos = tos + "\t" + exemplaire.getCote();
			}

		}

		return tos;
	}

}
