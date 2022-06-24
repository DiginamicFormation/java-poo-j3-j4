package fr.diginamic.entites;

/** Représente un spectacle
 * @author DIGINAMIC
 *
 */
public class Spectacle {

	/** nom */
	private String nom;
	
	/** type */
	private String type;
	
	/** Prix de la place */
	private double tarifUnitaire;
	
	/** Capacité max du spectacle */
	private int capaciteMax;
	
	/** Nombre de clients inscrits */
	private int nombreClientsInscrits;
	
	/** Constructeur
	 * @param nom nom
	 * @param type type
	 * @param tarifUnitaire Prix de la place
	 * @param capaciteMax Capacité max du spectacle
	 */
	public Spectacle(String nom, String type, double tarifUnitaire, int capaciteMax) {
		super();
		this.nom = nom;
		this.type = type;
		this.tarifUnitaire = tarifUnitaire;
		this.capaciteMax = capaciteMax;
	}
	
	/** Inscription d'un certain nombre de clients au spectacle.
	 * L'inscription n'a lieu que s'il reste suffisamment de places pour l'ensemble des clients
	 * sinon affiche un message d'erreur.
	 * @param nbNouveauxClients nombre de nouveaux clients à inscrire
	 */
	public void inscrire(int nbNouveauxClients) {
		if (nombreClientsInscrits + nbNouveauxClients <= capaciteMax) {
			nombreClientsInscrits+=nbNouveauxClients;
		}
		else {
			System.err.println("Il n'y a pas assez de places restantes pour le spectacle "+nom+". Il ne reste que "+(capaciteMax-nombreClientsInscrits)+" places.");
		}
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/** Setter
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/** Getter
	 * @return the tarifUnitaire
	 */
	public double getTarifUnitaire() {
		return tarifUnitaire;
	}

	/** Setter
	 * @param tarifUnitaire the tarifUnitaire to set
	 */
	public void setTarifUnitaire(double tarifUnitaire) {
		this.tarifUnitaire = tarifUnitaire;
	}

	/** Getter
	 * @return the capaciteMax
	 */
	public int getCapaciteMax() {
		return capaciteMax;
	}

	/** Setter
	 * @param capaciteMax the capaciteMax to set
	 */
	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	/** Getter
	 * @return the nombreClientsInscrits
	 */
	public int getNombreClientsInscrits() {
		return nombreClientsInscrits;
	}

	/** Setter
	 * @param nombreClientsInscrits the nombreClientsInscrits to set
	 */
	public void setNombreClientsInscrits(int nombreClientsInscrits) {
		this.nombreClientsInscrits = nombreClientsInscrits;
	}
}
