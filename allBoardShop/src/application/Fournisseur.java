package application;

public class Fournisseur {

	private String nom;
	private String adresse_postale;
	private String mail;
	private int num;
	private TypeMateriel typeMateriel;
	
	public Fournisseur(String nom, String adresse_postale, String mail, int num, TypeMateriel typemat) {
		super();
		this.nom = nom;
		this.adresse_postale = adresse_postale;
		this.mail = mail;
		this.num = num;
		this.typeMateriel = typemat;
	}
	
}
