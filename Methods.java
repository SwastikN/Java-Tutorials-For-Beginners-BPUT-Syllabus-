public class Methods{

	static void staticMethod(){
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		System.out.println("From Static Method\n----------");

		staticMethod();
		Methods.staticMethod();
		new Methods().staticMethod();

		// nonStaticMethod(); // error
		// Methods.nonStaticMethod(); // error
		new Methods().nonStaticMethod();

		// to check from non-static caller method
		new Methods().callerNonStaticMethod();
	}

	void nonStaticMethod(){
		System.out.println("Non-Static Method");
	}

	void callerNonStaticMethod(){
		System.out.println("\nFrom Non-Static Method\n----------");

		staticMethod();
		Methods.staticMethod();
		new Methods().staticMethod();

		nonStaticMethod();
		// Methods.nonStaticMethod(); // error
		new Methods().nonStaticMethod();
	}

	// final method
	static final void func(){

	}
}