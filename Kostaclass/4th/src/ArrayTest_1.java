
public class ArrayTest_1 {
	public static void main(String[] args) {
		
		char[] hex= {'C','A','F','E','2','0','2','3'};
		
		String[] binary = { 
				"0000", "0001", "0010", "0011", //0,1,2,3
				"0100", "0101", "0110", "0111", //4,5,6,7 
				"1000", "1001", "1010", "1011",// 8,9,A(100),B(11)
				"1100", "1101", "1110", "1111",// C12,D13,E14,F15
		};
		
		String result = "";
		
		
		for (int i = 0; i < hex.length; i++) {
			char ch = hex[i];
			if(ch >= '0'&& ch<= '9') {
				result += binary[ch-'0'];
			}
			else {
				result += binary[ch-'A'+10];
			}
			//'A' => 10 = 65-'A'+10
			//'B' => 11 = 66-'A' +10
		}
		System.out.println(new String(hex));
		System.out.println("result : " +result);
	 } 
	//
	//Hex:CAFE2023
	//binary: 1100 , 1010, 1111, 1110, 0010,0000,0010,0011
}
