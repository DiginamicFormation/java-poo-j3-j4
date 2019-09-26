package utils;

import entites.Cercle;

/** Classe de type factory associée à la classe Cercle
 * @author DIGINAMIC
 *
 */
public class CercleFactory {

	/** Retourne une instance de cercle d'un rayon donné en paramètre 
	 * @param pRayon rayon du cercle souhaité
	 * @return Cercle
	 */
	public static Cercle creerCercle(double pRayon) {

		Cercle cer = new Cercle(pRayon);
		return cer;
	}
}
