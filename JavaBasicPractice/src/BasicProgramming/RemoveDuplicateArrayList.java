package BasicProgramming;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateArrayList {
	
	public static void main(String[] args) {
		
		List<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7); 
        primes.add(7);
        primes.add(11);
        System.out.println("List is:" + primes);
        Set<Integer> withoutDuplicate = new LinkedHashSet<Integer>(primes);
        primes.clear();
        primes.addAll(withoutDuplicate);
        System.out.println("Now:" + primes);
		
	}

}
