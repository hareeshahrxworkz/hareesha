class GraduateDataOperator
{
	
	
	static int position=0;
	static String [] graduateName={null,null,null,null,null,null};
	
	static void save(String name)
	
	{
		System.out.println("save  naditha ede");
		
		graduateName[position]=name;
		
		System.out.println("Saved name is: "+name);
	position++;

	for(int i=0;i<graduateName.length;i++){
	System.out.println("Printing Array detiles "+graduateName[i]);}


	}
	
}