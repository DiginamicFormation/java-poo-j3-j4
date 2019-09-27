package fr.diginamic.parseur.membres;

import org.apache.commons.lang3.math.NumberUtils;

/** Factory pour les membres
 * @author DIGINAMIC
 *
 */
public class MembreFactory {

	/** Retourne soit une variable, soit une constante
	 * @param token token
	 * @return Membre
	 */
	public static Membre getMembre(String token) {
		if (NumberUtils.isCreatable(token)){
			return new Constante(NumberUtils.createDouble(token));
		}
		if (token.equalsIgnoreCase("PI")){
			return new Constante(Math.PI);
		}
		else {
			return new Variable(token);
		}
	}

}
