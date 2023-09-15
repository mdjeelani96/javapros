package dailytask;

public class LastDigit {

	int last(int num) {
		int a=num%10;
		return a;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LastDigit l=new LastDigit();
int num =l.last(789084);
System.out.println(num);
	}

}
