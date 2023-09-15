package dailytask;
// *vowel or consonant in java *
// input a e i o u ---> vowel
// input b j m etc....
import java.util.Scanner;

public class Vowelandconsonant {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
char ch;
System.out.println("enter any character");
Scanner n = new Scanner(System.in);
ch = n.next().charAt(0);

if(ch== 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
{
	   System.out.print("vowel");
}      
else {
	System.out.print("consonant");
}
}
}