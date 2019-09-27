package fr.diginamic.jdr.components;

import java.util.Random;

import fr.diginamic.jdr.Game;
import fr.diginamic.jdr.creatures.Creature;
import fr.diginamic.jdr.creatures.Goblin;
import fr.diginamic.jdr.creatures.Troll;
import fr.diginamic.jdr.creatures.Wolf;

/**
 * Instanciation et déroulement d'un tour de jeu
 * 
 * @author Jean-Baptiste
 *
 */
public class TurnOfPlay {

	/**
	 * Un combat complet (jusqu'à la mort de la créature ou du character)
	 */
	public static void newTurn() {
		// random de 0 à 2
		Random random = new Random();
		int points = 0;
		int creatureRandom = random.nextInt(3);
		Creature creature = null;
		// switch pour affectation de la créature
		if (creatureRandom == 0) {
			creature = new Goblin();
			points = 2;
		} else if (creatureRandom == 1) {
			creature = new Troll();
			points = 5;
		} else if (creatureRandom == 2) {
			creature = new Wolf();
			points = 1;
		}
		System.out.println("Vous affrontez un " + creature.getName() + ", avec force = " + creature.getStrength()
				+ ", vie = " + creature.getLife());
		// BOUCLE TANT QUE LA CREATURE ET LE CHARACTER SONT VIVANTS
		while (creature.getLife() > 0 && Game.getCharacter().getLife() > 0) {
			// calcule de l'attaque du personnage et de la créature
			double characterAttack = Game.getCharacter().getAttackValue();
			double creatureAttack = creature.getAttackValue();
			// si character plus rapide
			if (characterAttack > creatureAttack) {
				double damages = characterAttack - creatureAttack;
				System.out.println(Game.getCharacter().getName() + " est plus rapide. Il inflige " + damages + " à "
						+ creature.getName());
				creature.setLife(creature.getLife() - damages);
				System.out.println("Il lui reste " + creature.getLife() + " PV.");
				// si creature plus rapide
			} else if (characterAttack == creatureAttack) {
				System.out.println("La créature évite votre coups.");
				continue;
				// si égalité de vitesse
			} else {
				double damages = creatureAttack - characterAttack;
				System.out.println(creature.getName() + " est plus rapide. Il inflige " + damages + " à "
						+ Game.getCharacter().getName());
				Game.getCharacter().setLife(Game.getCharacter().getLife() - damages);
				System.out.println(
						"Il reste " + Game.getCharacter().getLife() + " PV à " + Game.getCharacter().getName());
			}
			// fin du combat, à la mort d'un des deux protagonistes
			if (creature.getLife() <= 0) {
				Game.getCharacter().setScore(Game.getCharacter().getScore() + points);
				System.out.println("VICTOIRE !!! Vous avez gagné le combat ! Votre score est maintenant de "
						+ Game.getCharacter().getScore() + " points.");
			} else if (Game.getCharacter().getLife() <= 0) {
				Game.setCharacterAlive(false);
				System.out.println("GAMER OVER :/ Votre brave héros a cédé sous les coups de l'ennemi. Il restait "
						+ creature.getLife() + " PV à " + creature.getName());
			}
		}
	}
}