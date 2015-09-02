package livre.chap09;

public class Fusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ch1 = "bonjour";
		String ch2 = "bonjour";
		
		
		if (ch1==ch2) System.out.println("egales"); // il y a fusion des chaines identiques dans ce cas
		else System.out.println("differentes");
		
		//
		String ch11 = "bonjour";
		String ch12 = "bon";
		ch12 += "jour";
		
		if (ch11==ch12) System.out.println("egales");
		else System.out.println("differentes");
		
		//
		String ch21 = "bonjour1",ch22;
		int n = 1;
		ch22 = "bonjour"+n;
		
		if (ch21==ch22) System.out.println("egales");
		else System.out.println("differentes");
		
	}

}
