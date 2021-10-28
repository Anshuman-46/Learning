package Classes_and_Objects;
// it is not even important to make class in eclipse of the name which you want to be the name of class 
// just use : public class name_of_your_wish {} 
public class Complex_ques {

	private int real;
	private int imaginary;
	
	public Complex_ques(int real,int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void print() {
		if(imaginary < 0)
			System.out.println(real+""+imaginary+"i");
		
		else
			System.out.println(real+" + "+imaginary+"i");
	}
	
	public static Complex_ques add(Complex_ques c1,Complex_ques c2) {
		int real = c1.real + c2.real;
		int imaginary = c1.imaginary + c2.imaginary;
		Complex_ques c = new Complex_ques(real,imaginary);
		return c;
	}
	
	public static Complex_ques multiply(Complex_ques c1,Complex_ques c2) {
//		int tReal =
		int real = (c1.real * c2.real) - (c1.imaginary * c2.imaginary);
		int imaginary = (c1.imaginary * c2.real) + (c1.real * c2.imaginary);
		Complex_ques c = new Complex_ques(real,imaginary);
		return c;
	}
}