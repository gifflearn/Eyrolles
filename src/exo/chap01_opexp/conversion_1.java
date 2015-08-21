package exo.chap01_opexp;

public class conversion_1 {

	
public static void main(String[] args) {
	
	byte b1 = 50,b2 = 100;
	int n;
	n = b1 *b2;
	
	System.out.println(b1 + "*" + b2 + " = "+n);
	
	//
	int n1 =100000, n2 = 200000;
	long p;
	p =n1*n2; // le produit calculé en int , il conduit à un dépassement
	System.out.println(n1 + "*" + n2 + " = "+ p);
	// Le résultat erroné est affecté à p  
}

}
