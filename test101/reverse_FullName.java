package Interview_Test;

public class reverse_FullName {

	public static void main(String[] args) {

		String MyName = "Mohiuddin Ahmed JAHED";
		
		String[] words=MyName.split(" ");
		String reverseString = " ";
		for(String w:words) {
			String reverseWords = " ";
			for (int i = w.length()-1; i>=0; i--) {
				reverseWords=reverseWords+w.charAt(i);
//				System.out.println(reverseWords);
			}
			reverseString=reverseString+reverseWords+" ";			
		}
		
		System.out.println("Original String is = "+MyName +"\n"+"Reverse String is ="+ reverseString);

	}//class

}//main
