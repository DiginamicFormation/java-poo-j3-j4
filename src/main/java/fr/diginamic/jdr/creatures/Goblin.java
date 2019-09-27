package fr.diginamic.jdr.creatures;

import java.util.Random;

/**
 * @author Jean-Baptiste
 *
 */
public class Goblin extends Creature {

	/**
	 * Constructor
	 * 
	 * @param life
	 * @param strength
	 * @param name
	 */
	public Goblin() {
		name = "Gobelin";
		Random random = new Random();
		strength = 7 + random.nextInt(6); // 7 à 12 inclus
		life = 10 + random.nextInt(6); // 10 à 15
	}
}