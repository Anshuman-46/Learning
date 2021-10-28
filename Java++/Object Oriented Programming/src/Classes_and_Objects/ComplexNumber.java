package Classes_and_Objects;

public class ComplexNumber {

	private int real;
	private int imaginary;
	
	public ComplexNumber(int real,int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void print() {
		if(imaginary == 0)
			System.out.println(real);
	
		if(real == 0)
			System.out.println(imaginary+"i");
		
		if(imaginary < 0)
			System.out.println(real+""+imaginary+"i");
		
		if(imaginary > 0)
			System.out.println(real+"+"+imaginary+"i");
	}
	
	public void setReal(int real) {
		this.real = real;
	}
	
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	
	public void add(ComplexNumber c) {
		this.real = this.real + c.real;
		this.imaginary = this.imaginary + c.imaginary;
	}
	
	public void multiply(ComplexNumber c2) {
		int tempReal = this.real;  // because once this.real is calculated then it is being used in calculating this.imaginary 
		int tempImag = this.imaginary;
		this.real = (tempReal * c2.real) - (tempImag * c2.imaginary);
		this.imaginary = (tempImag * c2.real) + (tempReal * c2.imaginary);
	}
	
//	very interesting : static 	
	public static ComplexNumber addnew(ComplexNumber c1,ComplexNumber c2) {
		int newReal = c1.real + c2.real;
		int newImaginary = c1.imaginary + c2.imaginary;
		ComplexNumber c = new ComplexNumber(newReal,newImaginary);
		return c;
	}
	// here we have to return a COMPLEXNUMBER : object
	public ComplexNumber conjugate() {
		int newReal = this.real;
		int newImaginary = -this.imaginary;
		ComplexNumber c = new ComplexNumber(newReal,newImaginary);
		return c;
	}
}