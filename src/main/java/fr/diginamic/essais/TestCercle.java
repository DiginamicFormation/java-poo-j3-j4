package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

/** Test des classes Cercle et CercleFactory
 * @author DIGINAMIC
 *
 */
public class TestCercle {

	/** Point d'entrée
	 * @param args arguments
	 */
	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(3.5);
		System.out.println("Perimètre: " + cercle1.perimetre());
		System.out.println("Surface: " + cercle1.surface());
		
		Cercle cercle2 = new Cercle(4.0);
		System.out.println("Perimètre: " + cercle2.perimetre());
		System.out.println("Surface: " + cercle2.surface());

		Cercle cercle3 = CercleFactory.getInstance(4.5);
		System.out.println("Perimètre: " + cercle3.perimetre());
		System.out.println("Surface: " + cercle3.surface());

	}
}
