package fr.diginamic.parseur.membres;

/** Représente un membre (droite ou gauche) dans une expression, par exemple x ou 3.2 dans l'expression x+3.2
 * @author DIGINAMIC
 *
 */
public abstract class Membre {

	/** Méthode qui évalue le membre
	 * @param variable nom de la variable
	 * @param valeur valeur de la variable
	 * @return double
	 */
	public abstract double evaluer(String variable, double valeur);
}
