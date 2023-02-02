package studio2;

public class Ruin 
{

	public static void main(String[] args) 
	{
		
		double winChance = 0.7;
		int totalSimulations=1;
		int loss = 0;
		while (totalSimulations<=500)
		{
			int startAmount = 2;
			int localSimulations = 0;
			int winLimit = 10;
			while (0 < startAmount && startAmount < 10)
			{
				double prob = Math.random();
				if (prob < winChance)
				{
					startAmount+=1;
					
					localSimulations++;
					
				}
				else
				{
					startAmount-=1;
					
					localSimulations++;
					
				
				}
	
			}
			if (startAmount >= 10)
			{
				System.out.println("Simulation " + totalSimulations + ": " + localSimulations + " WIN");
		
			}
			if (startAmount == 0)
			{
				System.out.println("Simulation " + totalSimulations + ": " + localSimulations + " LOSE!");
				loss++;
		
			}
			System.out.println("Losses: " + loss + " Simulations: " + totalSimulations);
		totalSimulations++;
		}
		
		double ruinRate = (double) loss/totalSimulations;
		double a = ((1-winChance)/winChance);
		double expRuinRate = ((Math.pow(a, 2) - Math.pow(a, 10)))/(1-(Math.pow(a, 10)));
		System.out.println("Ruin Rate from Simulation: " + Math.round(ruinRate*100.0)/100.0 + " Expected Ruin Rate: " + expRuinRate);
	
		

	}

}
