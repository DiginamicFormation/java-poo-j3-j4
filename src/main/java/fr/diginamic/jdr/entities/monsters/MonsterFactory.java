package fr.diginamic.jdr.entities.monsters;

import java.util.Random;

/** Classe de type "factory" dans le rôle est de créer une créature sur demande
 * @author RichardBONNAMY
 *
 */
public class MonsterFactory {

	/** Returns a random generated creature
	 * @return
	 */
	public static Monster generate() {
		Random random = new Random();
		int creatureRandom = random.nextInt(3);
		
		Monster monster = null;
		if (creatureRandom == 0) {
			monster = new Goblin();
		} else if (creatureRandom == 1) {
			monster = new Troll();
		} else if (creatureRandom == 2) {
			monster = new Wolf();
		}
		return monster;
	}
}
