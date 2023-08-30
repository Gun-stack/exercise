package first;

public class Operatortest1 {
	/*
	 단항연산자 :+ - (타입) ++ -- ~ !
	 이항연산자
	 산술 :+,-,*,/.%,<<,>>,>>>
	 비교 : >,<,<=,>=,== != *결과 :  True, false
	 논리 : && || [& ^ |]비트연산 
	 삼항연산자 : ? :
	 대입연산자 : =
	 마스킹데이터
	 */
	public static void main(String[] args) {
		int n=10;
		n++;//n=n+1
		System.out.println(n);
		++n;		
		System.out.println(n);

		int m =100;
		int res = ++m;	// 증가된 값을 반환하여 대입
		System.out.println(res);
		res= m++; // 증가되기 전 값을 반환하여 대입
		System.out.println(res);
		//System.out.println(m++);
		
		
		
		
		
	}
}
