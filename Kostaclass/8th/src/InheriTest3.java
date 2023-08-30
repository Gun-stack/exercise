class Parent{
	int n;
	//	Parent(){
//		System.out.println("parent()");
//	}
	Parent(int n) {
		this.n=n;
		System.out.println("parent(int n)");
	}
}
class child extends Parent{
	int m; 
	child() {
		super(0);
		System.out.println("child()");
	}
	child(int n,int m){
		super(n);    //부모생성자를 반드시 먼저 호출 시켜줘야 한다 
		this.m =m;
	}
}
public class InheriTest3 {
	public static void main(String[] args) {
//		Parent p= new Parent();
		child c = new child(10,20);// 부모 생성자를 호출하고 자식 생성자가 호출됨
	}
}
