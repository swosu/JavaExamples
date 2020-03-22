package ch09Listing04;

public class Ch09Listing04 {

	public static void main(String[] args) {
		System.out.println("Hello.");

		SimpleTV tv1 = new SimpleTV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);

		SimpleTV tv2 = new SimpleTV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();

		System.out.println("tv1's channel is " + tv1.getChannel() 
		+ " and volume level is " + tv1.getVolume());

		System.out.println("tv2's channel is " + tv2.getChannel() 
		+ " and volume level is " + tv2.getVolume());

		tv1.setChannel(130);
		System.out.println("after bad attempt, tv1's channel is " 
				+ tv1.getChannel() 
				+ " and volume level is " + tv1.getVolume());

		tv2.setVolume(130);
		System.out.println("after bad attempt, tv2's channel is " 
				+ tv2.getChannel() 
				+ " and volume level is " + tv2.getVolume());

		tv1.setChannel(119);
		System.out.println("after limit attempt, tv1's channel is " 
				+ tv1.getChannel() 
				+ " and volume level is " + tv1.getVolume());
		tv1.channelUp();
		System.out.println("after bad attempt, tv1's channel is " 
				+ tv1.getChannel() 
				+ " and volume level is " + tv1.getVolume());
		
		tv1.setChannel(1);
		System.out.println("after limit attempt, tv1's channel is " 
				+ tv1.getChannel() 
				+ " and volume level is " + tv1.getVolume());
		tv1.channelDown();
		System.out.println("after bad attempt, tv1's channel is " 
				+ tv1.getChannel() 
				+ " and volume level is " + tv1.getVolume());
		
		tv2.setVolume(7);
		System.out.println("after limit attempt, tv2's volume is " 
				+ tv2.getVolume());
		tv2.volumeUp();
		System.out.println("after bad attempt, tv2's volume is " 
				+ tv2.getVolume());
		
		tv2.setVolume(1);
		System.out.println("after limit attempt, tv2's volume is " 
				+ tv2.getVolume());
		tv2.volumeDown();
		System.out.println("after bad attempt, tv2's volume is " 
				+ tv2.getVolume());


		tv1.turnOff();
		tv2.turnOff();

		System.out.println("Bye.");

	}

}
