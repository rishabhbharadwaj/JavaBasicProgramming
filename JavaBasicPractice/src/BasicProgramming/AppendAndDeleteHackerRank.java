package BasicProgramming;

public class AppendAndDeleteHackerRank {
	
	static String appendAndDelete(String s, String t, int k) {
        String result = null;
        int breakPoint = 0;
        for(int i=0; i<Math.min(s.length(),t.length()); i++){
            if(s.charAt(i) != t.charAt(i)){
                breakPoint = i;
                break;
            }
        }
        int delete = s.substring(breakPoint).length();
        int append = t.substring(breakPoint).length();
        if(delete+append == k)
            result = "Yes";
        else if(delete+append < k){
            int leftOperations = k-delete-append;
            if(leftOperations%2 == 0)
                result = "Yes";
            else if(breakPoint == 0)
                result = "Yes";
            else
                result = "No";
        }
        else{
            result = "No";
        }
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(appendAndDelete("aaaaaaaaaa","aaaaa",7));
	}

}
