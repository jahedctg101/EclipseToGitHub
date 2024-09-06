package Interview_Test;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayList_Reverse_String {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("GaglulBhai");
		name.add("SammyBhai");
		name.add("RashidBhai");
		name.add("EmranBhai");
		name.add("SadmanBhai");
		name.add("TamzidBhai");
		name.add("AlimBhai");
		
		int ln=name.size();
		System.out.println("ArrayList length is : "+ln +"\n");
//		for (int i = ln-1; i>=0; i--) {
//			String Rname=name.get(i);
//			System.out.println(Rname);
//		}
		
		for(String Rname:name) {
			System.out.println(Rname);
		}
		// Reverse String by HashSet
		System.out.println("\n"+"\" Hashmap can not reverse String"+"\n"+"HashMap do not follow Index to store"+"\n"+"and do not accept duplicate value \"");
		HashSet<String> name1 = new HashSet<String>();
		name1.add("GaglulBhai");
		name1.add("EmranBhai");
		name1.add("SadmanBhai");
		name1.add("TamzidBhai");
		name1.add("AlimBhai");
		name1.add("GaglulBhai");
		
		int ln1=name1.size();
		System.out.println("ArrayList length is : "+ln1 +"\n");
		for(String Rname:name1) {
			System.out.println(Rname);
		}

	}

}
