package application;

import java.util.Date;

public class Vente {

	private String nom;
	private Date dateDebut;
	private Date dateFin;
	private String descriptif_detaille;
	private Produit listeProduit[];
	private ClientPrivilegie listeClient[];
	
	public Vente(String nom, Date dateDebut, Date dateFin, String descriptif_detaille, Produit...listeProduit) {
		super();
		this.nom = nom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.descriptif_detaille = descriptif_detaille;
		this.listeProduit = listeProduit;
	}
	
}
