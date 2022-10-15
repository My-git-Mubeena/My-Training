class ArrayTest1
{
	public static void main(String args[])
	{
		int a[]; //array decleration
		a=new int[5];//memory allocation for array
		/* start input for arrray */
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		/* end input for arrray */
		System.out.println("Array ");
		for (int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}