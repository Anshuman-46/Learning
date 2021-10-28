package Z;

public class Example2 {

	String name;
	private int serial;
	private int price;

	public Example2 (String s, int ns ,int np) {
		name= s;
		serial= ns;
		price = np;
	}
	
	public Example2 (int ns,int np) {
		
		serial = ns;
		price = np;
		
	}
	
	public Example2 (int np) {
		price = np;
	}
	
	public Example2 (String s,int np) {
		name = s;
		price = np;
	}
	
	public void setSerial(int n) {
		if (n>0 && n<=1000)
			 serial = n;
		else
			return;
	}
	
	public int getSerial() {
		return serial;
	}
	
	public void setPrice(int n) {
		if(n >= 30000 & n <= 45000)
			price = n;
		else
			return;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void print() {
		System.out.println(name+" :"+price+" :"+serial);
	}
	
}