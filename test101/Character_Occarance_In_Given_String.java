package Interview_Test;

public class Character_Occarance_In_Given_String {

	public static void main(String[] args) {
		// count character Occurrence in a given String 
		
		String str = " I am learning Java";
		int result = str.length() - str.replaceAll("a", "").length();
		int result1 = str.length() - str.replaceAll("n", "").length();
		
		System.out.println("In given string \"a\" is occured : "+result);
		System.out.println("In given string \"n\" is occured : "+result1);

	}

}
