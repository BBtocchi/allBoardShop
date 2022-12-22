package application;

public class Produit {
	private String nom;
	private int prixBase;
	private int prixVente;
	private String photo;
	private String description;
	
	public Produit(String nom, int prixBase, int prixVente, String photo, String description) {
		super();
		this.nom = nom;
		this.prixBase = prixBase;
		this.prixVente = prixVente;
		this.photo = photo;
		this.description = description;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPrixBase() {
		return prixBase;
	}

	public void setPrixBase(int prixBase) {
		this.prixBase = prixBase;
	}

	public int getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(int prixVente) {
		this.prixVente = prixVente;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
