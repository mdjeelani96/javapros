package dailytask;

import java.util.Scanner;

// read month number from the user and print the equivalent month name
public class Monthnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
System.out.print("enter month number");
Scanner r=new Scanner(System.in);
n=r.nextInt();
if(n==1) {
	System.out.print("jan = 31 days");
}
else if(n==2) {
	System.out.print("feb = 28 days");
}
else if(n==3){
System.out.print("march = 31 days");	
}
else if (n==4) {
	System.out.print("april = 30 days");
}
else if(n==5) {
	System.out.print("may = 31 days");
}
else if(n==6) {
	System.out.print("june = 30 days");
}
else if(n==7) {
	System.out.print("july = 31 days");
	}
else if(n==8) {
	System.out.print("aug = 31 days");
}
else if(n==9) {
	System.out.print("sep = 30 days");
}
else if(n==10) {
	System.out.print("oct = 31 days");
}
else if(n==11) {
	System.out.print("nov = 30 days");
}
else if(n==12) {
	System.out.print("dec = 31 days");
}
else {
	System.out.print("invalid month");
}
	}}
	
	
	