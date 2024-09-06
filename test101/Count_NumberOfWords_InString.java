package Interview_Test;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.text.StrBuilder;

public class Count_NumberOfWords_InString {

	public static void main(String[] args) {
		// Count Number Of Words In Given String
		
		String str = "I am SDET SDET Automation Tester Tester Tester";
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		Integer count=1;
		String [] arr = str.split(" ");
		int arrSZ = arr.length;
		for (int i = 0; i < arrSZ; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i],count);				
			}
			else {
				map.put(arr[i], map.get(arr[i])+1);
			}
			
		}
		
		for(String x:map.keySet()) {
			System.out.println("The Count Of The Word Is :"+x+" = "+ map.get(x));
		}
		
		

	}

}










