import java.io.File;

public class ExceptionTest7 {

	
	public static void main(String[] args) {
		
		File f= creatFile(args[0]);
		System.out.println(f.getName()+"파일이 생성됨");
	}
	
	
	static File creatFile(String filename) {
		try {
			if (filename==null||filename.length()==0) {
				throw new Exception("파일 이름이 유효하지 않음");
				
			}
		} catch (Exception e) {
				filename = "temp.txt";
			// TODO: handle exception
		}finally {
			File f =new File(filename);
			creatNenwFile(f);
			return f;
		}
	}
	
	static void creatNenwFile(File f) {
		try {
			f.createNewFile();
		} catch (Exception e) {
		}
	}
	
	
}
