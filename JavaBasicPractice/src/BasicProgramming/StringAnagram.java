package BasicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringAnagram {
	
	public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {  
        List<Integer> result = new ArrayList<Integer>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<dictionary.size(); i++){
            char[] tempArray = dictionary.get(i).toCharArray();
            String sortedString = new String(tempArray); 
            dictionary.set(i, sortedString);
            if(map.containsKey(sortedString)){  
                int val = map.get(sortedString);
                map.put(sortedString, val+1);
            }else{
                map.put(sortedString, 1);
            }
        }
        for(int i=0; i<query.size(); i++){
            char[] tempArray = query.get(i).toCharArray();
            String sortedString = new String(tempArray);
            if(map.containsKey(sortedString)){
                result.set(i, map.get(sortedString));
            }else{
                result.set(i,0);
            }
        }       
        return result;
	}
	
	public static void main(String[] args) {
		
	}

}
