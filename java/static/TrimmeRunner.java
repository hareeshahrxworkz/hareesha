class TrimmeRunner
{
	public static void main(String [] args)
	{
		System.out.println("Exixting Trimmer detiles \n");
		System.out.println("this trimmer color is :"+Trimmer.color);
		System.out.println("trimmer Brand name is :"+Trimmer.brand);
		System.out.println("trimmer working or not working is :"+Trimmer.working);
		System.out.println("trimmer warranty is :"+Trimmer.warranty);
		System.out.println("trimmer settiong type length  is :"+Trimmer.totalSettings.length);
		for(int i=0;i<Trimmer.totalSettings.length;i++)
		{
			int set=Trimmer.totalSettings[i];
			System.out.println("Total setting in trimmer is :"+set);
		}
		
		 Trimmer.color="black";
         Trimmer.brand="LG";
        Trimmer.price=290;
       Trimmer.working=true;
       Trimmer.warranty=1;
		Trimmer.totalSettings[0]=3;
		Trimmer.totalSettings[1]=2;
		Trimmer.totalSettings[2]=5;
		Trimmer.totalSettings[3]=8;
		Trimmer.totalSettings[4]=7;
		Trimmer.totalSettings[5]=1;
		System.out.println("\n\n");
		System.out.println("updating  Trimmer detiles \n");
		System.out.println("this trimmer color is :"+Trimmer.color);
		System.out.println("trimmer Brand name is :"+Trimmer.brand);
		System.out.println("trimmer working or not working is :"+Trimmer.working);
		System.out.println("trimmer warranty is :"+Trimmer.warranty);
		System.out.println("trimmer settiong type length  is :"+Trimmer.totalSettings.length);
		for(int i=0;i<Trimmer.totalSettings.length;i++)
		{
			int set=Trimmer.totalSettings[i];
			System.out.println("Total setting in trimmer is :"+set);
		}
		
		
		
		
	}
}