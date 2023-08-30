
public class ExceptionTest4 {

	public static void method1() throws Exception {
		String string=null;
		try {
			System.out.println(string.toString());
		} catch (NullPointerException e) {
		
			System.out.println("method1 처리");
//			throw e;
			throw new Exception("예외다시생성");
		}

	}

	public static void main(String[] args) {
	try {
		method1();
	}catch (Exception e) {
//		System.out.println(e.getMessage());
		System.out.println("메인에서 처리");
	}
		System.out.println("메인나머지");
	}
	
}
