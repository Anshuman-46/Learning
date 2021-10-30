package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String [] args) {
		
		ArrayList <Integer> list1 = new ArrayList<> ();
 		
		System.out.println(list1.size());  // give the size
		list1.add(1);	// add at last of array
		list1.add(12);	
		System.out.println(list1.size());  // give the size of array
		
		list1.add(0, 50);  //   index,element  
//	    element have been shifted to right : 50,1,12
		System.out.println(list1.size());

		System.out.println(list1.get(0)); // to get the number at "index"
		
		for(int i= 0 ;i < list1.size();i++)
			System.out.print(list1.get(i)+" ");
		
		list1.remove(0); // to remove element : no zero will be putted 
		System.out.println();
		System.out.println("for loop ");
		for (int i= 0 ; i < list1.size();i++)
			System.out.println(list1.get(i)+" ");
		
		System.out.println();
		System.out.println(list1.size());
		
		System.out.println("for each loop ");
		 for(int element : list1) {
			 System.out.println(element+" ");
		 }
		 
		 for(int el : list1) {
			 System.out.println(list1+" ");

		 }
		 
		 list1.add(621);
		 list1.add(8361);
		 for(int el : list1) {
			 System.out.println(list1+" ");
		 }
		 
		 System.out.println();
		 ArrayList <Integer>list2 = new ArrayList<> ();
		 
		 list2.add(12);
		 list2.add(13);
		 list2.add(14);
		 
		 for(int i= 0 ; i < list2.size() ; i++)
		 System.out.print(list2.get(i)+" ");
		 
		 System.out.println();
		 
		 for(int j : list2)
			 System.out.print(j + " ");
	
		
	}
}