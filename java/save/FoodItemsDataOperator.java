class FoodItemsDataOperator
{
	
	static int position=0;
	static String [] foodItemName={null,null,null,null,null,null};
	
	static void save(String name)
	
	{
		System.out.println("save  naditha ede");
		
		foodItemName[position]=name;
		
		System.out.println("Saved name is: "+name);
	position++;

	for(int i=0;i<foodItemName.length;i++){
	System.out.println("Printing Array detiles "+foodItemName[i]);}


	}
	
}