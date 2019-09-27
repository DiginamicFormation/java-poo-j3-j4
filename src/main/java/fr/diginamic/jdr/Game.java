package fr.diginamic.jdr;

import java.util.Scanner;

import fr.diginamic.jdr.components.Interface;
import fr.diginamic.jdr.creatures.Character;

/**
 * Main class of the game.
 * 
 * @author Jean-Baptiste
 * @version 1.0 ALPHA
 */
public class Game {

	/** amountOfTurns : int*/
	private static int amountOfTurns = 0;
	/** isCharacterAlive : boolean*/
	private static boolean isCharacterAlive;
	/** isRunning : boolean*/
	private static boolean isRunning = true;
	/** character : Character*/
	private static Character character = null;

	/** Entrée de l'application
	 * @param args arguments
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("******** JEU DE ROLE ********");
		while (isRunning) {
			Interface.showMenu(scanner);
		}
		scanner.close();
	}

	/**
	 * @return the amountOfTurns
	 */
	public static int getAmountOfTurns() {
		return amountOfTurns;
	}

	/**
	 * @param amountOfTurns
	 *            the amountOfTurns to set
	 */
	public static void setAmountOfTurns(int amountOfTurns) {
		Game.amountOfTurns = amountOfTurns;
	}

	/**
	 * @return the isCharacterAlive
	 */
	public static boolean isCharacterAlive() {
		return isCharacterAlive;
	}

	/**
	 * @param isCharacterAlive
	 *            the isCharacterAlive to set
	 */
	public static void setCharacterAlive(boolean isCharacterAlive) {
		Game.isCharacterAlive = isCharacterAlive;
	}

	/**
	 * @return the isRunning
	 */
	public static boolean isRunning() {
		return isRunning;
	}

	/**
	 * @param isRunning
	 *            the isRunning to set
	 */
	public static void setRunning(boolean isRunning) {
		Game.isRunning = isRunning;
	}

	/**
	 * @return the character
	 */
	public static Character getCharacter() {
		return character;
	}

	/**
	 * @param character
	 *            the character to set
	 */
	public static void setCharacter(Character character) {
		Game.character = character;
	}

}