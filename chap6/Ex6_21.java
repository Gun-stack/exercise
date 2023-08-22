class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	void turnOnOff() {
		isPowerOn =! isPowerOn;
// (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
	}

	void volumeUp() {
		volume = volume < MAX_VOLUME ? volume +1 :MAX_VOLUME ;
		
	
	}

	void volumeDown() {
		volume = volume > MIN_VOLUME ? volume -1 :MIN_VOLUME ;
		// (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1감소시킨다.
	}

	void channelUp() {
		if(channel<MAX_CHANNEL) {
			channel += 1;
		}else {
			channel = MIN_CHANNEL;
		}
		// (4) channel의 값을 1증가시킨다.
		// 만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다.
	}

	void channelDown() {
		if(channel>MIN_CHANNEL) {
			channel -= 1;
		}else {
			channel = MAX_CHANNEL;
		}
		// (5) channel의 값을 1감소시킨다.
		// 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
	}
}

public class Ex6_21 {
	public static void main(String args[]) {
		MyTv t = new MyTv();
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		t.volume = 100;t.channel=100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
	}
}
