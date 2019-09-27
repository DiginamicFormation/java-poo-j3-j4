package fr.diginamic.essais;

import fr.diginamic.parseur.Expression;
import fr.diginamic.parseur.Parseur;

/** Tests de la classe Parseur
 * @author DIGINAMIC
 *
 */
public class TestParseur {

	/** Point d'entrée
	 * @param args arguments
	 */
	public static void main(String[] args) {
		Expression expr = Parseur.parse("x+3.2");
		System.out.println(expr.evaluer("x", 5));
		
		expr = Parseur.parse("3/x");
		System.out.println(expr.evaluer("x", 6));
		
		expr = Parseur.parse("6.223-x");
		System.out.println(expr.evaluer("x", 5));
		
		expr = Parseur.parse("x/3.2");
		System.out.println(expr.evaluer("x", 6.4));
		
		expr = Parseur.parse("x/PI");
		System.out.println(expr.evaluer("x", 2*Math.PI));

	}

}
