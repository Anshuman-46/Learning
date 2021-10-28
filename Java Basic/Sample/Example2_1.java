package Z;

public class Example2_1 {

	public static void main(String[] args) {

		Example2 a= new Example2("hp",3400);
		
		a.name="hp15";
		a.setSerial(1000);
		a.setPrice(34668);
		a.print();
		
		a.name="3294749";
		a.setPrice(52896);
		a.setSerial(234);
		a.print();
	}

}
