package exo.chap01_opexp;

public class Float_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	float x = 1e30f;
	float y;
	y = x*x;
	System.out.println(x + " a pour carre : " + y);
	// division par zero
	float zero=0.f;
	float z = y/zero;
	System.out.println(y + " divisé par zero " + z);
	//
	y = 15;
	System.out.println(y + " divisé par zero " + z);
	float x1 = Float.POSITIVE_INFINITY;
	float x2 = Float.NEGATIVE_INFINITY;
	z = x1/x2;
	System.out.println(x1 + " / " + x2 + " = " + z);
	// NaN : Not a number
	}

}
