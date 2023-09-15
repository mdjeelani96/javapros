package dailytask2;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {2, 6, 8, 45, 23, 1, 35, 69};
int min = a[0]; //1
for (int i=1; i<a.length; i++) // 1 2 6 8
{
	if(a[i]<min) // 69<1
	{
		min=a[i]; //1
	}
}
System.out.println("minimum element array is : " +min);
	}}

