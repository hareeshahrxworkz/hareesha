class SportsRunner
{
	public static void main(String args[])
	{
		System.out.println("Main SportsRunner Start");
		String[] names={"Virat Kohili","Rohit Sharma","Rishab Phant","Hardik Pandya","KL Rahul","Sanju Samson","Jasprit Bumrah","MS Dhoni","Dinesh Karthik","Ravindra Jadeja"};
		
		Sports.cricketTeamMembers(names);
		
		System.out.println("Eng main class ");
		
			System.out.println("\n\n");
			
			int [] nos={01,02,03,04,05,06,07};
			
			
			Sports.kabbadiTeamMembersJerseyNos(nos);
			

			
			System.out.println("\n\n");
			
			double salaries[]={48.5d,35.2d,50.5d,45.5d,62.2d,26.6d,39.8d,19.4d,33.6d,48.7d};
			
			 Sports.FootBallTeamMembersSalary(salaries);

			
			System.out.println("\n\n");
			
			long [] num={9900775088l,9980302417l,9448903824l,9844537206l,7619403108l,7022532279l,8970382848l,9652034561l,7564352643l,7752364521l};
		
		Sports.ludoTeamMobileNumber(num);

		
		
		
		System.out.println("\n\n");
		
		
		int [] matches={4,2,6,3,4,5,3,4,6,1,7};
		Sports.hockeyTeamMembersNoOfMatches( matches);
		


		
		System.out.println("\n\n");
		
		
		long [] name={35818l,355l,213l,1684l,376l,244l,1264l,1268l,994l,374l};
		
		Sports.kokoTeamMembersCountryCode(name);

		System.out.println("\n\n");
		boolean [] live={true, false};
		Sports.lagoriTeamMembersAlive(live);

		System.out.println("Main SportsRunner End");

		
	}
	
	
	
	

	
}
