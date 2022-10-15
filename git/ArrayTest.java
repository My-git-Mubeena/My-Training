import java.util.Scanner;
class ArrayTest
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int i,n;
		System.out.println("Enter the limit");
		n = s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("value of i"+i);
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}