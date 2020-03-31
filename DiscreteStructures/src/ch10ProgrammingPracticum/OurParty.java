package ch10ProgrammingPracticum;

public class OurParty {

	private int partyGoerCount;
	private double oddsToShake;
	private double oddsToWantToTry;
	private double rejectionPenalty;
	private double repeatPenalty;

	public OurParty(
			int constructionPartyGoers, 
			double constructionOddsToShake, 
			double constructionOddsToTry, 
			double constructionRejectionPenalty,
			double constructionRepeatPenalty) {
		this.partyGoerCount = constructionPartyGoers;
		this.oddsToShake = constructionOddsToShake;
		this.oddsToWantToTry = constructionOddsToTry;
		this.rejectionPenalty = constructionRejectionPenalty;
		this.repeatPenalty = constructionRepeatPenalty;
	}

	public int getPartySize() {
		return this.partyGoerCount;
	}

	public void mixer(boolean[][] shakeMatrix) {
		// TODO Auto-generated method stub
		
	}

}
