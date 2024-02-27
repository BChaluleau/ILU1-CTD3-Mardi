package gestionBib.entites;

public class Exemplaire {

	private boolean disponibleEmprunt = true;
	private boolean consultableEnLigne = true;
	private String cote;

	public Exemplaire(String cote) {
		this.cote = cote;
	}

	public boolean isDisponibleEmprunt() {
		return disponibleEmprunt;
	}

	public void setDisponibleEmprunt(boolean disponibleEmprunt) {
		this.disponibleEmprunt = disponibleEmprunt;
	}

	public boolean isConsultableEnLigne() {
		return consultableEnLigne;
	}

	public void setConsultableEnLigne(boolean consultableEnLigne) {
		this.consultableEnLigne = consultableEnLigne;
	}

	public String getCote() {
		return cote;
	}

}
