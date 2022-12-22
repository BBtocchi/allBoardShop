package application;

public class ClientPrivilegie {
	private String nom;
	private String prenom;
	private String adresse_postale;
	private int num_tel;
	private Activite[] activite;
	
	public ClientPrivilegie(String nom, String prenom, String adresse_postale, int num_tel, Activite...activites ) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse_postale = adresse_postale;
		this.num_tel = num_tel;
		this.activite = activites;
	}
	//getter
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getAdresse_postale() {
		return adresse_postale;
	}

	public int getNum_tel() {
		return num_tel;
	}

	public Activite[] getActivite() {
		return activite;
	}
	
	
}
