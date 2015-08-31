package exo.chap05_heritage;
class Point60
{ public void initialise (int x, int y) { this.x = x ; this.y = y ; }
  public void deplace (int dx, int dy)  { x += dx ; y += dy ; }
  public int getX() { return x ; }
  public int getY() { return y ; }
  private int x, y ;
}
class PointA60 extends Point60 {
	
	public void affiche() {
		System.out.println("Je suis un point de coordonnées x : " +getX() + " et y : " + getY());
	}
}
public class JF_60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PointA60 pp = new PointA60();
		pp.initialise(2, 3);
		pp.affiche();
		pp.deplace(3, 3);
		pp.affiche();
	}

}
