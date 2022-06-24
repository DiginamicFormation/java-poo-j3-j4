package fr.diginamic.parseur;

import java.util.regex.Pattern;

import fr.diginamic.parseur.membres.Membre;
import fr.diginamic.parseur.membres.MembreFactory;
import fr.diginamic.parseur.operateurs.Operateur;
import fr.diginamic.parseur.operateurs.OperateurFactory;

/** Parseur mathématique simple.
 * @author DIGINAMIC
 *
 */
public class Parseur {

	/** Parse l'expression infix passée en paramètre
	 * @param infix expression contenant un calcul
	 * @return Expression
	 */
	public static Expression parse(String infix){
		Operateur operateur = OperateurFactory.getOperateur(infix);
		
		String[] morceaux = infix.split(Pattern.quote(operateur.getNom()));
		
		Membre membreGauche = MembreFactory.getMembre(morceaux[0]);
		Membre membreDroit = MembreFactory.getMembre(morceaux[1]);
		
		return new Expression(membreGauche, operateur, membreDroit);
	}
}
