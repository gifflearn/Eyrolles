package exo.chap07_Enum;
import my_tools.*;
public class JF_86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String ma_chaine;
		System.out.println("Entrez une chaine : " );
		//ma_chaine = Clavier.lireString();
		Suite courant = Suite.valueOf(Clavier.lireString()); // il faut gerer l'exception si la chaine n'est pas dans l'enum
		System.out.println(courant.ordinal());
	}
	enum Suite {ut,re,mi,fa,sol,la,si} // do est un mot clef
}
