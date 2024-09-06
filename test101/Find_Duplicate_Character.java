package Interview_Test;

import java.util.HashMap;
import java.util.Map;

public class Find_Duplicate_Character {

	public static void main(String[] args) {
		// find duplicate characters
		
		String str = "Laptopp";
		
		int count = 1;
		char[] c = str.toCharArray();
		int cln = c.length;
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for (int i = 0; i < cln; i++) { 
			if (!map.containsKey(c[i])) { 
				map.put(c[i], count); //c(L,1) ; c(a,1);c(p,1);c(t,1);c(o,1);
			}
			else {
				map.put(c[i], map.get(c[i])+1);//c(p,2);// c(p,1+1) >> c(p,2)
			}
			
		}
		
		for(Character abc:map.keySet()) {
			if (map.get(abc)>1) {
				System.out.println("Duplicate character in given string : "+abc+" = "+map.get(abc));	
			}
			
		}

	}

}
