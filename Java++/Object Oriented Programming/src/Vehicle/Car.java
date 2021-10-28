package Vehicle;

public abstract class Car extends Vehicle {

//	String color;		
//	int maxSpeed;		=> these are the properties which are common for car so don't create this here just
	
//	use "extends Vehicle" after car above
	
//	now just add your car specific properties
	
	boolean isConvertible;
	int numGears;
	
//	see the "vehicle use class"
	
	public void print_same() {
		System.out.println("car ");
		
		System.out.println("new\n");
		System.out.println("max speed"+getMax());
	}
	
//	--------------------------------------------------------------------------------------------------
//	if something we want to add on with car just use "super"
	
	public void print() {
		super.print();
		System.out.println("car convertibility : "+numGears);
	}

//	--------------------------------------------------------------------------------------------------

	public Car() {
		super(100);
	}
	
//	super/parent class called first then child even if only child is called
	public Car(int numGears) {
		
		super(numGears);  // now the value have been passed in parent class
//		or 
//		super(100);
//		for below use this
		
		this.numGears = numGears;	 // now vehicle class is having some input in it's new made constructor
//		but if we made the car as object it will made it also but it require an input from user but user can give input only for "car" class ...
//		as default constructor is overwrited :(
		
		System.out.println("to know car"); // whenever car object is being made then also the parent class object also made :)
	}
//	--------------------------------------------------------------------------------------------------
//	to solve abstract
	public boolean isMotorized() {
		return false; 
	}
}
