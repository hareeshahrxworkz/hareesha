class TempleDataOperator
{
	
	static int position=0;
	static String[] arrayName={null,null,null,null,null,null};
	
	static void save(String name)
	{
	
	System.out.println("save Start agtha ede index is:"+position);
	arrayName[position]=name;
	
	System.out.println("saved name is " +name+ "    at the position"+position);
	position++;
	}
	
	
	static void displayArrayName()
	{
	for(int i=0;i<arrayName.length;i++)
	{
	System.out.println("Printing Array detiles "+arrayName[i]);
	}
	
	
	}
}