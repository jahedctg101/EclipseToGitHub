package Interview_Test;

public class printNumber {

	public static void main(String[] args) {
		/*
		 Q 1. Write a program that prints the numbers from 1 to 20. 
		For multiples of 3, print usb instead of the number and for multiples of 5, print device. 
		For numbers which are multiples of both 3 and 5, print usbdevice. 

		Print a new line after each string or number.
		 */

		for (int i = 1; i <=20; i++) {

			if (i%3==0 || i%5==0) {
				if(i%3==0 && i%5==0) {
					System.out.println("usbdevice");
				}
				else {
					if (i%3==0) {
						System.out.println("usb");
					}
					else{
						System.out.println("device");
					}
				}
			}
			else {
				System.out.println(i);
			}
		}
	}
}
