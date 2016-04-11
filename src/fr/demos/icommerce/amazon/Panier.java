package fr.demos.icommerce.amazon;

import java.util.ArrayList;

public class Panier {

	private ArrayList<Article> listPanier;

	public Panier() {
		listPanier = new ArrayList<Article>();
	}

	public void ajouterArticle(Article article) throws PanierException {
		if (article.existe()) {
			this.listPanier.add(article);
			article.decremeter();
		} else
			throw new PanierException("Il n'y a plus d'articl en stock");
	}

	public void retirerArticle(Article article) throws PanierException {
		if (!listPanier.isEmpty()) {// pour tester son panier vide il y a la
										// fonction listePanier.isemptu.
			this.listPanier.remove(article);
			article.incrementer();
		} else
			throw new PanierException("Il n'y a rien dans le panier");
	}

	public ArrayList<Article> getListePanier() {
		return listPanier;
	}

	public void setListePanier(ArrayList<Article> listePanier) {
		this.listPanier = listePanier;
	}

	@Override
	public String toString() {
		return "Panier [listePanier=" + listPanier + "]";
	}

}
