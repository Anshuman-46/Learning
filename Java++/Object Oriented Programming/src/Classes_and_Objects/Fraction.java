package Classes_and_Objects;

public class Fraction {
	private int num;
	private int denom;

	public Fraction(int num,int denom) {
		this.num = num;
		this.denom = denom;
		simplify();
	}
	
	// private : noone from outside should have the right to access it
	private void simplify() {
		int gcd = 1;			// use gcd to solve it
		int smaller = (this.num < this.denom) ? num : denom; // Math.min(num,denom);
		for(int i = 2;i <= smaller; i++) {
			if(num % i == 0 && denom % i == 0) {
				gcd = i;
			}
		}
		
		num = num/gcd;
		denom = denom/gcd;
	}
	
	public void print() {
		if(denom == 1)
			System.out.println(num);
		
		else
			System.out.println(num+"/"+denom);
	}
	
	public int getNumerator() {
		return num;
	}
	
	public int getDenominator() {
		return denom;
	}
	
	public void setNumerator(int num) { // whenever someone changes numerator then simplified value should be assigned :)
		this.num = num;
		simplify(); // so use this
	}
	
//	this must be told : important to know what kind of exception can be "throws" :) 					

//	public void setDenominator(int denom) throws Exception
//	it doesn't make sense that if we show only "Exception", it should be like "ZeroDenominatorException"
	
	public void setDenominator(int denom) throws ZeroDenominatorException{ 
//								    here "throws"
		if(denom == 0) {
//			make new object class
			ZeroDenominatorException e = new ZeroDenominatorException ();  // message to be shown to user that he have done exception
			throw e;  // here is "throw" 
//		now this class have to be made
		}
		this.denom = denom;
		simplify();		// whenever someone changes denominator then simplified value should be assigned :)
	}
	
	public void add(Fraction f2) { // fraction f2 become a new object so for using it use f2.something
		this.num = this.num * f2.denom + f2.num * this.denom; // here "this" denotes f1 for whom it have called.
		this.denom = this.denom * f2.denom; 
		simplify();
	}
	
	public void multiply(Fraction f2) { // fraction f2 become a new object so for using it use f2.something
		this.num = this.num * f2.num;  // "this" is for clarity : for whom it have called
		this.denom = this.denom * f2.denom;
		simplify();
	}
	
//	 here fraction f1,fraction f2 names can be changed by any variable name
	
	public static Fraction addnew(Fraction t1,Fraction t2) { // static used for not changing f1,f2
//	here, return type is Fraction 		 	
			int newNum = t1.num * t2.denom + t2.num * t1.denom;  // f = f1 * f2
		 	int newDenom = t1.denom * t2.denom;
		 	Fraction f = new Fraction(newNum,newDenom); // called the constructor : it will simplify as it have simplify fuction
		 	return f;
	}
	
	// by me :
	public static Fraction divnew(Fraction f1,Fraction f2) { // f = f1 / f2;
		int newNum = f1.num * f2.denom;
		int newDenom = f1.denom * f2.num;
		Fraction f = new Fraction(newNum,newDenom);
		return f;	
	}
}