package Classes_and_Objects;

public class DynamicArrayUse {

	public static void main(String[] args) {

//		constructor
		DynamicArray d = new DynamicArray(); // here DyanmicArray: className in which their is just a default constructor 
//		here d is just a variable		
	
//		values can be differ 100 to 1000		
		for(int i = 0; i < 10;i++) // just a way of putting value automatically
			d.add(i+10); // "add" is function used to put value in array and add the number at last index
//		not declared the size but assigned 100 values to it
		
		System.out.println(d.size());  // just to know how many elements have been filled in array till now i.e., size of array
		
//		d.set(index,NewNumber);
		d.set(4,10); // to set value at a particular index
//		if user tell that position till which array not made then it will going to set anything
		
		System.out.println(d.get(3)); // to know which element is at particular index
		System.out.println(d.get(4));
		
		while(!d.isEmpty()) {
			System.out.println(d.removeLast()); // to remove the last element of DynamicArray formed till now
			System.out.println("size = "+d.size());
		}
	}

}
