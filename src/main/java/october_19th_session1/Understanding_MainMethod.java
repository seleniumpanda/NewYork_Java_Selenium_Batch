package october_19th_session1;

public class Understanding_MainMethod {
	// Why is main method always static ?
	// Can I make the main method non static? What will happen ?
	// if I change the position of access modifier and static keyword in the main
	// method will it still work ?
	// can I change the access modifier of the main method ? - No
	// if I change the args to any other will it work? Ans - it will but it should not start with a numerical
	//replacing String[] with String... will it work ? Ans - yes it will work
	//keeping multiple dimensions[] [] will not work. It has to be [] one dimension only
	//cannot change the nomencleture of the main method. It has to be main only
	//can main method be overloaded ?
	

	public static void main(String[] args) {
		System.out.println("This is a simple main method");
		main(10);
		main(args = new String[3], args = new String[4]);

	}
	
	public static void main(int i) {
		System.out.println("This is a main method with integer i");
	}
	
	
	public static void main(String[] args1, String[] args2) {
		System.out.println("Main method with 2 String arrays");
	}

}
