class student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal(){
		return kor+eng+math;
		
	}
	
	float getAverage() {
		float avg= (float)getTotal()/3;
		return Math.round(avg*10)/10.0f;
	}
	
	String info() {
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
	}
	
	
}


public class Ex6_2 {
	public static void main(String[] args) {
		student s = new student();
		s. name = "홍길동";
		s.ban = 1;
		s.no=1;
		s.kor=100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름 " + s.name);
		System.out.println("총점 " + s.getTotal());
		System.out.println("평균 " + s.getAverage());
		System.out.println(s.info());
		
		
	}

}
