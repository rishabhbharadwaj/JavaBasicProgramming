package BasicProgramming;

public class CheckPrime {
	
	public static boolean checkPrime(int n){
        boolean result = true;
        if(n==2){
            result = true;
        }else if(n%2 == 0 || n<2){
            result = false;
        }else{
            for(int i=3; i<n/2; i+=2){
                if(n%i == 0){
                    result = false;
                    break;
                }else{
                    result = true;
                }
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(checkPrime(33));
	}

}
