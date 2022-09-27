class MovieDataOperator
{
	static int position=0;
	static String [] movieDirectorName={null,null,null,null,null,null};
	
	static void save(String name)
	
	{
		System.out.println("save  naditha ede");
		
		movieDirectorName[position]=name;
		
		System.out.println("Saved name is: "+name);
	position++;
	
	}
	ststic void displayNames()
	{

	for(int i=0;i<movieDirectorName.length;i++){
	System.out.println("Printing Array detiles "+movieDirectorName[i]);}


	}
	
	
	
	
}