package fr.diginamic.entites;

/** Représente un cercle
 * @author DIGINAMIC
 *
 */
public class Cercle {

	/**rayon */
	public double rayon;

	/** Constructor
	 * @param pRayon rayon du cercle
	 */
	public Cercle(double pRayon) {
		this.rayon = pRayon;
	}

	/** Retourne le périmètre du cercle
	 * @return double
	 */
	public double perimetre() {
		return (2 * Math.PI * rayon);
	}

	/** Retourne la surface du cercle
	 * @return
	 */
	public double surface() {
		return (Math.PI * Math.pow(rayon, 2));
	}

	/** Getter
	 * @return rayon
	 */
	public double getRayon() {
		return rayon;
	}

	/** Setter
	 * @param rayon nouveau rayon
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
}
