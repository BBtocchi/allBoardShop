package application;

import java.util.Date;
import java.util.Scanner;

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
	//getter
	public String getNom() {
		return nom;
	}

	public String getAdresse_postale() {
		return adresse_postale;
	}

	public String getMail() {
		return mail;
	}

	public int getNum() {
		return num;
	}

	public TypeMateriel getTypeMateriel() {
		return typeMateriel;
	}

	//methodes 
	public void proposerVente() {
		System.out.println("entrez un titre pour votre vente:");
		Scanner sc = new Scanner(System.in);
		String titre = sc.nextLine();
		if(titre == "") {
			sc.close();
			return;
		}
		
		System.out.println("entrez une description pour votre vente:");
		String description = sc.nextLine();
		if(description == "") {
			sc.close();
			return;
		}
		
		System.out.println("entrez la date de début pour votre vente (dd/mm/yy):");
		Date date = new Date();
		String dateDebut = sc.nextLine();

		System.out.println("entrez la date de fin pour votre vente (dd/mm/yy):");
		String dateFin = sc.nextLine();
		if(dateFin == "") {
			sc.close();
			return;
		}
		sc.close();
		
		Vente vente = new Vente(titre, dateDebut, dateFin,description,[]);
		
		//ajouter produit
	}
	
}
