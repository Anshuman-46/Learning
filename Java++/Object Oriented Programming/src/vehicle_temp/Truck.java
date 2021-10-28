package vehicle_temp;
import Vehicle.Vehicle; // important o use out of package
public class Truck extends Vehicle {

	int maxLoadingCapacity;
	
	public void print() {
		System.out.println("Truck capacity : "+maxLoadingCapacity); // made within package
		System.out.println("Truck color : "+color ); // protected = default + sub_class(if any class is with "extend") 
//	    can't access if it is friendly/private
		System.out.println("Truck speed : "+getMax()); // it is a public function
	}
	
}
