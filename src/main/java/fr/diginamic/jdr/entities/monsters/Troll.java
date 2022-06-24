package fr.diginamic.jdr.entities.monsters;

import java.util.Random;

/** Représente un Troll
 * @author Jean-Baptiste
 *
 */
public class Troll extends Monster {

	/**
	 * Constructor
	 */
	public Troll() {
		name = "Troll";
		Random random = new Random();
		strength = 12 + random.nextInt(9); // 12 à 20 inclus
		life = 20 + random.nextInt(11); // 20 à 30
	}

	@Override
	public int getPoints() {
		return 5;
	}
}