import java.util.LinkedList;
public class Default_LinkedList {

	public static void main(String [] args) {
		
		LinkedList <Integer> list1 = new LinkedList <> ();
		list1.add(12);
		list1.add(1);
		list1.add(7);
		System.out.println("size : "+list1.size());
		list1.add(0, 32);
		System.out.println(list1.get(0));
		
		list1.addFirst(122);
		list1.addLast(-113);
		
		System.out.println(list1.getFirst()+"  "+list1.getLast());
		
		System.out.print(list1.lastIndexOf(list1));
		
		System.out.println("list : ");
		for(int i = 0;i < list1.size(); i++)
			System.out.print(+list1.get(i)+" ");
 		
	}	
}