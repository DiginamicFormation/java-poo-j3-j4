package fr.diginamic.essais;

import fr.diginamic.entites.Facture;

/** Test de la classe Facture
 * @author DIGINAMIC
 *
 */
public class TestFacture {

	public static void main(String[] args) {
		Facture fact = new Facture(100);
		System.out.println(fact);
		
		fact.addKwh(25);
		System.out.println(fact);
		
		fact.addKwh(10);
		System.out.println(fact);
	}

}
