package exo.chap04_tableaux;
import tools.Clavier;

public class JF_48 {

	public static void main(String[] args) {
		final int N =5;
		double max = Double.NEGATIVE_INFINITY;
		double min = Double.POSITIVE_INFINITY;
		double tot = 0;
		double val [] = new double[N];
		for (int i=0;i<N;i++) {
		System.out.print("Entrez une valeur : ");
		val[i]=Clavier.lireDouble();
		}
		for ( double v : val) {
			System.out.println(" La valeur est : " + v);
			max = Math.max(max, v);
			min = Math.min(min, v);
			tot =+ v;  
		}
		System.out.println("La moyenne est : " +tot/N);
		System.out.println("Le max est : " + max);
		System.out.println("Le min est : " + min);
    }
}