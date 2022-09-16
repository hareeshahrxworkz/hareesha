class Vichal 
{
	static double Tronsport(String Source ,String destination)
	{
		System.out.println("Vichal transport Source Destination");
		if(Source=="Banglore"&& destination=="Mysore")
		{
		return 180.5;
		}
		return 0.0;
	}
	
	static double Tronsport(String Source ,String destination , float ontime)
	{
		System.out.println("You are Entered in cource destination ontime");
		if(Source=="Banglore"&& destination=="Mysore"&&ontime==4.30f)
		{
			System.out.println("Entered values :"+Source+"  Destination value is  :"+destination+"  ontime is  :" +ontime);
			return 180.0;
		}
		return 0.0;
	}
	static boolean Tronsport(String destination)
	{
	System.out.println("You are entered destination ");	
	if(destination=="Belagavi")
	{
		System.out .println("Destination is  :"+destination);
		return true;
	}
	return false;
	}
	static boolean Tronsport(String destination,float ontime)
	{
		System.out.println("you are enteered destination and ontime ");
		if(destination=="Gulbarga"&& ontime==8.0f)
		{
			System.out.println("Entered is Destination :"+destination+ "   ontime is:"+ontime);
			return false;
		}
		return true;
	}
	static boolean Tronsport(float ontime)
	{
		System.out.println("you are entered ontime");
		if(ontime==4.0)
		{
			System.out.println("Entered Value is :"+ontime);
			return true;
		}
		return false;
	}
	
	
	
	
}