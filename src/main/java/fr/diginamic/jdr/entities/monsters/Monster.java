package fr.diginamic.jdr.entities.monsters;

import fr.diginamic.jdr.entities.Creature;

/** Représente un "monstre" susceptible de combattre le héros
 * @author DIGINAMIC
 *
 */
public abstract class Monster extends Creature {
	
	/** Retourne le nombre de points que rapporte la créature en cas de victoire
	 * @return int
	 */
	public abstract int getPoints();
}
