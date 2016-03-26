public class TypeConversion{
	
	public static void main(String[] args) {
	
		int varInt=1;
		double varDouble=2.1;
		String varString="3";

		System.out.println(Double.valueOf(varInt)); // int to double
		System.out.println(String.valueOf(varInt)); // int to String

		System.out.println((int)varDouble); // double to int
		System.out.println(String.valueOf(varDouble)); // double to String

		System.out.println(Integer.parseInt(varString)); // String to int
		System.out.println(Double.parseDouble(varString)); // String to double

		// binary values are correct here
		short x=300; // 00000001 00101100
		byte y=(byte)x; // 00101100
		System.out.println(y); // 44
	}
}