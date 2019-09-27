package fr.diginamic.parseur.operateurs;

import fr.diginamic.parseur.membres.Membre;

/** Classe abstraite représentant un opérateur
 * @author DIGINAMIC
 *
 */
public abstract class Operateur {
	
	/** Retourne le nom de l'opérateur
	 * @return String
	 */
	public abstract String getNom();
	
	/** Evalue une expression avec le nom de la variable, sa valeur, l'expression à gauche de l'opérateur et l'expression à droite
	 * @param nomVariable nom de la variable
	 * @param valeur valeur
	 * @param gauche gauche
	 * @param droit droit
	 * @return double
	 */
	public abstract double evaluer(String nomVariable, Double valeur, Membre gauche, Membre droit);
}
