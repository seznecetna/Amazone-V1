package fr.demos.icommerce.amazon;

public class PanierException extends Exception{

	//private Livre livreErreur;
	
	public PanierException(String messageErreur) {
		super(messageErreur);
	}
//	
//	public PanierException(String messageErreur, Livre L) {
//		super(messageErreur);
//		this.livreErreur = L;
//	}
//	
//	public Livre getlivreErreur() {
//		return livreErreur;
//	}
	
}
