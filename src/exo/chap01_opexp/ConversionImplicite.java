package exo.chap01_opexp;

public class ConversionImplicite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b1 =10,b2 =20;
		short p = 200;
		int n =500;
		long q = 100;
		float x = 2.5f;
		double y = 5.25;
		
		System.out.println("b1+b2 : " + ( b1+b2)); //int
		System.out.println("p+b1 : " + ( p+b1)); //int
		System.out.println("b1*b2 : " + ( b1*b2)); //int
		System.out.println("q+p*(b1+b2) : " + ( q+p*(b1+b2)));//long
		System.out.println("x+q*n : " + ( x+q*n));//float
		System.out.println("b1*q/x : " + ( b1*q/x));//float
		System.out.println("b1*q*2./x : " + ( b1*q*2./x));//double
		System.out.println("b1*q*2.f/x : " + ( b1*q*2.f/x));//float
	}

}
