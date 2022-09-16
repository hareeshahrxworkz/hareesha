class VichalRunner
{
	public static void main (String[] Naveen)
	{
		System.out.println("Main class Vichal Runner is Running");
		double distance=Vichal.Tronsport("Banglore","Mysore");
		System.out.println("Banglore to Mysore Distance is :"+distance+"\n");
		
		double Km=Vichal.Tronsport("Banglore","Mysore",4.30f);
		System.out.println("Toatal km  is :"+Km+"\n");
		
		boolean reched=Vichal.Tronsport("Belagavi");
		System.out.println("Reached or not :"+reched+"\n");
		
		boolean time=Vichal.Tronsport("Gulbarga",8.0f);
		System.out.println("reached time is :"+time+"\n");
		
		boolean ontime=Vichal.Tronsport(4.0f);
		System.out.println("ontime reaches is :"+ontime+"\n");
		
		
		
	}
	
	
}