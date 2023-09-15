package dailytask2;

import java.util.Scanner;

/* Armstrong number program */
// input number 167 ---> (1*1*1 + 6*6*6 + 7*7*7 = 167)
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,arm=0,rem,c;
		System.out.print("enter any number ");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		c=n;
		
		while(n>0)
		{
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if(c==arm)
			System.out.print("Armstrong number");
		else
			System.out.print("not Armstrong number");
	}

}
