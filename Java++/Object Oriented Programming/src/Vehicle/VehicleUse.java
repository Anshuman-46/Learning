package Vehicle;

public class VehicleUse{

	public static void main(String[] args) {

			Vehicle v = new Vehicle(13);
			
			v.print();
//			now just see the car class made
			
//			after that come here
			
//			use car :)
			
			Car c = new Car(12);
			
			c.color = "blue";  // not in class named "car" :)
//			c.maxSpeed = 100;   can't access now due to private
			
			c.setMax(621498);
			
			c.print(); // same name in car and vehicle
//			it will check first in car class
//			if not then only in vehicle class
			
//			Car cnew = new Car();  constructor has been changed
			c.print_same();
			
//			Vehicle vnew = new Vehicle(); constructor as been changed
			v.print_same();
			
//			even we can use variable made in "Vehicle" class in Car;
//			Car s1 = new Car();
			System.out.println("new here \n");
//			s1.print();
			
//	--------------------------------------------------------------------------------------------------

			Vehicle v1 = new Car(12); // polymorphism
			System.out.println();
			v1.print();
	}

}
