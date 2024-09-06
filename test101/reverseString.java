package Interview_Test;

public class reverseString {

	public static void main(String[] args) {
		String a="Madam";
		int sz=a.length();
		String r="";
		for (int i = sz-1; i >= 0; i--) {
			r=r+a.charAt(i);
			
//			System.out.println("r = "+r+" Index number = "+i+r.indexOf(i));
			
		}
		System.out.println(a);
		System.out.println(r);
		if (a.equalsIgnoreCase(r)) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("No Palindrom");
		}
	}

}
