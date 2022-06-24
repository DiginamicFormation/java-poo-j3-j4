package fr.diginamic.jdr.entities.monsters;

import java.util.Random;

/** Représente un Loup
 * @author Jean-Baptiste
 *
 */
public class Wolf extends Monster {

	/**
	 * Constructor
	 */
	public Wolf() {
		name = "Loup";
		Random random = new Random();
		strength = 5 + random.nextInt(6); // 5 à 10 inclus
		life = 5 + random.nextInt(6);
	}

	@Override
	public int getPoints() {
		return 2;
	}
}