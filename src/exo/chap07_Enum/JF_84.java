package exo.chap07_Enum;

public class JF_84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Liste des valeurs de suite ");
		for (Suite s : Suite.values() ) {
			System.out.println(s); // appel implicite de toString
		}
	}
enum Suite {ut,re,mi,fa,sol,la,si} // do est un mot clef
}
