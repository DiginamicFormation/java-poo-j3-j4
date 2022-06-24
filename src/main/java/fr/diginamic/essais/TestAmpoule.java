package fr.diginamic.essais;

import fr.diginamic.entites.Ampoule;

public class TestAmpoule {

	public static void main(String[] args) {
		Ampoule amp = new Ampoule();
		System.out.println(amp);
		
		amp.clic();
		System.out.println(amp);

		amp.clic();
		System.out.println(amp);
	}

}
