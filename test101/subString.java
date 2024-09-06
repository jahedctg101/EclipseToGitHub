package Interview_Test;

import java.util.Iterator;

public class subString {

	public static void main(String[] args) {
		String name="David Jones M";
		String space=" ";
		String [] nameSplit = name.split(space);
		int ln=nameSplit.length;
		System.out.println("Name Split Length is "+ln+"\n");
		for (int i = 0; i < nameSplit.length; i++) {
			String word=nameSplit[i];
			String firstLetter=word.substring(0, 1);
			if (i==2) {
				System.out.print(firstLetter);
				break;
			}
			System.out.print(firstLetter+".");
		}
		System.out.println("\n"+"********************");
		for (int i = 0; i < nameSplit.length; i++) {
			String word=nameSplit[i];
			String firstLetter=word.substring(0, 1);
			System.out.print(firstLetter+".");
		}
		

	}

}
