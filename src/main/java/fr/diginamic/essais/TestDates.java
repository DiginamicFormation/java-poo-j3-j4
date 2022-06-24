package fr.diginamic.essais;

import fr.diginamic.entites.Date;

public class TestDates {

	public static void main(String[] args) {
		Date date20211 = new Date(2021, 5, 24);
		Date date20212 = new Date(2021, 6, 24);
		Date date20213 = new Date(2021, 7, 24);

		Date date20221 = new Date(2022, 5, 24);
		Date date20222 = new Date(2022, 6, 24);
		Date date20223 = new Date(2022, 7, 24);
		Date date20224 = new Date(2022, 6, 23);
		Date date20225 = new Date(2022, 6, 25);

		Date date20231 = new Date(2023, 6, 24);

		// estAvant : Cas true
		verifier("1", true, date20221.estAvant(date20222));
		verifier("2", true, date20224.estAvant(date20222));

		verifier("3", true, date20211.estAvant(date20222));
		verifier("4", true, date20212.estAvant(date20222));
		verifier("5", true, date20213.estAvant(date20222));

		// estAvant : Cas false
		verifier("6", false, date20222.estAvant(date20222));
		verifier("7", false, date20223.estAvant(date20222));
		verifier("8", false, date20225.estAvant(date20222));
		verifier("9", false, date20231.estAvant(date20222));

		// estApres : Cas true
		verifier("20", true, date20222.estApres(date20211));
		verifier("21", true, date20222.estApres(date20212));
		verifier("22", true, date20222.estApres(date20213));
		verifier("23", true, date20222.estApres(date20221));
		verifier("24", true, date20222.estApres(date20224));

		// estApres : Cas false
		verifier("25", false, date20222.estApres(date20222));
		verifier("26", false, date20222.estApres(date20223));
		verifier("27", false, date20222.estApres(date20225));
		verifier("28", false, date20222.estApres(date20231));
		
		// estEgale : Cas true
		verifier("40", true, date20222.estEgale(date20222));
		
		// estEgale : Cas false
		verifier("41", false, date20222.estEgale(date20212));
		verifier("42", false, date20222.estEgale(date20221));
		verifier("43", false, date20222.estEgale(date20225));
	}
	
	public static void verifier(String numTest, boolean resultatAttendu, boolean resultatObtenu) {
		
		if (resultatAttendu==resultatObtenu) {
			System.out.println("Le test "+numTest+" est passant.");
		}
		else {
			System.err.println("Le test "+numTest+" est FAUX.");
		}
	}

}
