package Interview_Test;

public class multiplyFull_Math {

	public static void main(String[] args) {
		// two Integer values
        int a = 367428, b = 1374;
        
        //apply Add method
        int add= Math.addExact(a, b);
        System.out.println("Addition : "+"\n"+ a + " + " + b + " = " + add);
  
        // apply multiplyFull method
        long c = Math.multiplyFull(a, b);
  
        // print result
        System.out.println("Multiplication : "+"\n"+a + " * "
                           + b + " = " + c+"\n");
        
        //Program 2: Multiplying two integers contains Integer.MAX values.
        
        // Java program to demonstrate
       // multiplyFull() method of Math class
          /* HAVE TO UNDERTAND */
        // two Integer values
        int a1 = Integer.MAX_VALUE;
        int b1 = Integer.MAX_VALUE;
        int a2 = Integer.MIN_VALUE;
        int b2 = Integer.MIN_VALUE;
        System.out.println("Max Value of a1 & b1 "+a1 +" "+b1+"\n");
        System.out.println("Min Value of a2 & b1 "+a2 +" "+b2);
        
  
        // apply multiplyFull method
        long c1 = Math.multiplyFull(a1, b1);
  
        // print result
        System.out.println(a1 + " * "
                           + b1 + " = " + c1);


	}

}
