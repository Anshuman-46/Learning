package Classes_and_Objects;
import java.util.Scanner;
public class StudentUse {

	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
//		similar to this actually the students are made

// 		this is done by default/friendly constructor		
//		Student s1 = new Student();		
//		for s1 : memory is allocated and then it combine with Student class
//		syntax : className variable_name = new className (any input);
// 		it actually stored student address :
		
// 		if you want to have some input then made constructor but default will be replaced with that
		Student s1 = new Student("Anshuman",123);
//		now whenever any student is made they should have a name and rollNumber
	
//		Student s3 = new Student("Anshuman");  // if wants that at least they give name for making student
		Student s4 = new Student();    // if you want to set default rollNumber = 100;
//		 due to constructor
		
//		s3.print();  // for printing == made easy
		s4.print();
		
//		System.out.println(s1);  Classes_and_Objects.Student@30c7da1e == address

//		s1.setRollNumber(-123);
//		System.out.println(s1.name);           // just made a function in main class use s1.print(); 
// 		variable_name.property_to_use(assign_value);  == to use the fuctions 

//	    but in student we do not have made import some thing like in scanner
//    	because : if both classes are in the same package then no need to use
// 		see "temp" package for using it and importing it : import packageName.className;
		
		Student s2 = new Student("hello",123);
//		s2.setRollNumber(32);
//		System.out.println(s2.getRollNumber());
//		sc.nextInt() used in the scanner == similar to s2.getRollNumber()
		
//		System.out.println(s2.getRollNumber()); == this printing is painful then use function
		
		s1.print();
		s2.print();
		
//		s1.numStudent == 100; <= this can be done if that is not private 		
		System.out.println(Student.getnumStudent());
		
		
	}
}
