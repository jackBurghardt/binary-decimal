import java.util.Scanner;
public class binaryCode {
	public static void main (String[]args) {
		Scanner keyboard = new Scanner (System.in);
	
		System.out.print("Type 1 to convert from decimal to binary and type 2 to convert binary to decimal");
		int i = keyboard.nextInt();
		if (i == 2) {
			
			System.out.print("What number do you want to make into a decimal number?");
			String number1 = keyboard.next();
			long n = 0;
			int number =0;
			int x = number1.length()-1;
			while (x >= 0) {
				 char digit = number1.charAt(x);
				 if (digit =='1') {
					n  += Math.pow(2, number);
				 }
				 number++;
		           x--;
			}
			System.out.print("ur number is " + n);
		}
		else {
			System.out.print("What number do you want to make into a decimal number?");
			long number = keyboard.nextLong();
	String binNum = "";
			while (number > 0) {
				long num = number % 2;
				binNum = binNum + num;
				number /= 2;
				
			}
			StringBuilder reversed = new StringBuilder(binNum).reverse();
			System.out.print("ur number is  " + reversed);
		}
		
	}
}  
//checking if i initialized the repo right
