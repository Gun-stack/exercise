package chap5;

public class Ex5_12 {
	public static void main(String[] args) {
		// 3m 우물 바닥에 달팽이
		// 낮 동안 55 cm 올라옴
		// 밤에는 3cm 내려감
		// 우물나오는데 며칠 걸릴까요
		final int goal = 300;
		final int up = 55;
		final int down = -3;
		int height = 0;
		int days = 0;
		while (height < goal) {
			days++;
			height += up;
//			int to_goal = goal-height;
//			System.out.println("day : "+days +" height : "+height+" to goal : "+to_goal );
			if (height >= goal) {
				break;
			}
			height += down;
		}
		System.out.println(days);
		System.out.println(height);
	}
}
