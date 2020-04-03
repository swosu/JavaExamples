package ch10ProgrammingPracticum;

public class OurParty {

	private int handshakeSum;
	private int partyGoerCount;
	private double oddsToShake;
	private double oddsToWantToTry;

	public OurParty(
			int constructionPartyGoers, 
			double constructionOddsToShake, 
			double constructionOddsToTry) {
		this.partyGoerCount = constructionPartyGoers;
		this.oddsToShake = constructionOddsToShake;
		this.oddsToWantToTry = constructionOddsToTry;
	}

	public int getPartySize() {
		return this.partyGoerCount;
	}

	public void mixer(int[][] shakeMatrix) {
		int tempHandshakeTracker;
		for(int individualIndex = 0; individualIndex < shakeMatrix.length; individualIndex++)
		{
			for(int partnerIndex = 0; partnerIndex < shakeMatrix.length; partnerIndex++)
			{
				if(individualIndex==partnerIndex)
				{
					tempHandshakeTracker = 0; // don't shake your own hand.
				} 
				else 
				{
					tempHandshakeTracker = handShakeAttempt();
				}

				shakeMatrix[individualIndex][partnerIndex] += tempHandshakeTracker;
				// cause if you shake my hand, I also shake yours...
				shakeMatrix[partnerIndex][individualIndex] += tempHandshakeTracker;
			}
		}
	}

	private int handShakeAttempt() {
		if(Math.random() < this.oddsToWantToTry )
		{
			// we attempt a shake
			if(Math.random() < this.oddsToShake)
			{
				// we had a successful shake
				return 1;
			}
		}
		return 0; // either no shake was attempted or the other person did not shake back.
	}

	public void printMatrix(int[][] shakeMatrix) {
		System.out.println("This matrix should be symmetric.");
		for(int individualIndex = 0; individualIndex < shakeMatrix.length; individualIndex++)
		{
			for(int partnerIndex = 0; partnerIndex < shakeMatrix.length; partnerIndex++)
			{
				System.out.print(shakeMatrix[individualIndex][partnerIndex] + ", ");
			}
			System.out.println();
		}
	}

	public void countHandshakes(int[][] shakeMatrix) {
		for(int individualIndex = 0; individualIndex < shakeMatrix.length; individualIndex++)
		{
			for(int partnerIndex = 0; partnerIndex < shakeMatrix.length; partnerIndex++)
			{
				this.handshakeSum += shakeMatrix[individualIndex][partnerIndex];
			}
		}
	}

	public void printHandshaekCount() {
		System.out.println("Our handshake sum was: " + this.handshakeSum);
		if(0==this.handshakeSum%2) 
		{
			System.out.println("This was an even count");
		} 
		else
		{
			System.out.println("We did not have an even count.");
		}
	}
}
