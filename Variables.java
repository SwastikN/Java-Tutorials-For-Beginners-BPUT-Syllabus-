// Local variables
public class Variables{

	int a; // not local variable

	Variables(){
		int b; // local variable
	}

	void show(){
		int c; // local variable
	}

	static{
		int d; // local variable
	}

	public static void main(String[] args) {
		int x;
		// System.out.println(x); // error
		x=10;
		System.out.println(x); // 10
		// System.out.println(Variables.x); // error
		// System.out.println(new Variables().x); // error

	}
}

// Static variables
public class Variables{
	static int a;

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(Variables.a);
		System.out.println(new Variables().a);
	}
}

class CallVar{
	public static void main(String[] args) {
		// System.out.println(a); // error
		System.out.println(Variables.a);
		System.out.println(new Variables().a);
	}
}

// Non-Static variables
public class Variables{
	int a;

	public static void main(String[] args) {
		// System.out.println(a); //error
		// System.out.println(Variables.a); // error
		System.out.println(new Variables().a);
	}
}

class CallVar{
	public static void main(String[] args) {
		// System.out.println(a); // error
		// System.out.println(Variables.a); // error
		System.out.println(new Variables().a);
	}
}

// Final variables
public class Variables{
	static final int x=10; // can be non-static but preferred static

	public static void main(String[] args) {
		// x=x+10; // error
		System.out.println(x);
	}
}

// Transient variables

// Volatile variables