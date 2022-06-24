package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

/** Classe dont le rôle est de générer des instances de {@link Cercle}
 * @author DIGINAMIC
 *
 */
public class CercleFactory {

	/** Génère un cercle d'un rayon donné
	 * @param rayon rayon
	 * @return {@link Cercle}
	 */
	public static Cercle getInstance(double rayon) {
		return new Cercle(rayon);
	}
}
