package Classes_and_Objects;

public class DynamicArray {

//	dynamic array can be used when we want to resize the array automatically 
//	like as in cart of amazon we can not restrict user to buy only 10/15 products 
//	or even can't say you have to buy 100 :(
	
//	it can be static too : it will be shared in all function and even used with incremented value
	private int nextIndex; // to point out the index where we have to put the element in array 
	private int data[];	// just array has been made to point somewhere but where it have not been decide.
	
//	constructor
	public DynamicArray () {
		data = new int[5]; // initially internal array of 5 will made
		nextIndex = 0; // start putting value from 0 that's why initially it is 0. 
	}
	
	public int size() { // just to know how many element have been added in array till now
		return nextIndex; // if lastElement putted is on 3 (let) then till now the size of array is itself is 3 i.e., nextIndex
						  // index work on -1 position but here nextIndex will incremented just after assigning value	
	}
	
	public void add(int element) {
		if(nextIndex == data.length) // means array made till now is full then made new array of bigger size
			restructure();
		
//		default work
		data[nextIndex] = element; // just to add the element on the nextIndex only : default work 
		nextIndex++;			   // incremented
	}
	
//	 noone is permitted to access it from outside :)
	private void restructure() { // now make new array of double size of the previous array
//	now just make the array of double size and copy all previous element to it 
//	use temp[] array to do so
		
		int temp [] = data; // now temp have all element of "data" array
		data = new int [data.length * 2]; // length is doubled of "data" array 
		
		for(int i=0;i < temp.length;i++)
			data[i] = temp[i]; // element is copied
	}

//	set is little bit interesting
	public void set(int index,int element) {
	if(index > nextIndex)  // if user want to put value at that index till which the array have not made till now 
		return;			// then return, no need to set value
	
	if(index < nextIndex) // if lesser then just assign the value
		data[index] = element;	// no issue
	
	else 				// if index == nextIndex , then user want to put element next to array made till now 
		add(element);	// called this because their might be chances that array is full then new bigger array will made in this function
						// and also if required new bigger array will made
	}
	
	public int get(int index) {
		if(index >= nextIndex)	{
			// TODO error out	
			return -1;  // means till this, element have not set till now
		}
		
		return data[index]; // else get the element
	}
	
	public boolean isEmpty() {
		if(size() == 0)
			return true;
		
		else
			return false;
	}
	
	public int removeLast() {
		if(size() == 0) {
			//TODO error out
			return -1;
		}
//		nextIndex is that value at which element have to put, before it all element have been filled
		int value = data[nextIndex - 1];	// here value is that which is just previous to nextIndex;
		data[nextIndex - 1] = 0;			// for removing set the element at zero 
		nextIndex--;				// nextIndex  - 1 : to decrease size, and ready to put element at this position
		return value;
	}
}