package fr.diginamic.essais;

import fr.diginamic.entites.Spectacle;
import fr.diginamic.entites.TheatrePro;

public class TestTheatrePro {

	public static void main(String[] args) {
		TheatrePro monTheatre = new TheatrePro("Les Bouffes du Nord");
		monTheatre.ajouterSpectacle(new Spectacle("L'avare", "Comédie", 75.0, 100));
		monTheatre.ajouterSpectacle(new Spectacle("La vie dissolue des Durand", "Comédie", 85.0, 50));
		monTheatre.ajouterSpectacle(new Spectacle("Heilung", "Concert", 120.0, 200));
		
		monTheatre.inscrire(10, "La vie dissolue des Durand");
		monTheatre.inscrire(41, "La vie dissolue des Durand");
		
		monTheatre.inscrire(20, "L'avare");
		monTheatre.inscrire(40, "L'avare");
		monTheatre.inscrire(50, "L'avare");
		
		monTheatre.inscrire(200, "Heilung");
		monTheatre.inscrire(1, "Heilung");
		
		System.out.println(monTheatre.getNbTotalClients());
		System.out.println(monTheatre.getRecetteTotale());
	}

}
