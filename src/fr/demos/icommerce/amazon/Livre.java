package fr.demos.icommerce.amazon;

public class Livre extends Article {
	
	private String titre;
	private String auteur;
	private String editeur;
	private String genre;
	
	public Livre(double prixHt, int stock, String designation, String reference, String titre, String auteur, String editeur, String genre) {
		super(prixHt, stock, designation, reference);
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.genre = genre;
	}

	public String getTitre() {
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public String getEditeur() {
		return editeur;
	}

	public String getGenre() {
		return genre;
	}

	@Override
	public String toString() {
		return "Livre [Titre = " + getTitre() + ", Auteur = " + getAuteur() + ", Editeur = " + getEditeur()
				+ ", Genre = " + getGenre() + ", PrixHt = " + getPrixHt() + ", Stock = " + getStock()
				+ ", Designation = " + getDesignation() + ", Reference = " + getReference() + "]";
	}


		
}
