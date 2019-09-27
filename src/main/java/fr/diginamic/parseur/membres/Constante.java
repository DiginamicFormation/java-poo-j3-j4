package fr.diginamic.parseur.membres;


/** Représente la partie constante dans une expression du type x+3.2.
 * Ici en l'occurrence ce serait 3.2
 * @author DIGINAMIC
 *
 */
public class Constante extends Membre {

	/** valeur : double*/
	private double valeur;

	/** Constructeur
	 * @param valeur valeur de la constante
	 */
	public Constante(double valeur) {
		super();
		this.valeur = valeur;
	}
	
	@Override
	public double evaluer(String variable, double valeur) {
		return this.valeur;
	}


	/** Getter
	 * @return the valeur
	 */
	public double getValeur() {
		return valeur;
	}

	/** Setter
	 * @param valeur the valeur to set
	 */
	public void setValeur(double valeur) {
		this.valeur = valeur;
	}
	
}
