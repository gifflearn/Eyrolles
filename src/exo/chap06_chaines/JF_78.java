package exo.chap06_chaines;

public class JF_78 
{ public static void main (String args[])
{ int nbArgs = args.length ;
int intArgs [] = new int[args.length];
int sum=0;
boolean boule;
if (nbArgs == 0) System.out.println ("pas d'arguments") ;
{ 
	for (int i=0 ; i<nbArgs ; i++) {
		System.out.println ("argument numero " + (i+1) + " = " + args[i]) ;
		intArgs[i] = Integer.parseInt(args[i]);
		sum += intArgs[i];
	}
	System.out.println("Somme = " + sum);
}
}
}