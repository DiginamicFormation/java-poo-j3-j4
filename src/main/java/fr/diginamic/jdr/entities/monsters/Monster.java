package fr.diginamic.jdr.entities.monsters;

import fr.diginamic.jdr.entities.Creature;

/** Représente un "monstre" susceptible de combattre le héros
 * @author RichardBONNAMY
 *
 */
public abstract class Monster extends Creature {

	
	/** Retourne le nombre de points que rapporte la créature en case de vitoire
	 * @return
	 */
	public abstract int getPoints();
}
