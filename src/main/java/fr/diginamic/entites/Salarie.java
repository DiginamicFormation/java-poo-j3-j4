package fr.diginamic.entites;

/** Représente un salarié
 * @author DIGINAMIC
 *
 */
public class Salarie {

	/** nom : String*/
	private String nom;
	
	/** prenom : String*/
	private String prenom;
	
	/** comptes : Compte[]*/
	private double salaire;
	
	/** Constructeur
	 * @param nom nom 
	 * @param prenom prénom
	 * @param salaire salaire
	 */
	public Salarie(String nom, String prenom, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}
	
	@Override
	public String toString(){
		return nom.toUpperCase()+" "+prenom+" - Salaire: "+salaire;
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

	/** Getter
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/** Setter
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/** Getter
	 * @return the salaire
	 */
	public double getSalaire() {
		return salaire;
	}

	/** Setter
	 * @param salaire the salaire to set
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

}
