package chap5;


public class Ex5_10 {
	public static void main(String[] args) {
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		String src = "abc123";
		String result = "";
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장

		
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			if ('a' <= ch && ch <= 'z') {
				result += abcCode[ch - 'a'];
			} else {
				result += numCode[ch - '0'];
			}
		}
		String retur = "" ;
		
		for (int i = 0; i < result.length(); i++) {
			char ch2 = result.charAt(i);
//			System.out.println(ch2);
			
			for (int j = 0; j < abcCode.length; j++) {
				if (ch2 == abcCode[j]) {
				retur +=(char)('a'+j);	
				}
			}
			for (int j = 0; j < numCode.length; j++) {
				if(ch2 == numCode[j]) {
					retur += (char)('0'+j);
				}
				
			}
		}
		
		
//		System.out.println(ch3);
		System.out.println("src:" + src);
		System.out.println("result:" + result);
		System.out.println("return:" +retur);
	}
}
