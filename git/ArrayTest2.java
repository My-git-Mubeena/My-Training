class ArrayTest2
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5};//we can provide elements to array like this too
		//a=new int[5]; //if we are providing elements like above, no need to initialize using new operator.Since,we already initialized the array in above step
		System.out.println("Array ");
		for(int i=0;i<a.length;i++)//a.length will provide length of array a
		{
			System.out.println(a[i]);
		}
	}
}