
public class ExceptionTest3 {
	public static void main(String[] args) {
		try {
		throw new Exception("예외발생");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
