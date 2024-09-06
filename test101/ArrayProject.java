package Interview_Test;

public class ArrayProject {

	public static void main(String[] args) {
		
		/*
		 * 
		 * This is the assessment:
		Write a function and find a match that takes two arguments  
		A and B which are arrays with the same number of numbers. 
		Consider each element in A and its corresponding element in B. 
		The function returns the count of the number of 
		times that the two numbers differ by 5 or less but are not equal to each other 
		-please consider edge cases when providing the answer. 
		
		
		
		findMatch([1, 2, 3], [100, 4, 200]) = 1
		
		findMatch([1, 2, 3], [100, 4, 3]) = 1
		
		findMatch([1, 2, 3], [-1, 7, 5]) = 3
		
		 
		 */
		
		
		
		int a [] = {1,2,3};
		int b [] = new int[3]; 
		b[0] = 100;
		b[1] = 4;
		b[2] = 200;
		System.out.println(findMatch(a, b));
		
		b[0] = 100;
		b[1] = 4;
		b[2] = 3;
		System.out.println(findMatch(a, b));
		
		b[0] = -1;
		b[1] = 7;
		b[2] = 5;
		System.out.println(findMatch(a, b));
	}

	public static int findMatch(int a[], int b[]){
	    int count = 0;
	    for(int i=0;i<a.length;i++){
	        int diff = Math.abs(a[i]-b[i]);
	        if(diff>0 && diff<=5)
	           count++;
	    }
	    return count;
		
		
	}

}
