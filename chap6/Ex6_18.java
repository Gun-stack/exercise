//
//public class Ex6_18 {
//
//	class MemberCall {
//		int iv = 10;
//		static int cv = 20;
//		int iv2 = cv;
//		static int cv2 = iv; // 라인 A 스태틱변수에 인스턴트 못씀
//
//		static void staticMethod1() { 
//			System.out.println(cv);
//			System.out.println(iv); // 라인 B 스태틱 매서드에 인스턴트 못씀 
//		}
//
//		void instanceMethod1() {
//			System.out.println(cv);
//			System.out.println(iv); // 라인 C 인스턴트 메소드에 둘다 가능
//		}
//
//		static void staticMethod2() {
//			staticMethod1();
//			instanceMethod1(); // 라인 D  스태틱 매소드에 인스턴드 메소드 됨
//		}
//
//		void instanceMethod2() {
//			staticMethod1(); // 라인 E 인스턴트 메소드에는둘다 가능
//			instanceMethod1();
//		}
//	}
//
//}
