package dailytask;

import java.util.Scanner;

public class Printlastdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number, power;
Scanner scanner = new Scanner(System.in);
System.out.println("enter a number: ");
number = scanner.nextInt();
power = (int) Math.log10(number);
System.out.println(power);
int LastDigit = number % 10;
int firstDigit = (int) (number / Math.pow(10, power));
System.out.println(LastDigit);
System.out.println(firstDigit);
int a = firstDigit * (int)Math.pow(10, power);
int b = number % a;
number = b /10;

number = (LastDigit * (int)Math.pow(10,  power) + number * 10 + firstDigit);
System.out.println(number);
	}

}
