package BasicProgramming;

public class FrogJmp {
	
	public static void main(String[] args) {
		System.out.println(sol(10, 85, 30));
	}
	
	public static int sol(int X, int Y, int D) {
		if((Y-X)%D !=0) {
			return (Y-X)/D +1;
		}else {
			return (Y-X)/D;
		}
	}

}
