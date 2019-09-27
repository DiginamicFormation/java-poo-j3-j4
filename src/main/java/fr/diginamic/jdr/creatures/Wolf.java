package fr.diginamic.jdr.creatures;

import java.util.Random;

/**
 * @author Jean-Baptiste
 *
 */
public class Wolf extends Creature {

	/**
	 * Constructor
	 * 
	 * @param life
	 * @param strength
	 * @param name
	 */
	public Wolf() {
		name = "Loup";
		Random random = new Random();
		strength = 5 + random.nextInt(6); // 5 à 10 inclus
		life = 5 + random.nextInt(6);
	}
}