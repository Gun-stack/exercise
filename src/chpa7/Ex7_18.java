package chpa7;

public class Ex7_18 {

//	public static void action(Robot robot) {
//		if (robot instanceof DanceRobot) {
//			DanceRobot db = (DanceRobot) robot;
//			db.dance();
//		}
//		else if (robot instanceof SingRobot) {
//			SingRobot sb = (SingRobot) robot;
//			sb.sing();
//		}
//		else if (robot instanceof DrawRobot) {
//			DrawRobot drb = (DrawRobot) robot;
//			drb.draw();
//		}
//
//	}

	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++)
			Robot2.action(arr[i]);
	} // main


}

class Robot {
}

 class Robot2{
	 static void action(Robot robot) {
		if (robot instanceof DanceRobot) {
			DanceRobot db = (DanceRobot) robot;
			db.dance();
		}
		else if (robot instanceof SingRobot) {
			SingRobot sb = (SingRobot) robot;
			sb.sing();
		}
		else if (robot instanceof DrawRobot) {
			DrawRobot drb = (DrawRobot) robot;
			drb.draw();
		}

	}


}
class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}
