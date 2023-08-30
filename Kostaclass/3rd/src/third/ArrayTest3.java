package third;

public class ArrayTest3 {
	public static void main(String[] args) {
		int[]ball = new int [45]; 
		
		for(int i =0; i<ball.length; i++) {
			ball[i] = i+1 ;	
		}
	
		
		for(int i=0; i<1000; i++) {
			int idx1=(int)(Math.random()*45);
			int idx2=(int)(Math.random()*45);
		
			int tmp=ball[idx1];
			ball[idx1] = ball[idx2];
			ball[idx2] = tmp;
		}
		
		for(int i=0;i<6; i++) {
			System.out.print(ball[i]+",");
		}
	
	}
	
	
}
