package gestionBib.entites;

public enum GenreLitteraire {
	R("roman"), RP("roman policier"), SF("science fiction"), T("théatre");

	private String nom;

	private GenreLitteraire(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return nom;
	}

}
