package exo.chap04_tableaux;
class Vector {
	public Vector (int n) {
		vec = new double[n];
		for (int i=0;i<n;i++) { vec[i] = 0;}
	}
	
	public Vector (int n, double x) {
		vec = new double[n];
		for (int i=0;i<n;i++) { vec[i] = x;}
	}
	
	public Vector (double [] v) {
		vec = new double[v.length];
		for (int i=0;i<v.length;i++) { vec[i] = v[i];}
	}
	
	public void affiche() {
		for (int i=0;i<vec.length;i++) {System.out.print(this.vec[i] + " ");}
		System.out.println("");
	}
	
	public int getLongueur() {
		return this.vec.length;
	}
	
	public static Vector Somme(Vector v1,Vector v2){
		if (v1.getLongueur() != v2.getLongueur()) return null; else {
			Vector s = new Vector(v1.getLongueur());
			for (int i=0;i<v1.getLongueur();i++) {
				s.vec[i]=v1.vec[i]+v2.vec[i];
			}
			return s;
		}
	}
	
	public double prodScal (Vector w)
	  { if (vec.length != w.vec.length) return 0. ;
	    double ps = 0. ;
	    for (int i=0 ; i<vec.length ; i++) ps += vec[i]*w.vec[i] ;
	    return ps ;
	  }
	
	private double [] vec;
	private int tn;
}
public class JF_57 {

	public static void main(String[] args) {
		Vector v1 = new Vector(4);
		v1.affiche();
		Vector v2 = new Vector(6,2.3);
		v2.affiche();
		double [] t1 = { 0.2,2.3,6.3,9.6};
		Vector v3 = new Vector(t1);
		v3.affiche();
		Vector v4 = Vector.Somme(v3, v2);
		if ( v4 != null ) v4.affiche();
		System.out.println("Prod acalaire : " + v1.prodScal(v2));
		
		
	}
}
