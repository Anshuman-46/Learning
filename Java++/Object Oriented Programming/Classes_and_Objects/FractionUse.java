package Classes_and_Objects;

public class FractionUse {

	public static void main(String[] args) throws ZeroDenominatorException{
		temp();
	}

		public static void temp () throws ZeroDenominatorException{
		Fraction f1 = new Fraction(20,30);
		f1.print();
		// 2/3
		
		f1.setNumerator(12);
		// 4/1
		int d = f1.getDenominator();
		System.out.println(d); // 1
		f1.print();  //  4
		
		f1.setNumerator(10);
				
		try {
			f1.setDenominator(0);
		} 
		catch(ZeroDenominatorException e) {
			System.out.println("Hey, don't set denominator 0");
		}
		
		f1.setDenominator(0); // now use "throw exception"
		// 1/3
		f1.print();
		
		Fraction f2 = new Fraction(3,4);
		f1.add(f2);   // f1 = f1 + f2 :   static/non-static decide 
		f1.print();
		// f1 => 13/4
		f2.print();
		// f2 => 3/4
		
		Fraction f3 = new Fraction(4,5);
		f3.multiply(f2);//  f3 = f3 * f2
		f3.print();
		// f3 => 3/5
		f2.print();
		// f2 => 3/4
		
//		whenever we want to use any function from main class then and assign to new object do this: 
//		static :	className.fuctionName(_,_); == 	f1.addnew(); == f2.addnew();
		Fraction f4 = Fraction.addnew(f1,f3); // f4 = f1 + f3
//		it is static due to which Fraction.addnew() == f1.addnew(); == f2.addnew(); but the good way is to CALL AT : CLASS.ADDNEW();
//		because static can be accessed by any object and even it can accept other objects also.		
		f1.print(); // 13/12
		f3.print(); // 3/5
		f4.print(); // 101/60
		
		Fraction f11 = Fraction.divnew(f3,f4);
		System.out.println("here : ");
		f11.print();
		f3.print();
		f4.print();
	
}
}