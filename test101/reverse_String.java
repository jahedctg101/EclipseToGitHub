package Interview_Test;

public class reverse_String {

	public static void main(String[] args) {
		
		// “Sddfv123#%%+sdr133+%#sdff”
		String s = /*"ABCD"*/"Sddfv123#%%+sdr133+%#sdff";
		String r="";
		for (int i = s.length()-1; i >=0 ; i--) {
			 r=r+s.charAt(i);
			 if (i>9&&i<13 && i>18&&i==21) 
				 continue;
			 
			
			 System.out.print(r + " ");
//			 System.out.println("");
//			 System.out.println(s.charAt(i));
		}
		System.out.println("  ");
		if (s==r) {
			System.out.println(s+"  "+r+" String is Palyndrom");
		}
		else {
			System.out.print(s+" \n"+r+" String is not Palyndrom");
		}
	}

}
