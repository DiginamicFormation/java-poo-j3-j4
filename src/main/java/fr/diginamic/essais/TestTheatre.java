package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {

		Theatre monTheatre = new Theatre("Les Bouffes du Nord", 100);
		monTheatre.inscrire(15, 150);
		monTheatre.inscrire(35, 100);
		monTheatre.inscrire(45, 80);
		monTheatre.inscrire(7, 75);
		
		System.out.printf("Le théâtre %s accueille %d clients, pour une recette de %.1f€", monTheatre.getNom(), monTheatre.getNombreClientsInscrits(), monTheatre.getRecette());

	}

}
