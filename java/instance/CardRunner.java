class CardRunner
{
	public static void main(String args[])
	{
		System.out.println("main start agtha ede");
		Card.displayDetails();
		
		Card.type="Visiting Card";
		Card.height=2.5;
		Card.width=5.1;
		Card.price=3;
		String [] color={"red","pink","orange","yellow","green","blue","perple","gry","block","white"};
		Card.colors=color;
		
		Card.displayDetails();
		
				System.out.println("main mugitha  ede");

		
	}
	
}