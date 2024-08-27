package wrapperClass;

public class ConversionDemo1 {

	public static void main(String[] args) {
		int a = 10;
		String s1 = Integer.toString(a);
		System.out.println(s1);

		double d = 10.5d;
		String s2 = String.valueOf(d);
		System.out.println(s2);

		float f1 = 123.45f;
		String s3 = String.valueOf(f1);
		System.out.println(s3);

		String strInt = "123";
		int intValue = Integer.parseInt(strInt);
		System.out.println("String to int: " + intValue);

		String strFloat = "123.45";
		float floatValue = Float.parseFloat(strFloat);
		System.out.println("String to float: " + floatValue);

	}

}
