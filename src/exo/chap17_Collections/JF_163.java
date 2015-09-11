package exo.chap17_Collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class JF_163 {

	// Ordre normal
	public static void afficheOn1(ArrayList<Integer> pli){
		System.out.println("Methode affiche 1");
		for (Integer elem : pli) System.out.println(elem);
	}
	public static void afficheOn2(ArrayList<Integer> pli){
		System.out.println("Methode affiche 2");
		System.out.println(pli);
	}
	public static void afficheOn3(ArrayList<Integer> pli){
		System.out.println("Methode affiche 3");
		Iterator<Integer> iter = pli.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	public static void afficheOn4(ArrayList<Integer> pli){
		System.out.println("Methode affiche 4");
		for (int i=0;i<pli.size();i++) {
			System.out.println(pli.get(i));
		}
	}
	
	// Ordre inverse
	public static void afficheOi1(ArrayList<Integer> pli){
		System.out.println("Methode affiche Inverse 1");
		ListIterator<Integer> iter = pli.listIterator(pli.size());
		while (iter.hasPrevious()) {
			System.out.println(iter.previous());
		}		
	}
	
	public static void afficheOi2(ArrayList<Integer> pli){
		System.out.println("Methode affiche Inverse 2");
		for (int i=pli.size()-1;i>=0;i--) {
			System.out.println(pli.get(i));
		}
	}
	
	// Elément de rang pair
	public static void affichePair1(ArrayList<Integer> pli){
		System.out.println("Methode affiche Pair 1");
		Iterator<Integer> iter = pli.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
			iter.next();
		}
	}
	public static void affichePair2(ArrayList<Integer> pli){
		System.out.println("Methode affiche Pair 2");
		for (int i=0;i<pli.size();i+=2) {
			System.out.println(pli.get(i));
		}
	}
	// Remise à Zéro
	public static void Zero1(ArrayList<Integer> pli){
		System.out.println("Methode remise à zéro 1");
		for (int i=pli.size()-1;i>=0;i--) {
			if (pli.get(i)<0) pli.set(i, 0);
		}
	}
	public static void Zero2(ArrayList<Integer> pli){
		System.out.println("Methode remise à zéro 2");
		ListIterator<Integer> iter = pli.listIterator();
		while (iter.hasNext()) {
			if (iter.next()<0) iter.set(0);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> li = new ArrayList<Integer>();
		for (int i=0;i<10;i++)	li.add(i) ;
		li.add(-11);
		li.add(-54);
		// Ordre normal
		JF_163.afficheOn1(li);
		JF_163.afficheOn2(li);
		JF_163.afficheOn3(li);
		JF_163.afficheOn4(li);
		// ordre inverse 
		JF_163.afficheOi1(li);
		JF_163.afficheOi2(li);
		//Rang pair
		JF_163.affichePair1(li);
		JF_163.affichePair2(li);
		//remise à zero negatif
		JF_163.afficheOn2(li);
		JF_163.Zero1(li);
		JF_163.afficheOn2(li);
		li.add(-11);
		li.add(-54);
		JF_163.afficheOn2(li);
		JF_163.Zero2(li);
		JF_163.afficheOn2(li);
		//
		
	}

}
