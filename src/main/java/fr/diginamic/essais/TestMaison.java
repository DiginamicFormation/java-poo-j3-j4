package fr.diginamic.essais;

import fr.diginamic.immobilier.Chambre;
import fr.diginamic.immobilier.Cuisine;
import fr.diginamic.immobilier.Maison;
import fr.diginamic.immobilier.Piece;
import fr.diginamic.immobilier.SalleDeBain;
import fr.diginamic.immobilier.Salon;
import fr.diginamic.immobilier.WC;

/** Test de la classe AffichageForme avec 3 formes différentes
 * @author DIGINAMIC
 *
 */
public class TestMaison {

	/** Point d'entrée
	 * @param args arguments
	 */
	public static void main(String[] args) {
		Maison maison = new Maison();

		maison.ajouterPiece(new Chambre(0, 9.5));
		maison.ajouterPiece(new Cuisine(0, 15.5));
		maison.ajouterPiece(new SalleDeBain(0, 2.5));
		maison.ajouterPiece(new WC(0, 1.25));
		maison.ajouterPiece(new Salon(0, 30.5));
		maison.ajouterPiece(new Chambre(1, 10.7));
		maison.ajouterPiece(new Chambre(1, 8.4));
		maison.ajouterPiece(new Chambre(1, 11.3));
		maison.ajouterPiece(new SalleDeBain(1, 4.5));
		maison.ajouterPiece(new WC(1, 1.5));
		
		System.out.println("Superficie Total: " + maison.calculerSurface());
		System.out.println("Superficie de l'étage 0: " + maison.superficieEtage(0));
		System.out.println("Superficie de l'étage 1: " + maison.superficieEtage(1));
		System.out.println("Superficie des chambres: " + maison.superficieTypePiece(Piece.TYPE_CHAMBRE));
	}

}
