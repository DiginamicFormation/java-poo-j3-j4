package fr.diginamic.jdr.services;

import java.util.Scanner;

import fr.diginamic.jdr.components.Game;
import fr.diginamic.jdr.entities.Hero;
import fr.diginamic.jdr.entities.monsters.Monster;
import fr.diginamic.jdr.entities.monsters.MonsterFactory;

/**
 * Classe qui exécute les différents cas d'utilisation de l'application
 * 
 * @author Jean-Baptiste M.
 *
 */
public class GameService {
	
	/** game : partie */
	private Game game;
	
	/** running */
	private boolean running;

	/** Constructeur
	 * @param game partie
	 */
	public GameService() {
		super();
		this.running = true;
	}

	/**
	 * Crée une nouvelle partie avec un nouveau héros
	 * 
	 */
	public void createGame(Scanner scanner) {
		System.out.println("Quel nom voulez-vous donner à votre personnage ?");
		String name = scanner.nextLine();
		
		// Création du héros
		Hero character = new Hero(name);
		
		// Création de la partie
		game = new Game(character);
		
		// Message de démarrage
		System.out
				.println("TADAAM !! " + character.getName() + " vient de naitre. Il a les caractéristiques suivantes : "
						+ character.getStrength() + " de force et " + character.getLife() + " points de vie");
	}

	/**
	 * Si le héros est vivant, cette méthode permet de combattre une créature générée aléatoirement
	 */
	public void fightACreature() {
		
		if (game.isHeroAlive()) {
			game.setNumTurn(game.getNumTurn()+1);
			System.out.println("***** TOUR DE JEU N°" + game.getNumTurn() + " *****");
			
			Monster creature = MonsterFactory.generate();
			game.fight(creature);
			
			System.out.println("***** FIN DU TOUR *****");
		} else {
			System.out.println(
					"Vous ne pouvez pas combattre sans avoir créé un personnage au préalable ou avec un personnage décédé.");
		}

	}

	/**
	 * Affiche le score
	 */
	public void displayScore() {
		if (game.getHero() != null) {
			System.out.println("Votre score : " + game.getHero().getScore());
		} else {
			System.out.println("Il faut avoir créé un personnage avant de pouvoir obtenir son score.");
		}
	}

	/**
	 * Arrête l'application
	 */
	public void stop() {
		running = false;
	}

	/** Getter
	 * @return the game
	 */
	public Game getGame() {
		return game;
	}

	/** Setter
	 * @param game the game to set
	 */
	public void setGame(Game game) {
		this.game = game;
	}

	/** Getter
	 * @return the running
	 */
	public boolean isRunning() {
		return running;
	}

	/** Setter
	 * @param running the running to set
	 */
	public void setRunning(boolean running) {
		this.running = running;
	}

}