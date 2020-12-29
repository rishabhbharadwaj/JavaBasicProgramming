package BasicProgramming;

public class Binary {
	
	public static int solution(int N) {
		String[] binaryString = Integer.toBinaryString(N).split("");
		int start = 0;
		int end = 0;
		int gap = 0;
		for(int i=0; i<binaryString.length-1; i++) {
			int difference = 0;
			if (binaryString[i].equals("1")) {
				start = i;
				for(int j=i+1; j<binaryString.length; j++) {
					if(binaryString[j].equals("1")) {
						end = j;
						difference = end-start-1;
						start = j;
						if(difference > gap) {
							gap = difference;
						}
					}
				}
			}
		}
		return gap;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(32));
	}

}
