package exo.chap06_chaines;
class PointN
{ public PointN (int x, int y, String nom)
  { this.x=x ; this.y=y ; this.nom =nom ;
  }
  public String toString()
  { 
	  String res = new String();
	  res = "Point nomme " + nom + " et de coordonnees " + x + " " + y;
	  return res;
  }
  private int x, y ;
  private String nom ;
}
public class JF_79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PointN a = new PointN (2,5,"origin");
		System.out.println("a = " + a);
	}

}
