package fr.diginamic.jdr.entities;
/**
 * @author Jean-Baptiste
 *
 */
public abstract class Creature {
	
	/** life : points de vie */
	protected double life;
	
	/** strength : force */
	protected double strength;
	
	/** name : nom de la créature*/
	protected String name;
	
	/**
	 * Génère la valeur d'attaque de la créature.
	 * 
	 * @return int
	 */
	public final double getAttackValue() {
		return strength + 1 + (int) (Math.random() * 9);
	}
	
	/** Retourne si le personnage est en vie ou non
	 * @return boolean
	 */
	public final boolean isAlive() {
		return life > 0;
	}

	/** Getter
	 * @return the life
	 */
	public double getLife() {
		return life;
	}

	/** Setter
	 * @param life
	 *            the life to set
	 */
	public void setLife(double life) {
		this.life = life;
	}

	/** Getter
	 * @return the strength
	 */
	public double getStrength() {
		return strength;
	}

	/** Setter
	 * @param strength
	 *            the strength to set
	 */
	public void setStrength(double strength) {
		this.strength = strength;
	}

	/** Getter
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/** Setter
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}