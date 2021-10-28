package Generics;

public class Pair <T,V> {
// it means compiler now know that you will tell later what 'T' is.

//  now just use Pair<String> p = new Par<String> ("a","b");
	private T first;
	private V second;
	
	public Pair(T first,V second) {
		this.first = first;
		this.second = second;
	}
	
	public T getfirst() {
		return first;
	}
	
	public void setfirst(T first) {
		this.first = first;
	}
	
	public V getsecond() {
		return second;
	}
	
	public void setsecond() {
		this.second = second;
	}
	
	
}
