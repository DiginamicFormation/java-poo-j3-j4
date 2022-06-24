package fr.diginamic.entites;

/** Représente une ampoule avec un état indiquant si l'ampoule est allumée ou éteinte
 * @author DIGINAMIC
 *
 */
public class Ampoule {

	/** etat : état de l'ampoule (true=allumée, false=éteinte) */
	private boolean etat;

	/** Constructeur
	 */
	public Ampoule() {
		super();
		this.etat = false;
	}
	
	/**
	 * Si l'ampoule est allumée, elle passe à l'état éteinte et inversement
	 */
	public void clic() {
		etat = !etat;
	}
	
	@Override
	public String toString() {
		if (etat) {
			return "Allumée";
		}
		else {
			return "Eteinte";
		}
	}

	/** Getter
	 * @return the etat
	 */
	public boolean isEtat() {
		return etat;
	}
}
