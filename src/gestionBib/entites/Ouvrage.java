package gestionBib.entites;

public class Ouvrage {

	private String titre;
	private String auteurs;
	private String editeur;
	private int annee;
	private String isbn;

	private Ouvrage[] exemplaires = new Ouvrage[50];
	private int nbExemplaires = 0;

	public Ouvrage(String titre, String auteurs, String editeur, int annee, String isbn) {
		this.titre = titre;
		this.auteurs = auteurs;
		this.editeur = editeur;
		this.annee = annee;
		this.isbn = isbn;
	}

}
