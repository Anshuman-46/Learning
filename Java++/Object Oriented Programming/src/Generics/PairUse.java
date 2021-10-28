package Generics;

public class PairUse {

	public static void main(String[] args) {

		Pair <String,String> p = new Pair <> ("ab","cd");
		
		p.setfirst("dsvb");
		System.out.println(p.getfirst());
	
		Pair <Character,Integer> p1 = new Pair <>('a',12);
		
		Pair <Integer,Integer> p2= new Pair <> (1,2);
		System.out.println(p2.getsecond());
		
		int a = 10, b = 12 , c = 18;
		Pair <Integer,Integer> p4 = new Pair<> (a,b);
		
		Pair < Pair <Integer,Integer>, Integer > p3 = new Pair <> (p4,c); 
	
		System.out.println(p3.getfirst().getsecond());
	}
}