package fr.diginamic.jdr.components;

import fr.diginamic.jdr.entities.Hero;
import fr.diginamic.jdr.entities.monsters.Monster;

/**
 * Représente une partie
 * 
 * @author Jean-Baptiste
 * @version 1.0 ALPHA
 */
public class Game {

	/** amountOfTurns : int*/
	private int amountOfTurns;
	
	/** isRunning : boolean*/
	private boolean isRunning = true;
	
	/** hero : le héros */
	private Hero hero;
	
	/** Constructeur
	 * @param hero héros
	 */
	public Game(Hero hero) {
		this.hero = hero;
	}

	/** Retourne si oui ou non le héros est en vie
	 * @return boolean
	 */
	public boolean isHeroAlive() {
		return hero!=null && hero.isAlive();
	}

	/**
	 * Un combat complet (jusqu'à la mort de la créature ou du character)
	 */
	public void fight(Monster monster) {
		
		System.out.println("Vous affrontez un " + monster.getName() + ", avec force = " + monster.getStrength()
				+ ", vie = " + monster.getLife());
		
		// BOUCLE TANT QUE LA CREATURE ET LE CHARACTER SONT VIVANTS
		while (monster.isAlive() && hero.isAlive()) {
			
			// calcule de l'attaque du personnage et de la créature
			double heroAtt = hero.getAttackValue();
			double monsterAtt = monster.getAttackValue();
			
			// Si héros plus rapide
			if (heroAtt > monsterAtt) {
				double damages = heroAtt - monsterAtt;
				System.out.println(hero.getName() + " est plus rapide. Il inflige " + damages + " à "
						+ monster.getName());
				monster.setLife(monster.getLife() - damages);
				System.out.println("Il lui reste " + monster.getLife() + " PV.");
			} 
			else if (heroAtt == monsterAtt) {
				System.out.println("La créature évite votre coups.");
				continue;
				// si égalité de vitesse
			} 
			// si monstre plus rapide
			else {
				double damages = monsterAtt - heroAtt;
				System.out.println(monster.getName() + " est plus rapide. Il inflige " + damages + " à "
						+ hero.getName());
				hero.setLife(hero.getLife() - damages);
				System.out.println(
						"Il reste " + hero.getLife() + " PV à " + hero.getName());
			}
			
			// fin du combat, à la mort d'un des deux protagonistes
			if (monster.getLife() <= 0) {
				hero.setScore(hero.getScore() + monster.getPoints());
				System.out.println("VICTOIRE !!! Vous avez gagné le combat ! Votre score est maintenant de "
						+ hero.getScore() + " points.");
			} 
			else if (hero.getLife() <= 0) {
				System.out.println("GAMER OVER :/ Votre brave héros a cédé sous les coups de l'ennemi. Il restait "
						+ monster.getLife() + " PV à " + monster.getName());
			}
		}
	}
	
	/**
	 * @return the amountOfTurns
	 */
	public int getAmountOfTurns() {
		return amountOfTurns;
	}

	/**
	 * @param amountOfTurns
	 *            the amountOfTurns to set
	 */
	public void setAmountOfTurns(int amountOfTurns) {
		this.amountOfTurns = amountOfTurns;
	}

	/**
	 * @return the isRunning
	 */
	public boolean isRunning() {
		return isRunning;
	}

	/**
	 * @param isRunning
	 *            the isRunning to set
	 */
	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	/**
	 * @return the character
	 */
	public Hero getHero() {
		return hero;
	}

}