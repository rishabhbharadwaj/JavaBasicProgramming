package StaticExamples;

public class StaticAndFinal {
	
	public static int x = 10;
	
	public static void main(String[] args) {
		x = 12;
		System.out.println(x); // static variable can be assigned to a new value
		final int y = 15;
		// y = 16;
		// but final variable can't be assigned to a new value.
		System.out.println(y);
	}
	
	
}
