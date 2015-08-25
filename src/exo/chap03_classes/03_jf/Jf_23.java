package exo.chap03_classes;

class Poin

{ public Poin (char c, double x)   // constructeur
  { nom = c ;
    abs = x ;
  }

  public void affiche()
	{
	System.out.println("Nom du point : " + nom);
	System.out.println("Abscisse du point : " + abs);
	}
  
  public void translate(int x)
  {
	abs += x;  
	System.out.println("Nouvelle abscisse du point : " + abs);  
  }

	private char nom ;
	private double abs;
}

public class Jf_23 {
	
	public static void main (String[] args) {
	
		Poin a = new Poin('a',2);
		Poin b = new Poin('b',3);
		
		a.affiche();
		a.translate(5);
		b.affiche();
		b.translate(6);
		
	}

}
