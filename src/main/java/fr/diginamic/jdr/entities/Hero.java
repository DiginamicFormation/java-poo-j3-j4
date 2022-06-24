package fr.diginamic.jdr.entities;

import java.util.Random;

/**
 * @author Jean-Baptiste
 *
 */
public class Hero extends Creature {

	private int score;

	/**
	 * Constructor
	 * 
	 * @param name nom de la créature
	 */
	public Hero(String name) {
		this.name = name;
		Random random = new Random();
		this.strength = 12 + random.nextInt(7); // 12 à 18 inclus
		this.life = 20 + random.nextInt(31); // 20 à 50
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score
	 *            the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
}