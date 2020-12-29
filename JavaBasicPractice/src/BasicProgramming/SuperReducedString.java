package BasicProgramming;

public class SuperReducedString {
	
	public static void main(String[] args) {
		System.out.println(superReducedString("aaabccddd"));
	}
	
	static String superReducedString(String s) {
        StringBuffer sb = new StringBuffer(s);
        for(int i=1; i<sb.length(); i++) {
        	if(sb.charAt(i) == sb.charAt(i-1)) {
        		sb.delete(i-1, i+1);
        		i = 0;
        	}
        }
        if(sb.length() == 0){
            return "Empty String";
        }else{
            return sb.toString();
        }
    }
}
