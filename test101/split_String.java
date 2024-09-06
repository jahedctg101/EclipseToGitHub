package Interview_Test;

import java.util.Iterator;

public class split_String {

	public static void main(String[] args) {
		String str = "Java,Selenium,Maven,Cucumber";
		String s[]=str.split(",");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		//Reverse split()
		System.out.println("\n");
		for (int i = s.length-1; i >=0; i--) {
			System.out.println(s[i]);
		}
		
		String s1 = "ABC";
		String s2 = "XYZ";
		String s3 = "PQR";
		
		//Concat different string into 1 string
		// Interview : concat method.
		String x = s1 + s2;
		String s4=s1.concat(","+s2+",").concat(s3);
		System.out.println(s4);
		
		// For experiment I separate concat string by "," and split the string
		String a[]=s4.split(",");
		for(String p:a) {
			System.out.println(p);
		}
		/*String y = x+s3;
		System.out.println(y);*/
		
		if (s1==s2) {
			System.out.println(s1+" s1 & "+s2+" s1 are Equal String");
		}
		else {
			System.out.println(s1+" s1 & "+s2 +" s2 are not Equal Sting");
		}

	}

}
