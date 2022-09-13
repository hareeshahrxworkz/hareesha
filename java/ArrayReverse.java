class ArrayReverse
{
	public static void main(String[] args)
	{
		String[] originalArray={"bottele","size","brand","price","Weight","hight"};
		System.out.println("original array elements");
		for(int i=0;i<originalArray.length;i++)
		{
			String arr=originalArray[i];
		System.out.println(arr);
		}
		
		System.out.println("\n\n");
		System.out.println("Reverse order array element");
		for(int j=originalArray.length-1;j>=0;j--)
		{
			String rev=originalArray[j];
			System.out.println(rev);
		}
	}
}