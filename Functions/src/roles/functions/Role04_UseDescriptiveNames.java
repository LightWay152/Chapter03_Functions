package roles.functions;

import java.util.Scanner;

public class Role04_UseDescriptiveNames {
	public static Scanner keyboardNumber;
	public static int numberA, numberB;

	public static void main(String[] args) {
		keyboardNumber = new Scanner(System.in);
		System.out.print("Enter number A: ");
		numberA = keyboardNumber.nextInt();
		System.out.print("Enter number B: ");
		numberB = keyboardNumber.nextInt();
		System.out.print("Greatest Common Divisor of "+numberA+" and "+numberB+" is: "+findGCD(numberA, numberB));
	}
	
	public static int findGCD(int firstNumber, int secondNumber){
		while(firstNumber != secondNumber){
			if(firstNumber > secondNumber) firstNumber = firstNumber - secondNumber;
			else secondNumber = secondNumber - firstNumber;
		}
		return (firstNumber);
	}

}
