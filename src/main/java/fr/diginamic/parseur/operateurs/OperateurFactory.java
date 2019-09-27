package fr.diginamic.parseur.operateurs;

/** Crée un opérateur en fonction d'une expression passée en paramètre de la méthode
 * @author DIGINAMIC
 *
 */
public class OperateurFactory {

	/** Retourne un opérateur en fonction de l'expression
	 * @param expression expression
	 * @return Operateur
	 */
	public static Operateur getOperateur(String expression) {
		if (expression.indexOf('+')!=-1){
			return new Plus();
		}
		else if (expression.indexOf('*')!=-1){
			return new Mult();
		}
		else if (expression.indexOf('-')!=-1){
			return new Moins();
		}
		else if (expression.indexOf('/')!=-1){
			return new Div();
		}
		throw new RuntimeException("L'expression "+expression+" contient un opérateur inconnu.");
		
	}
}
