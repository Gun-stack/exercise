package excself;


public class ex081 {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		// 4-1
		/*
		 * 1. 10<= i && i <=20 2. (ch==''||ch =='\t'||ch== '\n') 2. (ch!=''&& ch !='\t'
		 * && ch!= '\n') * 3. ch == 'x' || ch=='X' 4. '0'<= ch && ch <='9' 5. 'a' <= ch
		 * && ch <= 'z' || 'A'<=ch && ch<='Z' 6. year % 400 ==0 || year % 4==0 && year %
		 * 100!=0 7. boolean powerOn == false; !powerOn 8. String str ="no" ;
		 * (str.equals ("yes"))
		 */
		System.out.println("==================4-2");
		// 4-2
		int sum = 0;
		for (i = 1; i <= 20; i++) {
//			if (i % 2 != 0 && i % 3 != 0) {
//				sum += i;
//			}
			if (i % 2 == 0 || i % 3 == 0)
				continue;
			{
				sum += i;
			}
		}
		System.out.println(sum);
		// 4-2 답 : 73
		System.out.println("==================4-3");
		// 4-3
		sum = 0;
//		int sum1 = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//			sum1 += sum;
//		}
		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= i; j++) {
				sum += j;
			}
		}
		System.out.println(sum);

//		System.out.println(sum1);
		// 4-3 답 :220
		System.out.println("==================4-4");
		// 4-4
//		sum = 0;
//		 i = 1;
//		 j= -2;
//		while(true) {
//			i=i+2;
//			sum +=i;
//			if(sum>=100) break;
//			j=j-2;
//			sum +=j;
//		}
//		System.out.println(i);
		sum = 0;
		i = 0;
		for (i = 1;; i++) {
			if (i % 2 == 0)
				sum += -i;
			else
				sum += i;
			if (sum >= 100)
				break;

		}
		System.out.println("sum : " + sum + " i  : " + i);

		// 4-4 답 :199
		System.out.println("================4-5");
		// 4-5
		i = 0;
		while (i <= 10) {
			j = 0; ////// 와일문 바로위에 변수 선언 !!!!
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("================4-6");

		// 4-6
		i = 1;
		j = 1;
		for (i = 1; i <= 6; i++) {
			for (j = 1; j <= 6; j++) {
				if (i + j == 6) {
					System.out.printf("(%d,%d)", i, j);
				}
			}
		}
		// %d = int %s= string %f= double float

		// 4-6답 (1,5)(2,4)(3,3)(4,2)(5,1)
		System.out.println();
		System.out.println("================4-7");

		// 4-7
		i = 1;
		j = 1;
		int value = (int) (Math.random() * 6) + 1;
		System.out.println(value);
		System.out.println("================4-8");

		// 4-8

		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if (2 * x + 4 * y == 10) {
					System.out.printf("(x=%d,y=%d) ", x, y);
				}
			}
		}
		// 4-8답 x=1,y=2 x=3,y=1 x=5,y=0
		System.out.println();
		System.out.println("================4-9");
		// 4-9 .......int 나머지특성
		String str = "12345";// int 로 전환했다치고
//		int str1= 12345;
		sum = 0;
		for (i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
//		캐릭터 ('1'=49) -('0'=48)	=1 이나옴	
//			sum += str1 %10; // 맨 뒷자리 수 합
//			str1 = str1 /10; // 맨 뒷자리 버림	
			System.out.println(sum);
		}
		// 4-9 답 15
		System.out.println("================4-10");
		// 4-10
		int num = 12345;
		sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
			System.out.println(num);
			System.out.println(sum);
		}
		// 4-10 답 15 , 9랑 같음 나누면 0됨
		System.out.println("================4-11");
		// 4-11
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		// int summ = 0;

		System.out.print(num1 + "," + num2);
		System.out.println();
		for (i = 0; i < 8; i++) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.print("," + num3);
		}
		// 1,1
		// ,2,3,5,8,13,21,34,55
		System.out.println();
		System.out.println("================4-12");
		// 4-12
		int dan = 2;
		for (i = 0, dan = 2; i < 3; i++, dan += 3) {
			for (j = 1; j <= 3; j++) {
				for (int k = dan; k <= ((dan + 2 < 10) ? dan + 2 : 9); k++) {
					System.out.printf("%d x %d = %d\t", k, j, k * j);
				}
				System.out.println();
			}
			System.out.println();
		}
//		for (i = 1; i < 4; i++) {
//			for (j = 5; j < 8; j++) {
//				System.out.printf("%d x %d = %2d\t", j, i, j * i);
//			}
//			System.out.println();
//		}
//		System.out.println();
//		for (i = 1; i < 4; i++) {
//			for (j = 8; j < 10; j++) {
//				System.out.printf("%d x %d = %2d\t", j, i, j * i);
//			}
//			System.out.println();
//		} // 짜집기

		System.out.println("================4-13");
		// 4-13

		String value1 = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를 // 하나씩 읽어서 검사한다.
		for (i = 0; i < value1.length(); i++) {
			ch = value1.charAt(i);
			if (!('0' <= ch && ch <= '9')) {
				isNumber = false;
			}
		}
		if (isNumber) {
			System.out.println(value1 + "는 숫자입니다.");
		} else {
			System.out.println(value1 + "는 숫자가 아닙니다.");
		}

		System.out.println("================4-14");
////		// 4-14
//
//		int answer = (int) (Math.random() * 100)+1 ;
//		int input = 0; // 사용자입력을 저장할 공간
//		int count = 0; // 시도횟수를 세기위한 변수
//		// 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
//		java.util.Scanner scc = new java.util.Scanner(System.in);
//		do {
//			count++;
//			System.out.print("1과 100사이의 값을 입력하세요 :");
//			input = scc.nextInt(); // 입력받은 값을 변수 input에 저장한다.
//			if (input > answer) {
//				System.out.println("더 작은 수 ㄱ");
//			} else if (answer > input) {
//				System.out.println("더 큰 수 ㄱ");
//			} else {System.out.println("정답");break;}
//		}
//
//		while (true);
//		// 무한반복문
//		System.out.println(count + "번 만에 맞춤");

		System.out.println("================4-15");
		// 4-15

		int number = 12321;
		int tmp = number;
		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수
//		int sq = 4;
		while (tmp != 0) {
			result *= 10;
			result += tmp % 10;
			tmp = tmp / 10;
//			result += tmp%10*(int)(Math.pow(10, sq));
//			System.out.println(result);
//			tmp /=10;
//			sq--;
		}
		if (number == result)
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");

	}
}
