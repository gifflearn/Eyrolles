package exo.chap03_classes;

import sun.security.jca.GetInstance;

// exo_31
class JfIdent
{
	public JfIdent()
	{
		ident = ++maxIdent;
	}
	static private int maxIdent = 0;
	private int ident;
	
	public void affiche(){
		System.out.println("Identifiant du point : " + ident );
	}
	
	static int getMaxIdent() { return maxIdent;}
}
public class Jf_31 {

	public static void main(String[] args) {
		JfIdent a = new JfIdent();
		a.affiche();
		System.out.println("Nombre max : " + JfIdent.getMaxIdent() );
		
		JfIdent b = new JfIdent();
		b.affiche();
		System.out.println("Nombre max : " + JfIdent.getMaxIdent() );
	}
}
