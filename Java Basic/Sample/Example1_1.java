package Z;

import temp.temp1;

public class Example1_1 {

	public static void main(String[] args) {
		Example1 t = new Example1();
		
		t.name = "hello";
		t.setFees(999);
		t.setRoll(1);
		
		System.out.println(t.name);
		System.out.println(t.getRoll());
		System.out.println(t.getFees());
	}

}
