package exo.chap05_heritage;
abstract class Figure71
{ abstract public void affiche() ;
  abstract public void homothetie (double coef) ;
  abstract public void rotation (double angle) ;

  public void homoRot(double coef,double angle) {
	  homothetie(coef);rotation(angle);
  }

  public static void afficheFigures(Figure71 [] tab1) {
	  for (int i=0;i<tab1.length;i++) { tab1[i].affiche();}
  }
  
  public static void homothetieFigures(Figure71 [] tab1,double coef) {
	  for (int i=0;i<tab1.length;i++) { tab1[i].homothetie(coef);}
  }
  
  public static void rotationFigures(Figure71 [] tab1,double angle) {
	  for (int i=0;i<tab1.length;i++) { tab1[i].rotation(angle);}
  }
  
}

class Point71 extends Figure71 {

		public void affiche() {}
		public void homothetie(double coef) {}
		public void rotation(double angle) {}
}


public class JF_71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
