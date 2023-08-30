class point implements Cloneable{
	int x;
	int y;
	point (int x, int y){
		this.x =x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "("+ x+","+y+")";
	}
	
	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {		}
		return obj;
	}
	
}
public class CloneTest1 {
	public static void main(String[] args) {
		point p= new point(10,20);
		System.out.println(p);
		p.x= 5;
		p.y = 10;
		Object obj = p.clone();
		point cp = (point)obj;
		System.out.println(cp);
		cp.x=10;
		cp.y=20;
		
		System.out.println(p);
		System.out.println(cp);	

		
		
		
		
		
	}
	
	
}
