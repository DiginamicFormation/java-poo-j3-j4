package fr.diginamic.jdr;

import java.util.Scanner;

import fr.diginamic.jdr.services.GameService;

/**
 * Main class of the game.
 * 
 * @author DIGINAMIC
 * @version 1.0
 */
public class Application {

	/** Entrée de l'application
	 * @param args arguments
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("******** JEU DE ROLE ********");
		
		GameService gameService = new GameService();
		
		while (gameService.isRunning()) {
			System.out.println("Choisissez une option :");
			System.out.println("1 - Créer un personnage pour commencer une nouvelle partie");
			System.out.println("2 - Combattre une créature");
			System.out.println("3 - Afficher mon score");
			System.out.println("4 - Exit");
			String userChoice = scanner.nextLine();
		
			switch (userChoice) {
			case "1":
				gameService.createGame(scanner);
				break;
			case "2":
				gameService.fightACreature();
				break;
			case "3":
				gameService.displayScore();
				break;
			case "4":
				gameService.stop();
				break;
			}
		}
		
		scanner.close();
	}
}