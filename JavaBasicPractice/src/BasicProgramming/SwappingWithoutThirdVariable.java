package BasicProgramming;

public class SwappingWithoutThirdVariable {
	
	public static void main(String[] args) {
		int x = 10, y = 20;
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println(x+" "+y);
	}

}
