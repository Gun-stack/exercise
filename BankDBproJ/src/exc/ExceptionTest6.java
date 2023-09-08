package exc;
import java.io.IOException;

public class ExceptionTest6 {

	static void method1() throws IOException, Exception {
		boolean flag = false;
		if (flag) {
			throw new IOException("입출력 예외");
		} else {
			throw new Exception("모든 예외");
		}
	}

	public static void main(String[] args) {
		try {
			method1();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//메인에서 예외처리함//

	}
}
