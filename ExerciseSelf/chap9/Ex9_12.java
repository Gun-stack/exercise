package chap9;

public class Ex9_12 {
	public static int getRand(int from, int to) {
		int min = Math.min(from, to);
		int max = Math.max(from, to);

		if (min>=0&&max>=0) {
			return(int)(Math.random()*(Math.abs(max-min)+1)+min);
		}
		else if (min<0&&max>0) {
			return(int)((Math.random()*(Math.abs(max-min)+2))+min-1);
		}
		else {
			return(int)((Math.random()*(Math.abs(max-min)+1))+min-1);

		}

	}

	/*
	 * (1) getRand메서드를 작성하시오.
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++)
			System.out.print(getRand(-4, 5) + ",");
		for (int i = 0; i < 20; i++)
			System.out.print(getRand(-4, -7) + ",");
		for (int i = 0; i < 20; i++)
			System.out.print(getRand(0, 5) + ",");
	}
}
