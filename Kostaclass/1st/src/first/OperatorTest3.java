package first;

public class OperatorTest3 {
	public static void main(String[] args) {
		System.out.println(10/4); //같은타입으로변환시켜서 계산
		System.out.println(10/4.0); //하나만 실수타입으로 바꿔줌
		System.out.println((float)10/4); //둘중 큰 타입으로 자동형변환됨
		
		int kor =99, eng=88, math=100;
		int tot = kor+eng+math;
		float avg = tot/3.0f;
		
		System.out.println("총점 : "+tot);
		System.out.println("평균 : "+avg);
		
		int mod = 10%4;
		System.out.println(mod);
		
		byte a=10 ,b=20;
		byte c=(byte)( a + b) ;
		System.out.println(c);
	
		
		int i1 = 1000000;
		int i2 = 2000000;
		long res= (long)i1*i2;
		System.out.println(res);
		
		long l3 = 1000000l*1000000;
		System.out.println(l3);
		
		long i4 = 1000000*1000000L/100000;
		System.out.println(i4);
	}
}
