package Generics;

public class Vehicle {

	String company;
	
	public void print() implements printinterface{
		System.out.print(company);
		System.out.print(" ");
	}
	
}
