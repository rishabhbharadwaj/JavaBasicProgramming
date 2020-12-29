package BasicProgramming;

import java.util.*;

public class SubArray {
	
	public static void main(String[] args) {
		int [] arr = {1,2,1};
		int n = arr.length;
		Set<Integer> possibleSubset = new HashSet<Integer>(); 
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i!=j) {
					for(int k=0;k<n;k++) {
						if(j!=k && i!=k) {
							possibleSubset.add(arr[i]*100+ arr[j]*10+ arr[k]);
						}
					}
				}
			}
		}
		System.out.println(Collections.max(possibleSubset)+","+possibleSubset.size());
	}
}