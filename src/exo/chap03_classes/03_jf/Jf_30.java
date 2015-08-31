package exo.chap03_classes;
//exo_30
class Pp {
	public Pp( int x){
		absabs = x;
	}
	
	static int absoc = 0;
	private int absabs;
	
	public void affiche() {
		System.out.println("Abscisse de l'origine courante : " + Pp.getOrigine() + " Abscisse du point pour cette origine : " + absrel());
	}
	
	public int absrel() {
		return absabs - absoc;
	}
	
	static int getOrigine() {
		return absoc;
	}
	
	static void setOrigine(int dx) {
		absoc += dx;
	}
}
public class Jf_30 {

	public static void main(String[] args) {
		
		Pp pa = new Pp(2);
		pa.affiche();
		Pp pb = new Pp(7);
		pb.affiche();
		Pp.setOrigine(2);
		pa.affiche();
		pb.affiche();
	}
}
