package Z;

public class Example1 {

	String name;
	private int roll;
	private int fees;
	
	public void setRoll(int n1) {
		if(n1<0)
			return ;
		roll = n1;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public void setFees(int n2) {
		if(n2>0 && n2 < 1000)
		fees = n2;
		
		else
			return;
	}
	
	public int getFees() {
		return fees;
	}
}
