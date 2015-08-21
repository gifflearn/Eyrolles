package exo.chap01_opexp;

public class Formattage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 12;
		String j = new String();
		j = j.valueOf(i);
		System.out.println("String j : "+j);
		int k = Integer.valueOf(j).intValue();
		System.out.println("int k : "+k);
		
		// Notation :
		double nombre1 = 1000000000000d; // cast en d
		//Peut s'écrire ainsi
		double nombre2 = 1____000____000___000_000d; // cast en d
		//Le nombre d'underscore n'a pas d'importance

		//Voici quelques autres exemple d'utilisation
		int entier = 32_000;
		double monDouble = 12_34_56_78_89_10d; // cast en d
		double monDouble2 = 1234_5678_8910d;   // cast en d
		
		//
		int entier3 = 255; //Peut s'écrire « int entier = 0xFF; »
		int entier4 = 20; //Peut s'écrire « int entier = 0x14; »
		int entier5 = 5112; //Peut s'écrire « int entier = 0x13_F8; »
		
		//
		int entier6 = 0b1111_1111; //Est équivalent à : « int entier = 255; »
		int entier7 = 0b1000_0000_0000; //Est équivalent à : « int entier = 2048; »
		int entier8 = 0b100000000000; //Est équivalent à : « int entier = 2048; »
		
	}

}
