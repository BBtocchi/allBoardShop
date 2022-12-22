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
	
	//getter
	public String getNom() {
		return nom;
	}

	public Date getDateDebut() {
		return dateDebut;
	}


	public Date getDateFin() {
		return dateFin;
	}


	public String getDescriptif_detaille() {
		return descriptif_detaille;
	}


	public Produit[] getListeProduit() {
		return listeProduit;
	}


	public ClientPrivilegie[] getListeClient() {
		return listeClient;
	}

}
