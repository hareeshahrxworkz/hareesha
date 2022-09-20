class Card
{
	static String type;
	static double height;
	static double width;
	static int price;
	static String [] colors;
	
	static void displayDetails()
	{
	System.out.println(type);
	System.out.println(height);
	System.out.println(width);
	System.out.println(price);
	
	if(colors!=null )
	{
			System.out.println("it is pointing to memory");
			
			for(int i=0;i<colors.length;i++)
				
			{
				String  ref=colors[i];
				System.out.println("array index: "+i+"  is:  "+ref);

			}
			
	}
	else
					System.out.println("it is not pointing to memory");
	
		
		
	}
	
}