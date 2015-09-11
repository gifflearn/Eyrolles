package exo.chap16_Generique;
class Couple < T > { 
	private T x, y ; // les deux éléments du couple 
	public Couple (T premier, T second) { 
		x = premier ; y = second ; 
		} 
	public void affiche () {
		System.out.println (" premiere valeur : " + x + " - deuxieme valeur : " + y ) ; 
	} 
}	
class CoupleNom<T> extends Couple<T> {

	public CoupleNom(T premier, T second, String pnom) {
		super(premier,second);
		this.nom=pnom;
		// TODO Auto-generated constructor stub
	}
	public void affiche () {
		System.out.println (" Nom : " + nom) ; 
		super.affiche();
	} 
	private String nom;

}

class PointNomJF<Integer> extends CoupleNom<Integer> {

	public PointNomJF(Integer premier, Integer second, String pnom) {
		super(premier, second, pnom);
		// TODO Auto-generated constructor stub
	}
	
}
class JF_158 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Couple a = new Couple(2.0, 3.0);
		a.affiche();
		CoupleNom b = new CoupleNom(5.0, 5.0, "Allez");
		b.affiche();
		PointNomJF c = new PointNomJF(4, 4, "Zob");
		c.affiche();
		
	}

}
