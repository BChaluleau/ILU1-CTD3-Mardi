package gestionBib.entites;

public class Exemplaire {

	private boolean disponibleEmprunt = true;
	private boolean consultableEnLigne = true;
	private String cote;

	public Exemplaire(String cote) {
		this.cote = cote;
	}

}
