package pack;

import java.sql.Date;

public/*접근제한자 Access modifier */ class ImportTest {
	public static void main(String[] args) {
		Myclass mc= new Myclass();
		mc.date = new Date(1);
		System.out.println(mc.date);
		
}
}
