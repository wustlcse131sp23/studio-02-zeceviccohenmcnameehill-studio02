package studio2;

public class Pi {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double onTargetProb = 0.785;
		double miss= 0;
		int totalSimulations = 0;
		double onTarget = 0;
		
		while (totalSimulations <= 1000000)
		{
			double prob = Math.random();
			if (prob < onTargetProb)
			{
				onTarget++;
				totalSimulations++;
			}
			else
			{
				miss++;
				totalSimulations++;
			}
		}
		double pi = (4*(onTarget/1000000));
		System.out.println(pi);
	}

}
