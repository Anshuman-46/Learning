package Classes_and_Objects;
public class Student {
	
//	BEFORE MAKING ANY CLASS DECIDE :
//	1. DECIDE WHICH ARE PROPERTY IT SHOULD HAVE,  2. WHICH FUNCTIONALITIES IT SHOULD HAVE
//	3. WHICH PROPERTY WILL BE PUBLIC/DEFAULT/PRIVATE  4. WHICH MEMBER SHOUD BE FINAL
//	5. WHICH PROPERTY SHOULD BE NON-STATIC/STATIC    6. WHCIH "FUNCTION" IS STATIC/NON-STATIC
//	7. 	"IMPORTANT" == WHICH CONSTRUTOR IS REQUIRED 
	
//	properties of students are here : 	
	String name;
//	int rollNumber;  default/friendly can be used only within the package but out of package we can't use it like as in "temp"
//  public int rollNumber;  public = anywhere, even out of package

//  for using get and set function use private datatype	
	private final int rollNumber; // only in this class
//  but now the question is if only with the class then what is the use of making it ?	
//	now as a developer write this could then we can put some restriction like : if assign 0/-ve rollNumber then it can't be done etc ...

	
//	very interesting : static 
	
	private static int numStudent;  // to get how many students are made
//	static = it can be shared within any function/constructor : if it wouldn't be static then every student object will made its own value
//	so as no constructor can access other so we can't get the total number of students made.
//	but the good thing is that now it can be accessed by any constructor like as
//	s1.numStudent == s2.numStudent == Student.numStudent ::==> but among all only className.numStudent is better way
//	because if s1.numStudent then it seem like only for s1 :(
//  if it is not private then it can be access and even changed :( in "StudentUse" class also.
//  for not allowing anyone we have to make it private and made a function to get the numStudent
	
	public static int getnumStudent() {
		return numStudent;
	}
	
	
//	static is not used
	public int getRollNumber(){
		return rollNumber;  // to get rollNumber == s.getRollNumber();
	}
	
//	public void setRollNumber(int rn) {
//		if(rn <= 0)					// condition
//			return;					//  to set rollNumber == s.setRollNumber(813);
//		rollNumber = rn;
//	}
	
//	function to print : s1.print();  == no need to use System.out.println(); in use class that might be painful
	public void print () {
		System.out.println(name+" : "+rollNumber);
	}
	
//	---------------------------------------------------------------------------------------------------------
	
//	suppose if we want that whenever someone making a student object then they have to tell : name and rollNumber == i.e., constructor		
	
//	syntax : public class_name (things that must be in student){}
	public Student (String name,int rollNumber){ // if n = name, rn = rollNumber then if talk about name/rollNumber which is same as object names then here only local name can be accessed only
		this.name = name;					//  now the compiler is confused what to do ? local_variable == local_variable ???
									// now you can use "this.object_want_use"  == this is reference of object :)
//		System.out.println(this);  & System.out.println(this);		both will have same address
//		"this" = way to access object if you are in any constructor/function :)		
		this.rollNumber = rollNumber;   // custom constructor
		numStudent++;
	}
	
//	can have multiple constructor : if anyother constructor is made then default one will be replaced
	
//	public student () {				default constructor : automatically made in java
//		
//	}

//	once one constructor is made we can't call the same constructor again.	
	public Student () {
		rollNumber = 100;		// if you want to set default rollNumber = 100;
		numStudent++;
	}
	
//	public Student (String n) {
//		name = n;  // if wants that at least they give name for making student
//	}

//	---------------------------------------------------------------------------------------------------------
//	using final keyword : once a value is initialized it can't be reinitiasiled
	
//	private final int rollNumber = 100;  can be initialized at this also
//	and in each and every constructor : if final used then you have to declare value in "all" constructor == all will have rollNumber facility == must
//	even can't declare in any function :)
//  now no one can change value once initialized
}