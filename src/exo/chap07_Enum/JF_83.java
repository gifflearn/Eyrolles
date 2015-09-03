package exo.chap07_Enum;

public class JF_83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Couleurs c1,c2;
	c1 = Couleurs.bleu;
	c2 = Couleurs.jaune;
	System.out.println(c1 + " " + c2);
	Couleurs c;
	if (c1 != c2) { // ou if (!c1.equals(c2))
		c = c1; c1 = c2;c2 = c;
	}
	System.out.println(c1 + " " + c2);
		
	}

	enum Couleurs {rouge,bleu,vert,jaune};
}
