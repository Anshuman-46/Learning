package temp;

public class Example <T>{
	
	T data;
	Example <T> next;
	
	Example (T data){
		this.data = data;
		next = null;
	}
	
}