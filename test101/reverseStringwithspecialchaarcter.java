package Interview_Test;

public class reverseStringwithspecialchaarcter {

	public static void main(String[] args) {
		// “Sddfv123#%%+sdr133+%#sdff”
				String s = /*"ABCD"*/"Sddfv123#%%+sdr133+%#sdff";
				String r=" ";
				
				for (int i = 0; i < s.length(); i++) {
					String n=s.substring(0,7);
					if (i==7) {
						String n1=n+" ";
					}
					System.out.println(n1);
					}
				
//				for (int i = s.length()-1; i >=0 ; i--) {
//					 r=r+s.charAt(i);
//					 if (i>9&&i<13 && i>18&&i==21) 
//						
//					
//					 System.out.print(r + " ");
////					 System.out.println("");
////					 System.out.println(s.charAt(i));
//				}
//				System.out.println("  ");
//				if (s==r) {
//					System.out.println(s+"  "+r+" String is Palyndrom");
//				}
//				else {
//					System.out.print(s+" \n"+r+" String is not Palyndrom");
//				}

	}

}
