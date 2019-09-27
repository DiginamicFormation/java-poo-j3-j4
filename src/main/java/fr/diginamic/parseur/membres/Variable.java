package fr.diginamic.parseur.membres;

/** Représente la partie variable dans une expression du type x+3.2.
 * Ici en l'occurrence ce serait x
 * @author DIGINAMIC
 *
 */
public class Variable extends Membre {

	/** nom : String*/
	private String nom;

	/** Constructeur
	 * @param nom nom de la variable, par exemple x
	 */
	public Variable(String nom) {
		super();
		this.nom = nom;
	}
	
	@Override
	public double evaluer(String variable, double valeur) {
		
		if (variable!=null && variable.equals(nom)){
			return valeur;
		}
		throw new RuntimeException("Le nom de la variable "+variable+" est inconnue.");
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
