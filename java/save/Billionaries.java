class Billionaries
{
static int position=0;
static String [] billionaries={null,null,null,null,null,null,null,null,null,null};


	static void save(String billionar)
	{
		System.out.println("Save naditha Ede");
	if(position>10)
	{
		System.out.println("Array is Exeeded");
		return;
	}
	if(billionar!=null&&billionar.length()>4)
	{
		
		billionaries[position]=billionar;
		System.out.println("Saved Belinears name is :   "+billionar+"index of :  "+position);
		position++;	
	}
	else
	{
		System.out.println("input Billinearies name is less than 3 charactor or null");
	}
	
	}
	
	
	static boolean find(String name)
	{
		if(name!=null&&name.length()>3)
			
		for(int i=0;i<billionaries.length;i++)
		{
			String ref=billionaries[i];
			
			if(name==ref)
			{
				System.out.println("Billiners name found"+name);
				return true;
			}
		}
		return false;
	}
	
	
	static String update(int index ,String newName)
	{
		if(newName!=null&&newName.length()>3&&index>0)
		{
			for(int i=0;i<billionaries.length;i++)
			{
				String  find=billionaries[i];
				
				if(i==index)
				{
					billionaries[index]=newName;
					
					return newName;
				}
				
			
		
			}
			
		}
		else 
				{
					System.out.println("Cannot Update Name Because  name less then chareactor			"		);
				}
		return null;
		
	}
	
	
	static String delete(int index,String deleted)	
	{
		if(index>0&&deleted!=null)
		{
			for(int i=0;i<billionaries.length;i++)
			{
				String ref1=billionaries[i];
				
				if(ref1==deleted)
				{
					billionaries[i]=null;
					return deleted;
				}
				else 
				{
					System.out.println("Name is Not Available Cannot Deleted");
				}
				
			}
		}
		
		return null;
	}
	
	
	
	
}