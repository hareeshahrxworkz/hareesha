class PoliticanDataOperator
{
	
	
	static int position=0;
	static String [] politicianName={null,null,null,null,null,null};
	
	static void save(String name)
	
	{
		System.out.println("save  naditha ede");
		
		politicianName[position]=name;
		
		System.out.println("Saved name is: "+name);
	position++;

	for(int i=0;i<politicianName.length;i++){
	System.out.println("Printing Array detiles "+politicianName[i]);}


	}
	
}