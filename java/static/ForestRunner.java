class ForestRunner
{
	public static void main(String [] args)
	{
		System.out.println("Existing values\n");
		System.out.println("Forest Name is:"+Forest.name);
		System.out.println("Forest total area:"+Forest.totalArea);
		System.out.println("Forest type is:"+Forest.type);
		System.out.println("Forest region is:"+Forest.region);
		System.out.println("total length of array:"+Forest.primaryAnimals.length);
		for(int i=0;i<Forest.primaryAnimals.length;i++)
		{
		String animals=Forest.primaryAnimals[i];
		System.out.println("Forest Primary Animals "+i+"is:"+animals);
		}
	
	
	Forest.name="Baikunthapur Forest";
	Forest.totalArea=5000;
	Forest.type="National";
	Forest.region="West Bengal";
	Forest.primaryAnimals[0]="Monky";
	Forest.primaryAnimals[1]="Rabbit";
	Forest.primaryAnimals[2]="Snake";
	Forest.primaryAnimals[3]="Panda";
	Forest.primaryAnimals[4]="Gerafe";
	Forest.primaryAnimals[5]="Kolala";
	System.out.println("\n\n");
	System.out.println("Updated values");
		System.out.println("Forest Name is:"+Forest.name);
		System.out.println("Forest total area:"+Forest.totalArea);
		System.out.println("Forest type is:"+Forest.type);
		System.out.println("Forest region is:"+Forest.region);
		System.out.println("total length of array:"+Forest.primaryAnimals.length);
		for(int i=0;i<Forest.primaryAnimals.length;i++)
		{
		String animals=Forest.primaryAnimals[i];
		System.out.println("Forest Primary Animals "+ i  +" is:"+animals);
		}
	}
}