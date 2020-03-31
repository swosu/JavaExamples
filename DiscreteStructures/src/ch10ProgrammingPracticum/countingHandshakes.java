package ch10ProgrammingPracticum;

public class countingHandshakes {

	public static void main(String[] args) {

		
		OurParty tightParty = new OurParty(5,0.8,0.7,0.05,0.1);
		
		boolean[][] shakeMatrix = 
				new boolean [tightParty.getPartySize()][tightParty.getPartySize()];
		
		tightParty.mixer(shakeMatrix);

	}

}
