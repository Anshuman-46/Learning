package Vehicle;

public abstract class Vehicle {

//	this is the parent class (common class) for class for car :)
	protected String color;
	private int maxSpeed; // can't access by "vehicleUse" and also in "Car"
	
	public void print() {
		System.out.println("color : "+color+"\nSpeed : "+maxSpeed);
	}
	
	public void setMax(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public int getMax() {
		return maxSpeed;
	}
	
//	if both "car" and "vehicle" have same named function then they will first check it their specific 
//	class after that in "parent = vehicle class"
	
//	all this shows that we can access "vehicle" from car
//	but not car from vehicle (if object made using vehicle constructor)
	
	public void print_same() {
		// TODO Auto-generated method stub
		System.out.println("vehicle");
	}
//	--------------------------------------------------------------------------------------------------

	public Vehicle(int maxSpeed) {
		System.out.println("to know about vehicle");
		
		this.maxSpeed = maxSpeed;
	}	
//	--------------------------------------------------------------------------------------------------
	
	public abstract boolean isMotorized();
	
	public abstract String CompanyName();
}