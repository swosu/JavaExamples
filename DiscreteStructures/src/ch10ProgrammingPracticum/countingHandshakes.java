package ch10ProgrammingPracticum;

public class countingHandshakes {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		OurParty tightParty = new OurParty(5,0.8,0.7);
		int[][] tightPartyShakeMatrix = 
				new int [tightParty.getPartySize()][tightParty.getPartySize()];
		
		
		tightParty.mixer(tightPartyShakeMatrix);
		
		tightParty.printMatrix(tightPartyShakeMatrix);
		tightParty.countHandshakes(tightPartyShakeMatrix);
		tightParty.printHandshaekCount();
		
		OurParty corperateParty = new OurParty(50,0.08,0.07);
		int[][] corperatePartyShakeMatrix = 
				new int [corperateParty.getPartySize()][corperateParty.getPartySize()];
		
		
		corperateParty.mixer(corperatePartyShakeMatrix);
		
		corperateParty.printMatrix(corperatePartyShakeMatrix);
		corperateParty.countHandshakes(corperatePartyShakeMatrix);
		corperateParty.printHandshaekCount();
		System.out.println("Bye.");
	}

}
