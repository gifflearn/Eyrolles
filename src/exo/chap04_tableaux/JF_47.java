package exo.chap04_tableaux;
import tools.Clavier;
public class JF_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=-1;
		int cartab[] = null;
		while (!(n>=0)) {
			System.out.print("Combien de valeurs ? (zero pour sortie ) ");
			n = Clavier.lireInt();
			if (n==0) { break;} else {
				cartab = new int[n];
				for (int i=0,j=1;i<n;i++,j+=2) {
						cartab[i]=(int)Math.pow((double)j,(double)2); // ou j*j !!"
				}	
			}
		}
		for (int v : cartab) System.out.println(v);

 }
}
