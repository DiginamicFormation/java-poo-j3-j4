package fr.diginamic.entites;

/**
 * Représente une date avec 3 attributs: - année (ex: 2022) - mois (entre 1 et
 * 12) - jour (entre 1 et 31 selons le numéro de mois)
 * 
 * @author DIGINAMIC
 *
 */
public class Date {

	/** annee */
	private int annee;
	/** mois */
	private int mois;
	/** jour */
	private int jour;

	/** Noms des différents mois */
	private static final String[] NOMS_MOIS=
	{"Janvier", "février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"};

	/**
	 * Constructeur
	 * 
	 * @param annee année
	 * @param mois  mois
	 * @param jour  jour
	 */
	public Date(int annee, int mois, int jour) {
		super();
		this.annee = annee;
		this.mois = mois;
		this.jour = jour;
	}
	
	/** Retourne true si la date courante est avant celle passée en paramètre
	 * @param date date
	 * @return boolean
	 */
	public boolean estAvant(Date date) {
		if (this.annee<date.getAnnee()) {
			return true;
		}
		else if (this.mois <date.getMois()) {
			return true;
		}
		else if (this.jour < date.getJour()) {
			return true;
		}
		return false;
	}
	
	/** Retourne true si la date courante est avant celle passée en paramètre
	 * @param date date
	 * @return boolean
	 */
	public boolean estApres(Date date) {
		if (this.annee>date.getAnnee()) {
			return true;
		}
		else if (this.mois >date.getMois()) {
			return true;
		}
		else if (this.jour > date.getJour()) {
			return true;
		}
		return false;
	}
	
	/** Retourne true si la date courante est égale à celle passée en paramètre
	 * @param date date
	 * @return boolean
	 */
	public boolean estEgale(Date date) {
		return annee==date.getAnnee() && mois==date.getMois() && jour==date.getJour();
	}


	/**
	 * Retourne la date formatée en fonction du type : <br>
	 * - si type==1 : affiche une date du type 12 février 2022<br>
	 * - si type==2 : affiche la date au format jour/mois/année<br>
	 * - si type==3 : affiche la date au format année/mois/jour<br>
	 * 
	 * @param type type de formattage
	 * @return String
	 */
	public String format(int type) {

		switch (type) {
		case 1:
			return formatNombre(jour)+" "+NOMS_MOIS[mois-1]+" "+annee;
		case 2:
			return formatNombre(jour)+"/"+formatNombre(mois)+"/"+annee;
		case 3:
			return annee+"/"+"/"+formatNombre(mois)+"/"+formatNombre(jour);
		default:
			return formatNombre(jour)+"/"+formatNombre(mois)+"/"+annee;
		}
	}
	
	/** AJoute un 0 à gauche si le nombre est inférieur à 10.
	 * Exemple :<br> 
	 * - si le nombre est égal à 9 alors la méthode retourne la chaine de caractères 09
	 * - si le nombre est supérieur ou égal à 10, la méthode retourne le nombre lui-même converti en chaine.
	 * @param nombre nombre
	 * @return int
	 */
	public String formatNombre(int nombre) {
		if (nombre<10) {
			return "0"+Integer.toString(nombre);
		}
		else {
			return Integer.toString(nombre);
		}
	}

	/**
	 * Getter
	 * 
	 * @return the annee
	 */
	public int getAnnee() {
		return annee;
	}

	/**
	 * Setter
	 * 
	 * @param annee the annee to set
	 */
	public void setAnnee(int annee) {
		this.annee = annee;
	}

	/**
	 * Getter
	 * 
	 * @return the mois
	 */
	public int getMois() {
		return mois;
	}

	/**
	 * Setter
	 * 
	 * @param mois the mois to set
	 */
	public void setMois(int mois) {
		this.mois = mois;
	}

	/**
	 * Getter
	 * 
	 * @return the jour
	 */
	public int getJour() {
		return jour;
	}

	/**
	 * Setter
	 * 
	 * @param jour the jour to set
	 */
	public void setJour(int jour) {
		this.jour = jour;
	}

}
