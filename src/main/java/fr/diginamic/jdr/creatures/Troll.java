package fr.diginamic.jdr.creatures;

import java.util.Random;

/**
 * @author Jean-Baptiste
 *
 */
public class Troll extends Creature {

	/**
	 * Constructor
	 * 
	 * @param life
	 * @param strength
	 * @param name
	 */
	public Troll() {
		name = "Troll";
		Random random = new Random();
		strength = 12 + random.nextInt(9); // 12 à 20 inclus
		life = 20 + random.nextInt(11); // 20 à 30
	}
}