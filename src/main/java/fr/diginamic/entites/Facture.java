package fr.diginamic.entites;

/** Facture de consommation d'electricité avec 3 attributs:
 * - le nombre de KWH consommés
 * - le montant de la facture HT
 * - le montant de la facture TTC
 * 
 * @author DIGINAMIC
 *
 */
public class Facture {

	/** Nb de KWH */
	private int nbKwh;
	
	/** Montant HT */
	private double montantHT;
	
	/** Montant TTC */
	private double montantTTC;
	

	/** PRIX_KWH_TTC : prix du KWH unitaire TTC */
	public static final double PRIX_KWH_TTC = 0.15;
	
	/** Constructeur
	 * @param nbKwhInitial nombre de kwh consommé initialement
	 */
	public Facture(int nbKwhInitial) {
		this.nbKwh = nbKwhInitial;
		calculerMontants();
	}
	
	/** Ajoute une nouvelle consommation en KWH à la facture
	 * @param consoAdditionnelleKwh consommation additionnelle
	 */
	public void addKwh(int consoAdditionnelleKwh) {
		this.nbKwh+=consoAdditionnelleKwh;
		calculerMontants();
	}

	/**
	 * Calcule les montants TTC et HT
	 */
	private void calculerMontants() {
		this.montantTTC = PRIX_KWH_TTC * nbKwh;
		this.montantHT = this.montantTTC * 0.8;
	}
	
	@Override
	public String toString() {
		return "Consommation="+nbKwh+" - Montant H.T.="+montantHT+"€ - Montant T.T.C.="+montantTTC+"€";
	}

	/** Getter
	 * @return the nbKwh
	 */
	public int getNbKwh() {
		return nbKwh;
	}

	/** Getter
	 * @return the montantHT
	 */
	public double getMontantHT() {
		return montantHT;
	}

	/** Getter
	 * @return the montantTTC
	 */
	public double getMontantTTC() {
		return montantTTC;
	}
}
