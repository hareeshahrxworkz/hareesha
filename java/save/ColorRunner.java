class ColorRunner
{
	public static void main(String [] args)
	{
		System.out.println("main start agtha ede");
		
		Color.save("Red");
		Color.save("Green ");
		Color.save("Yellow");
		Color.save("Black");
		Color.save("White");
		Color.save("Orange");
		Color.save("Pink");
		Color.save("perple");
		
		

		Color.displayColors();
		boolean found=Color.find("Red");
		System.out.println("Finding colores is "+found);
		
	}
	
	
}