package chpa7;

import java.util.Iterator;

class MyTv2 {
	boolean isPowerOn;
	int channel;
	int volume;
	public int preC ;
	int preC2 ;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		preC = this.channel ;
		this.channel =  channel;
	
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	void gotoPrevChannel() {
		preC2 = preC; 
		preC = this.channel;
		this.channel = preC2;
	}
	
	
	

}

public class Ex7_10 {
	public static void main(String args[]) {
		MyTv2 t = new MyTv2();
		t.setVolume(50);
		System.out.println("VOL:" + t.getVolume());
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		
		
	}
}
