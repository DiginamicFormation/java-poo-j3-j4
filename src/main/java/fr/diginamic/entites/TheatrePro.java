package fr.diginamic.entites;

import java.util.Arrays;

public class TheatrePro {
	
	private String nom;
	private Spectacle[] spectacles;
	
	/** Constructeur
	 * @param nom
	 */
	public TheatrePro(String nom) {
		this.nom = nom;
		spectacles = new Spectacle[0];
	}

	public void ajouterSpectacle(Spectacle spec) {
		
		// On agrandit le tableau d'une case à chaque nouvel ajout
		spectacles = Arrays.copyOf(spectacles, spectacles.length+1);
		
		// On met le nouveau spectacle dans la dernière case
		spectacles[spectacles.length-1]=spec;
	}
	
	/** Retourne le spectacle dont le nom est passé en paramètre. Retourne null si aucun spectacle ne correspond.
	 * @param nomSpectacle nom du spectacle recherché
	 * @return {@link Spectacle}
	 */
	public Spectacle getSpectacle(String nomSpectacle) {
		for (Spectacle spec: spectacles) {
			if (spec.getNom().equals(nomSpectacle)) {
				return spec;
			}
		}
		return null;
	}
	
	/** Inscrit des nouveaux clients à un spectacle donné
	 * @param nombreNouveauxClients nombre de nouveaux clients
	 * @param nomSpectacle nom du spectacle
	 */
	public void inscrire(int nombreNouveauxClients, String nomSpectacle) {
		Spectacle spec = getSpectacle(nomSpectacle);
		if (spec!=null) {
			spec.inscrire(nombreNouveauxClients);
		}
		else {
			System.err.println("Le spectacle "+nomSpectacle+" n'existe pas.");
		}
	}
	
	/** Retourne le nombre de clients total, tous spectacles confondus
	 * @return int
	 */
	public int getNbTotalClients() {
		int nbClients = 0;
		for (Spectacle spec: spectacles) {
			nbClients+=spec.getNombreClientsInscrits();
		}
		return nbClients;
	}

	/** Retourne la recette totale du théâtre en €
	 * @return double
	 */
	public double getRecetteTotale() {
		double recetteTotale = 0.0;
		for (Spectacle spec: spectacles) {
			recetteTotale+=spec.getNombreClientsInscrits()*spec.getTarifUnitaire();
		}
		return recetteTotale;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Getter
	 * @return the spectacles
	 */
	public Spectacle[] getSpectacles() {
		return spectacles;
	}
}
