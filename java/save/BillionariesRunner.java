class BillionariesRunner
{
	
	public static void main(String args[])
	{
		
		Billionaries.save("Mukesh Ambani");
		Billionaries.save("Gautam Adani and family");
		Billionaries.save("Shiv Nadar");
		Billionaries.save("Cyrus Poonawalla");
		Billionaries.save("Radhakishan Damani");
		Billionaries.save("Lakshmi Mittal");
		Billionaries.save("Savitri Jindal and family");
		Billionaries.save("Kumar Birla");
		Billionaries.save(" Dilip Shanghvi");
		Billionaries.save("Uday Kotak");
		
		Billionaries.displayDetileas();
		
		boolean found=Billionaries.find("Mukesh Ambani");
		System.out.println(found);
		
		Billionaries.displayDetileas();
		
		String update=Billionaries.update(5,"Hareesha");
		System.out.println("updated name is:  "+update);
		
		Billionaries.displayDetileas();
		
		String del=Billionaries.delete(1,"Mukesh Ambani");
		
		System.out.println("Deleted name is :   "+del);
				Billionaries.displayDetileas();
		
	}
	
}