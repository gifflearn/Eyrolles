package exo.chap17_Collections;

import java.util.ArrayList;
import java.util.ListIterator;

class ListeTr {
	public ListeTr () {
		ltr= new ArrayList<String>();
	}
	public void ajou (String pelem){
		iter = this.ltr.listIterator();
		boolean added  = false;
		while (iter.hasNext() && !added) {
			if (iter.next().compareTo(pelem)>=0) {
				iter.previous();
				iter.add(pelem);
				added = true;break;
			}
		}
		if (!added) iter.add(pelem);;
	}
	public void affiche(){
		System.out.println(this.ltr);
	}
	private ArrayList<String> ltr;
	private ListIterator<String> iter;
}
public class JF_166 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ListeTr myList = new ListeTr();
		myList.ajou("C");myList.ajou("A");myList.ajou("V");myList.ajou("E");myList.ajou("B");myList.ajou("R");myList.ajou("B");
		myList.affiche();
		
		
	}

}
