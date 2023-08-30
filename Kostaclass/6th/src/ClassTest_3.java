class tv{
	boolean power;
	int channel;
	int size= 50;
	
	void onOff() {
		power =! power; 
	}


	void channelUp() {
		channel ++;
	}
	void channerDown() {
		channel --;
		
	}

	String info() {
		return String.format("Size:%d, Channel:%d, power:%s", size,channel,(power)?"on":"off");
	}
}
public class ClassTest_3 {
	public static void main(String[] args) {
		tv tv= new tv();
		System.out.println(tv.info());
		tv.onOff();
		System.out.println(tv.info());
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		System.out.println(tv.info());
		tv.channerDown();
		tv.channerDown();
		System.out.println(tv.info());
		tv.onOff();
		System.out.println(tv.info());
	}
}
