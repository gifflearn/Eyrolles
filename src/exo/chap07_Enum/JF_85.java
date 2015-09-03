package exo.chap07_Enum;

import exo.chap07_Enum.JF_84.Suite;

public class JF_85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Suite [] tabsuit = Suite.values();
		System.out.println("Bbre de val : " + tabsuit.length);
		for (int i=0;i<tabsuit.length;i+=2) {
			System.out.println(tabsuit[i]);
		}
		System.out.println("Derniere : " +tabsuit[tabsuit.length-1]);
	}
enum Suite {ut,re,mi,fa,sol,la,si} // do est un mot clef
}