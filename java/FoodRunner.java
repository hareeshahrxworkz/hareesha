class FoodRunner
{
	public static void main(String[] Running)
	{
		String food1="Rice",food2="Lays",food3="Juice",food4="Apple",food5="Banana",food6="Chille",food7="Orange",food8="Pizza",food9="Burger",food10="Ricebath",food11="Biscates",food12="Ragi",food13="Bread";
		String[] foodArray={food1,food2,food3,food4,food5,food6,food7,food8,food9,food10,food11,food12,food13};
		System.out.println("total no of elements in an array:"+foodArray.length);
	
		for(int i=0;i<foodArray.length;i++)
		{
			System.out.println("The  food index "+ i +" is:"+foodArray[i]);
		}
		System.out.println("\n\n");
		for(int i=0;i<foodArray.length;i++)
		{			
			foodArray[3]="Biriyani";
			foodArray[7]="Sandwich";
			System.out.println("Updated  food index " + i +" is:"+foodArray[i]);
		}
		
		
		
	}
	
	
}