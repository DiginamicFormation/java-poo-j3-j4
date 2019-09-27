package fr.diginamic.parseur;

import fr.diginamic.parseur.membres.Membre;
import fr.diginamic.parseur.operateurs.Operateur;

/** Représente une expression mathématique simple avec un membre gauche, un opérateur et un membre droit, exemple: x+3.2
 * @author DIGINAMIC
 *
 */
public class Expression {
	
	/** membreGauche : partie gauche d'une expression par exemple x dans l'expression x+3.2 */
	private Membre membreGauche;
	/** operateur : opérateur d'une expression par exemple + dans l'expression x+3.2 */
	private Operateur operateur;
	/** membreDroit : partie droite d'une expression par exemple 3.2 dans l'expression x+3.2 */
	private Membre membreDroit;

	/** COnstructeur
	 * @param membreGauche membre gauche
	 * @param operateur opérateur
	 * @param membreDroit membre droit
	 */
	public Expression(Membre membreGauche, Operateur operateur, Membre membreDroit) {
		super();
		this.membreGauche = membreGauche;
		this.operateur = operateur;
		this.membreDroit = membreDroit;
	}

	/** Evalue l'expression pour une variable donnée et une valeur donnée de cette variable
	 * @param variable nom de la variable
	 * @param valeur valeur de la variable
	 * @return double
	 */
	public double evaluer(String variable, double valeur){
		return operateur.evaluer(variable, valeur, membreGauche, membreDroit);
	}

	/** Getter
	 * @return the membreGauche
	 */
	public Membre getMembreGauche() {
		return membreGauche;
	}

	/** Setter
	 * @param membreGauche the membreGauche to set
	 */
	public void setMembreGauche(Membre membreGauche) {
		this.membreGauche = membreGauche;
	}

	/** Getter
	 * @return the operateur
	 */
	public Operateur getOperateur() {
		return operateur;
	}

	/** Setter
	 * @param operateur the operateur to set
	 */
	public void setOperateur(Operateur operateur) {
		this.operateur = operateur;
	}

	/** Getter
	 * @return the membreDroit
	 */
	public Membre getMembreDroit() {
		return membreDroit;
	}

	/** Setter
	 * @param membreDroit the membreDroit to set
	 */
	public void setMembreDroit(Membre membreDroit) {
		this.membreDroit = membreDroit;
	}
}
