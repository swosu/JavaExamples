package ch09Listing04;

public class SimpleTV {

	private boolean televisionPowerOn;
	private int channel;
	private int volume;

	public SimpleTV () {
		this.channel = 1;
		this.volume = 1;
	}

	public void turnOn() {
		this.televisionPowerOn = true;
	}

	public void setChannel(int nextChannel) {
		if(this.televisionPowerOn && 
				nextChannel >= 1 && 
				nextChannel <=120) {
			this.channel = nextChannel;	
		}

	}

	public void setVolume(int nextVolume) {
		if(this.televisionPowerOn && 
				nextVolume >= 1 && 
				nextVolume <=7) {
			this.volume = nextVolume;
		}
	}

	public void channelUp() {
		if (this.televisionPowerOn && channel < 120) {
			this.channel++;
		}
	}

	public void channelDown() {
		if (this.televisionPowerOn && channel > 1) {
			this.channel--;
		}
	}

	public void volumeUp() {
		if(this.televisionPowerOn && this.volume < 7)
		{
			this.volume++;
		}
	}
	
	public void volumeDown() {
		if(this.televisionPowerOn && this.volume > 1)
		{
			this.volume--;
		}
	}

	public int getChannel() {
		return this.channel;
	}

	public int getVolume() {
		return this.volume;
	}

	public void turnOff() {
		this.televisionPowerOn = false;
	}
}
