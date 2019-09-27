package fr.diginamic.jdr.creatures;
/**
 * @author Jean-Baptiste
 *
 */
public abstract class Creature {
	protected double life;
	protected double strength;
	protected String name;

	/**
	 * Génère la valeur d'attaque de la créature.
	 * 
	 * @return
	 */
	public final double getAttackValue() {
		return strength + 1 + (int) (Math.random() * 9);
	}

	/**
	 * @return the life
	 */
	public double getLife() {
		return life;
	}

	/**
	 * @param life
	 *            the life to set
	 */
	public void setLife(double life) {
		this.life = life;
	}

	/**
	 * @return the strength
	 */
	public double getStrength() {
		return strength;
	}

	/**
	 * @param strength
	 *            the strength to set
	 */
	public void setStrength(double strength) {
		this.strength = strength;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}