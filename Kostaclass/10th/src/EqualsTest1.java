//복소수
class Complex {
	int real;// 실수
	int imaginary; // 허수

	public Complex(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
		
	}
	@Override
	public String toString(/*int real, int imaginary*/) {
//		this.real=real;
//		this.imaginary = imaginary;
	 return real+"+"+imaginary+"i";
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Complex==false) {
			return false;
		}
		Complex c = (Complex)obj;
		return real==c.real && imaginary == imaginary;
	}

}

public class EqualsTest1 {

	public static void main(String[] args) {
		Complex c1 = new Complex(3, 5);
		Complex c2 = new Complex(3, 5);
		Complex c3 = new Complex(5, 3);

		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));

		System.out.println(c1.equals(c2));
		System.out.println(c1);
		System.out.println(c3);
	}

}
