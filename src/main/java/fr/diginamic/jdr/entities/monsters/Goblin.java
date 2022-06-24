package fr.diginamic.jdr.entities.monsters;

import java.util.Random;

/** Représente un Gobelin
 * @author Jean-Baptiste
 *
 */
public class Goblin extends Monster {

	/**
	 * Constructor
	 */
	public Goblin() {
		name = "Gobelin";
		Random random = new Random();
		strength = 7 + random.nextInt(6); // 7 à 12 inclus
		life = 10 + random.nextInt(6); // 10 à 15
	}

	@Override
	public int getPoints() {
		return 1;
	}
}