package first;

public class CastTest {
	public static void main(String[] args) {
		byte bt = 10;
		int i = bt; // 자동형변환

		// byte bt2 = i; Casting 캐스팅연산자
		byte bt2 = (byte) i;

		float f1 = 3.14f;
		double d = f1;
		int i2 = (int) f1; // 소숫점 잘림
		float f2 = (float) d;
		/*
		 * 자동형변환 byte(1) - short,char(2) - int(4) - long(8) - float(4) - double(8)
		 */
	}
}
