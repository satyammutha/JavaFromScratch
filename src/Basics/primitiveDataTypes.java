package Basics;

public class primitiveDataTypes {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * Integer types: byte, short, long, int
		 * Floating point types: float, double
		 * Character types: char
		 * Misc: var
		 */
		byte b = 1;
		short s= 1234;
		int i = 123456;
		long l = 1_000_000_000_000l;
		
		float f = 123.1f;
		double d = 123456.32165468;
		
		char c = 'a';
		var v = 999;
		
		d = f; //automatic type casting /implicit
		f = (float)d; // explicit type casting
		
		Integer i1 = i; //Auto-boxing(primitive data types into its equivalent Wrapper)
		int i2 = i1; //Un-boxing(Wrapper to Primitive)
		
	}

}
